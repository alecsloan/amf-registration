/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.amf.eventmonitor.service.impl;

import com.liferay.amf.eventmonitor.model.Tracker;
import com.liferay.amf.eventmonitor.service.base.TrackerLocalServiceBaseImpl;
import com.liferay.portal.kernel.dao.jdbc.DataAccess;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * The implementation of the tracker local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.amf.eventmonitor.service.TrackerLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TrackerLocalServiceBaseImpl
 * @see com.liferay.amf.eventmonitor.service.TrackerLocalServiceUtil
 */
public class TrackerLocalServiceImpl extends TrackerLocalServiceBaseImpl {
	
	public List<Tracker> getEvents(String eventType) throws SQLException {
		SimpleDateFormat dateTime = new SimpleDateFormat ("E, MMMM Y 'at' hh:mm:ss a");
		
		Connection conn = DataAccess.getConnection();

		Statement stmt = conn.createStatement();

		String sql = "SELECT auditEventId, clientIP, eventType, additionalInfo, Audit_AuditEvent.createDate, User_.screenName, User_.companyId, User_.userId, User_.screenName\n" + 
				"FROM lportal.Audit_AuditEvent\n" + 
				"LEFT JOIN lportal.User_ on Audit_AuditEvent.userId = User_.userId\n" + 
				"where eventType in ("+ eventType +") "
						+ "AND className = \"com.liferay.portal.kernel.model.User\";";
    
		ResultSet rs = stmt.executeQuery(sql);
		
		List<Tracker> eventList = new ArrayList<>();
		Tracker event = null;
		
		while (rs.next()) {
			event = createTracker(rs.getLong("auditEventId"));
			
			//If the event doesn't have a userId then its a registration
			if (rs.getLong("userID") == 0) {
				//Info for new users is stored in the additionalInfo column, so we need to parse the string to a map
				HashMap<String, String> newUser = stringToHash(rs.getString("additionalInfo"));
				
				event.setUserId(Long.parseLong(newUser.get("userId")));
				event.setUserName(newUser.get("screenName"));
				event.setEventType("REGISTRATION");
				event.setClientIP("0.0.0.0");
				
			}else {
				//Handle the singular case of the default user being created:
				if (rs.getString("eventType").equals("ADD")) {
					event.setEventType("REGISTRATION");
					event.setClientIP("0.0.0.0");
				} else {
					event.setEventType("LOGIN");
					event.setClientIP(rs.getString("clientIP"));
				}
				
				event.setUserId(rs.getLong("userId"));
				event.setUserName(rs.getString("screenName"));
			
			}
			event.setCompanyId(rs.getLong("companyId"));
			event.setCreateDate(rs.getTimestamp("createDate"));
			
			System.out.println(dateTime.format(event.getCreateDate()));
			
			eventList.add(event);
		}
		
		return eventList;
	}
	
	private HashMap<String, String> stringToHash(String s){
		s = s.replaceAll("[{}\"]","");
		String[] keyValuePairs = s.split(",");
		HashMap<String,String> newUser = new HashMap<String, String>(); 

		for(String pair : keyValuePairs)                        
		{
		    String[] entry = pair.split(":");
		    newUser.put(entry[0], entry[1]);    
		}
		
		return newUser;
	}
}