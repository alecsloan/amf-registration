create table EventMonitor_Tracker (
	uuid_ VARCHAR(75) null,
	userTrackerId LONG not null primary key,
	companyId LONG,
	userId LONG,
	screenName VARCHAR(75) null,
	modifiedDate DATE null,
	sessionId VARCHAR(75) null,
	remoteAddr VARCHAR(75) null,
	RemoteHost VARCHAR(75) null,
	userAgent VARCHAR(75) null
);