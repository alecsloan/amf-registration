package com.liferay.amf.eventmonitor.portlet.commands;



import com.liferay.amf.eventmonitor.constants.EventMonitorPortletKeys;
import com.liferay.amf.eventmonitor.model.Tracker;
import com.liferay.amf.eventmonitor.service.TrackerLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;

import java.sql.SQLException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;

/**
 * @author Liferay
 */
@Component(
		immediate = true,
		property = {
			"javax.portlet.name="+ EventMonitorPortletKeys.name,
			"mvc.command.name=tab"
		},
		service = MVCActionCommand.class
	)
	public class TrackerMVCActionCommand extends BaseMVCActionCommand {
	
		@Override
		public void doProcessAction(
				ActionRequest actionRequest, ActionResponse actionResponse)
			throws PortletException, SQLException {
			
			String eventType = ParamUtil.getString(actionRequest, "eventType");
			String eventClause = "'Login', 'ADD'";
			
			switch (eventType){
				case "LOGIN":
					eventClause = "'LOGIN'";
					break;
				case "ADD":
					eventClause = "'ADD'";
					break;
			}
			
			try {
				List<Tracker> eventList = TrackerLocalServiceUtil.getEvents(eventClause);
				
				actionRequest.setAttribute("events",eventList);
				
			}catch (Exception e) {
				System.out.println(e);
			}

			eventType = eventType.substring(0, 1).toUpperCase() + eventType.substring(1).toLowerCase();
			if (eventType.equals("Add"))
				eventType = "Registration";
			
			actionRequest.setAttribute("eventType", eventType);

			SessionMessages.add(actionRequest, "greetingMessage", "hi");
		}
		
		

	}
