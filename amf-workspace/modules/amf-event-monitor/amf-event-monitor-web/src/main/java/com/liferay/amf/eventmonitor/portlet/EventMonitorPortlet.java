package com.liferay.amf.eventmonitor.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.amf.eventmonitor.constants.EventMonitorPortletKeys;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author liferay
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.tools",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=amf-event-monitor",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.name="+ EventMonitorPortletKeys.name,
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class EventMonitorPortlet extends MVCPortlet {
}