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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Tracker}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Tracker
 * @generated
 */
@ProviderType
public class TrackerWrapper implements Tracker, ModelWrapper<Tracker> {
	public TrackerWrapper(Tracker tracker) {
		_tracker = tracker;
	}

	@Override
	public Class<?> getModelClass() {
		return Tracker.class;
	}

	@Override
	public String getModelClassName() {
		return Tracker.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("userTrackerId", getUserTrackerId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("screenName", getScreenName());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("sessionId", getSessionId());
		attributes.put("remoteAddr", getRemoteAddr());
		attributes.put("RemoteHost", getRemoteHost());
		attributes.put("userAgent", getUserAgent());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long userTrackerId = (Long)attributes.get("userTrackerId");

		if (userTrackerId != null) {
			setUserTrackerId(userTrackerId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String screenName = (String)attributes.get("screenName");

		if (screenName != null) {
			setScreenName(screenName);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String sessionId = (String)attributes.get("sessionId");

		if (sessionId != null) {
			setSessionId(sessionId);
		}

		String remoteAddr = (String)attributes.get("remoteAddr");

		if (remoteAddr != null) {
			setRemoteAddr(remoteAddr);
		}

		String RemoteHost = (String)attributes.get("RemoteHost");

		if (RemoteHost != null) {
			setRemoteHost(RemoteHost);
		}

		String userAgent = (String)attributes.get("userAgent");

		if (userAgent != null) {
			setUserAgent(userAgent);
		}
	}

	@Override
	public Tracker toEscapedModel() {
		return new TrackerWrapper(_tracker.toEscapedModel());
	}

	@Override
	public Tracker toUnescapedModel() {
		return new TrackerWrapper(_tracker.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _tracker.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _tracker.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _tracker.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _tracker.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Tracker> toCacheModel() {
		return _tracker.toCacheModel();
	}

	@Override
	public int compareTo(Tracker tracker) {
		return _tracker.compareTo(tracker);
	}

	@Override
	public int hashCode() {
		return _tracker.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _tracker.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new TrackerWrapper((Tracker)_tracker.clone());
	}

	/**
	* Returns the remote addr of this tracker.
	*
	* @return the remote addr of this tracker
	*/
	@Override
	public java.lang.String getRemoteAddr() {
		return _tracker.getRemoteAddr();
	}

	/**
	* Returns the remote host of this tracker.
	*
	* @return the remote host of this tracker
	*/
	@Override
	public java.lang.String getRemoteHost() {
		return _tracker.getRemoteHost();
	}

	/**
	* Returns the screen name of this tracker.
	*
	* @return the screen name of this tracker
	*/
	@Override
	public java.lang.String getScreenName() {
		return _tracker.getScreenName();
	}

	/**
	* Returns the session ID of this tracker.
	*
	* @return the session ID of this tracker
	*/
	@Override
	public java.lang.String getSessionId() {
		return _tracker.getSessionId();
	}

	/**
	* Returns the user agent of this tracker.
	*
	* @return the user agent of this tracker
	*/
	@Override
	public java.lang.String getUserAgent() {
		return _tracker.getUserAgent();
	}

	/**
	* Returns the user uuid of this tracker.
	*
	* @return the user uuid of this tracker
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _tracker.getUserUuid();
	}

	/**
	* Returns the uuid of this tracker.
	*
	* @return the uuid of this tracker
	*/
	@Override
	public java.lang.String getUuid() {
		return _tracker.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _tracker.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tracker.toXmlString();
	}

	/**
	* Returns the modified date of this tracker.
	*
	* @return the modified date of this tracker
	*/
	@Override
	public Date getModifiedDate() {
		return _tracker.getModifiedDate();
	}

	/**
	* Returns the company ID of this tracker.
	*
	* @return the company ID of this tracker
	*/
	@Override
	public long getCompanyId() {
		return _tracker.getCompanyId();
	}

	/**
	* Returns the primary key of this tracker.
	*
	* @return the primary key of this tracker
	*/
	@Override
	public long getPrimaryKey() {
		return _tracker.getPrimaryKey();
	}

	/**
	* Returns the user ID of this tracker.
	*
	* @return the user ID of this tracker
	*/
	@Override
	public long getUserId() {
		return _tracker.getUserId();
	}

	/**
	* Returns the user tracker ID of this tracker.
	*
	* @return the user tracker ID of this tracker
	*/
	@Override
	public long getUserTrackerId() {
		return _tracker.getUserTrackerId();
	}

	@Override
	public void persist() {
		_tracker.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tracker.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this tracker.
	*
	* @param companyId the company ID of this tracker
	*/
	@Override
	public void setCompanyId(long companyId) {
		_tracker.setCompanyId(companyId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_tracker.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_tracker.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_tracker.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the modified date of this tracker.
	*
	* @param modifiedDate the modified date of this tracker
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_tracker.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_tracker.setNew(n);
	}

	/**
	* Sets the primary key of this tracker.
	*
	* @param primaryKey the primary key of this tracker
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tracker.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_tracker.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the remote addr of this tracker.
	*
	* @param remoteAddr the remote addr of this tracker
	*/
	@Override
	public void setRemoteAddr(java.lang.String remoteAddr) {
		_tracker.setRemoteAddr(remoteAddr);
	}

	/**
	* Sets the remote host of this tracker.
	*
	* @param RemoteHost the remote host of this tracker
	*/
	@Override
	public void setRemoteHost(java.lang.String RemoteHost) {
		_tracker.setRemoteHost(RemoteHost);
	}

	/**
	* Sets the screen name of this tracker.
	*
	* @param screenName the screen name of this tracker
	*/
	@Override
	public void setScreenName(java.lang.String screenName) {
		_tracker.setScreenName(screenName);
	}

	/**
	* Sets the session ID of this tracker.
	*
	* @param sessionId the session ID of this tracker
	*/
	@Override
	public void setSessionId(java.lang.String sessionId) {
		_tracker.setSessionId(sessionId);
	}

	/**
	* Sets the user agent of this tracker.
	*
	* @param userAgent the user agent of this tracker
	*/
	@Override
	public void setUserAgent(java.lang.String userAgent) {
		_tracker.setUserAgent(userAgent);
	}

	/**
	* Sets the user ID of this tracker.
	*
	* @param userId the user ID of this tracker
	*/
	@Override
	public void setUserId(long userId) {
		_tracker.setUserId(userId);
	}

	/**
	* Sets the user tracker ID of this tracker.
	*
	* @param userTrackerId the user tracker ID of this tracker
	*/
	@Override
	public void setUserTrackerId(long userTrackerId) {
		_tracker.setUserTrackerId(userTrackerId);
	}

	/**
	* Sets the user uuid of this tracker.
	*
	* @param userUuid the user uuid of this tracker
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_tracker.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this tracker.
	*
	* @param uuid the uuid of this tracker
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_tracker.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TrackerWrapper)) {
			return false;
		}

		TrackerWrapper trackerWrapper = (TrackerWrapper)obj;

		if (Objects.equals(_tracker, trackerWrapper._tracker)) {
			return true;
		}

		return false;
	}

	@Override
	public Tracker getWrappedModel() {
		return _tracker;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _tracker.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _tracker.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_tracker.resetOriginalValues();
	}

	private final Tracker _tracker;
}