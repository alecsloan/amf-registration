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
		soapModel.setUserTrackerId(model.getUserTrackerId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setScreenName(model.getScreenName());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setSessionId(model.getSessionId());
		soapModel.setRemoteAddr(model.getRemoteAddr());
		soapModel.setRemoteHost(model.getRemoteHost());
		soapModel.setUserAgent(model.getUserAgent());

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
		return _userTrackerId;
	}

	public void setPrimaryKey(long pk) {
		setUserTrackerId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getUserTrackerId() {
		return _userTrackerId;
	}

	public void setUserTrackerId(long userTrackerId) {
		_userTrackerId = userTrackerId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getScreenName() {
		return _screenName;
	}

	public void setScreenName(String screenName) {
		_screenName = screenName;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getSessionId() {
		return _sessionId;
	}

	public void setSessionId(String sessionId) {
		_sessionId = sessionId;
	}

	public String getRemoteAddr() {
		return _remoteAddr;
	}

	public void setRemoteAddr(String remoteAddr) {
		_remoteAddr = remoteAddr;
	}

	public String getRemoteHost() {
		return _RemoteHost;
	}

	public void setRemoteHost(String RemoteHost) {
		_RemoteHost = RemoteHost;
	}

	public String getUserAgent() {
		return _userAgent;
	}

	public void setUserAgent(String userAgent) {
		_userAgent = userAgent;
	}

	private String _uuid;
	private long _userTrackerId;
	private long _companyId;
	private long _userId;
	private String _screenName;
	private Date _modifiedDate;
	private String _sessionId;
	private String _remoteAddr;
	private String _RemoteHost;
	private String _userAgent;
}