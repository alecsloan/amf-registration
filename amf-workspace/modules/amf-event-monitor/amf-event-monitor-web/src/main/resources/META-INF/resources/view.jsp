<%@ include file="/init.jsp" %>

<%= renderRequest.getAttribute("GREETER_MESSAGE") %>


<p>
	<liferay-portlet:actionURL name="track" var="trackURL" />
	<aui:form action="<%= trackURL %>" method="post" name="fm">
	<aui:input name="name" type="text" />

	<aui:button-row>
		<aui:button type="submit"></aui:button>
	</aui:button-row>
</aui:form>
</p>