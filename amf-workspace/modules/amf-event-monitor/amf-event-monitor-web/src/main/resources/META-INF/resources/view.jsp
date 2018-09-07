<%@ include file="/init.jsp" %>

<% 
String eventType = (String)renderRequest.getAttribute("eventType");

%>
<liferay-portlet:actionURL name="tab" var="tabURL" />

<aui:form action="<%= tabURL %>" method="post" name="fm" cssClass="eventForm">
	<aui:button type="submit" cssClass="event ALL" value="All" onClick="setHidden('ALL')"/>
	<aui:button type="submit" cssClass="event ADD" value="Registration" onClick="setHidden('ADD')"/>
	<aui:button type="submit" cssClass="event LOGIN" value="Login" onClick="setHidden('LOGIN')"/>	
	<aui:input type="hidden" cssClass="eventType" name="eventType" value="test" />
</aui:form>
<c:if test="${eventType == null}">
Please select an option above.
</c:if>
<c:if test="${eventType != null}">
Currently Viewing: ${eventType}
<p>
	<liferay-ui:search-container delta="20" emptyResultsMessage="No Registration/Login Data Found." total="${events.size()}">
	
		<liferay-ui:search-container-results results="${events}"/>
		<liferay-ui:search-container-row className="com.liferay.amf.eventmonitor.model.Tracker" keyProperty="auditEventId" modelVar="event">
			<liferay-ui:search-container-column-text name="Event Date-Time" value="${event.createDate}" />
			<liferay-ui:search-container-column-text name="User" value="${event.userName} (${event.userId})" />
			<liferay-ui:search-container-column-text name="IP" value="${event.clientIP}" />
			<liferay-ui:search-container-column-text name="Event" value="${event.eventType}" />
		</liferay-ui:search-container-row>
		<liferay-ui:search-iterator />
	</liferay-ui:search-container>
</p>
</c:if>

<aui:script>
		
	function setHidden(event){

		try{
			document.getElementsByClassName(event)[0].classList.add("disabled");
		}catch(error){
			
		}
		document.getElementsByClassName('eventType')[0].value = event;
		
	}
</aui:script>