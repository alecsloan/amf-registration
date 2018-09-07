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

package com.liferay.amf.eventmonitor.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.amf.eventmonitor.model.Tracker;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Tracker in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Tracker
 * @generated
 */
@ProviderType
public class TrackerCacheModel implements CacheModel<Tracker>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TrackerCacheModel)) {
			return false;
		}

		TrackerCacheModel trackerCacheModel = (TrackerCacheModel)obj;

		if (auditEventId == trackerCacheModel.auditEventId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, auditEventId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", auditEventId=");
		sb.append(auditEventId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", clientIP=");
		sb.append(clientIP);
		sb.append(", eventType=");
		sb.append(eventType);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Tracker toEntityModel() {
		TrackerImpl trackerImpl = new TrackerImpl();

		if (uuid == null) {
			trackerImpl.setUuid(StringPool.BLANK);
		}
		else {
			trackerImpl.setUuid(uuid);
		}

		trackerImpl.setAuditEventId(auditEventId);
		trackerImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			trackerImpl.setCreateDate(null);
		}
		else {
			trackerImpl.setCreateDate(new Date(createDate));
		}

		trackerImpl.setUserId(userId);

		if (userName == null) {
			trackerImpl.setUserName(StringPool.BLANK);
		}
		else {
			trackerImpl.setUserName(userName);
		}

		if (clientIP == null) {
			trackerImpl.setClientIP(StringPool.BLANK);
		}
		else {
			trackerImpl.setClientIP(clientIP);
		}

		if (eventType == null) {
			trackerImpl.setEventType(StringPool.BLANK);
		}
		else {
			trackerImpl.setEventType(eventType);
		}

		trackerImpl.resetOriginalValues();

		return trackerImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		auditEventId = objectInput.readLong();

		companyId = objectInput.readLong();
		createDate = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		clientIP = objectInput.readUTF();
		eventType = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(auditEventId);

		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		if (clientIP == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(clientIP);
		}

		if (eventType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(eventType);
		}
	}

	public String uuid;
	public long auditEventId;
	public long companyId;
	public long createDate;
	public long userId;
	public String userName;
	public String clientIP;
	public String eventType;
}