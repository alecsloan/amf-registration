create table EventMonitor_Event (
	uuid_ VARCHAR(75) null,
	auditEventId LONG not null primary key,
	companyId LONG,
	createDate DATE null,
	userId LONG,
	userName VARCHAR(75) null,
	clientIP VARCHAR(75) null,
	eventType VARCHAR(75) null
);

create table EventMonitor_Tracker (
	uuid_ VARCHAR(75) null,
	auditEventId LONG not null primary key,
	companyId LONG,
	createDate DATE null,
	userId LONG,
	userName VARCHAR(75) null,
	clientIP VARCHAR(75) null,
	eventType VARCHAR(75) null
);