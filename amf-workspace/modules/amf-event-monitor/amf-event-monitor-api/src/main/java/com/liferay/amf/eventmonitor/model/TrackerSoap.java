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

package com.liferay.amf.eventmonitor.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.amf.eventmonitor.service.http.TrackerServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.amf.eventmonitor.service.http.TrackerServiceSoap
 * @generated
 */
@ProviderType
public class TrackerSoap implements Serializable {
	public static TrackerSoap toSoapModel(Tracker model) {
		TrackerSoap soapModel = new TrackerSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setAuditEventId(model.getAuditEventId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setClientIP(model.getClientIP());
		soapModel.setEventType(model.getEventType());

		return soapModel;
	}

	public static TrackerSoap[] toSoapModels(Tracker[] models) {
		TrackerSoap[] soapModels = new TrackerSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TrackerSoap[][] toSoapModels(Tracker[][] models) {
		TrackerSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TrackerSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TrackerSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TrackerSoap[] toSoapModels(List<Tracker> models) {
		List<TrackerSoap> soapModels = new ArrayList<TrackerSoap>(models.size());

		for (Tracker model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TrackerSoap[soapModels.size()]);
	}

	public TrackerSoap() {
	}

	public long getPrimaryKey() {
		return _auditEventId;
	}

	public void setPrimaryKey(long pk) {
		setAuditEventId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getAuditEventId() {
		return _auditEventId;
	}

	public void setAuditEventId(long auditEventId) {
		_auditEventId = auditEventId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public String getClientIP() {
		return _clientIP;
	}

	public void setClientIP(String clientIP) {
		_clientIP = clientIP;
	}

	public String getEventType() {
		return _eventType;
	}

	public void setEventType(String eventType) {
		_eventType = eventType;
	}

	private String _uuid;
	private long _auditEventId;
	private long _companyId;
	private Date _createDate;
	private long _userId;
	private String _userName;
	private String _clientIP;
	private String _eventType;
}