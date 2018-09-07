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
		attributes.put("auditEventId", getAuditEventId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("clientIP", getClientIP());
		attributes.put("eventType", getEventType());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long auditEventId = (Long)attributes.get("auditEventId");

		if (auditEventId != null) {
			setAuditEventId(auditEventId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		String clientIP = (String)attributes.get("clientIP");

		if (clientIP != null) {
			setClientIP(clientIP);
		}

		String eventType = (String)attributes.get("eventType");

		if (eventType != null) {
			setEventType(eventType);
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
	* Returns the client ip of this tracker.
	*
	* @return the client ip of this tracker
	*/
	@Override
	public java.lang.String getClientIP() {
		return _tracker.getClientIP();
	}

	/**
	* Returns the event type of this tracker.
	*
	* @return the event type of this tracker
	*/
	@Override
	public java.lang.String getEventType() {
		return _tracker.getEventType();
	}

	/**
	* Returns the user name of this tracker.
	*
	* @return the user name of this tracker
	*/
	@Override
	public java.lang.String getUserName() {
		return _tracker.getUserName();
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
	* Returns the create date of this tracker.
	*
	* @return the create date of this tracker
	*/
	@Override
	public Date getCreateDate() {
		return _tracker.getCreateDate();
	}

	/**
	* Returns the audit event ID of this tracker.
	*
	* @return the audit event ID of this tracker
	*/
	@Override
	public long getAuditEventId() {
		return _tracker.getAuditEventId();
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

	@Override
	public void persist() {
		_tracker.persist();
	}

	/**
	* Sets the audit event ID of this tracker.
	*
	* @param auditEventId the audit event ID of this tracker
	*/
	@Override
	public void setAuditEventId(long auditEventId) {
		_tracker.setAuditEventId(auditEventId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tracker.setCachedModel(cachedModel);
	}

	/**
	* Sets the client ip of this tracker.
	*
	* @param clientIP the client ip of this tracker
	*/
	@Override
	public void setClientIP(java.lang.String clientIP) {
		_tracker.setClientIP(clientIP);
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

	/**
	* Sets the create date of this tracker.
	*
	* @param createDate the create date of this tracker
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_tracker.setCreateDate(createDate);
	}

	/**
	* Sets the event type of this tracker.
	*
	* @param eventType the event type of this tracker
	*/
	@Override
	public void setEventType(java.lang.String eventType) {
		_tracker.setEventType(eventType);
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
	* Sets the user ID of this tracker.
	*
	* @param userId the user ID of this tracker
	*/
	@Override
	public void setUserId(long userId) {
		_tracker.setUserId(userId);
	}

	/**
	* Sets the user name of this tracker.
	*
	* @param userName the user name of this tracker
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_tracker.setUserName(userName);
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