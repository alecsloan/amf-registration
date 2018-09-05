package com.liferay.amf.eventmonitor.portlet.commands;



import com.liferay.amf.eventmonitor.constants.EventMonitorPortletKeys;
import com.liferay.amf.eventmonitor.service.TrackerLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Liferay
 */
@Component(
		immediate = true,
		property = {
			"javax.portlet.name="+ EventMonitorPortletKeys.name,
			"mvc.command.name=track"
		},
		service = MVCActionCommand.class
	)
	public class TrackerMVCActionCommand extends BaseMVCActionCommand {
	
		@Override
		public void doProcessAction(
				ActionRequest actionRequest, ActionResponse actionResponse)
			throws PortletException {

			String name = ParamUtil.get(actionRequest, "name", "");

			System.out.println(TrackerLocalServiceUtil.addTracker());
					
						
			System.out.println("Hello " + name);

			String greetingMessage = "Hello " + name + "! Welcome to OSGi";

			actionRequest.setAttribute("GREETER_MESSAGE", greetingMessage);

			SessionMessages.add(actionRequest, "greetingMessage", greetingMessage);
		}
		
		

	}
