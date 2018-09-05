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

		if (userTrackerId == trackerCacheModel.userTrackerId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, userTrackerId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", userTrackerId=");
		sb.append(userTrackerId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", screenName=");
		sb.append(screenName);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", sessionId=");
		sb.append(sessionId);
		sb.append(", remoteAddr=");
		sb.append(remoteAddr);
		sb.append(", RemoteHost=");
		sb.append(RemoteHost);
		sb.append(", userAgent=");
		sb.append(userAgent);
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

		trackerImpl.setUserTrackerId(userTrackerId);
		trackerImpl.setCompanyId(companyId);
		trackerImpl.setUserId(userId);

		if (screenName == null) {
			trackerImpl.setScreenName(StringPool.BLANK);
		}
		else {
			trackerImpl.setScreenName(screenName);
		}

		if (modifiedDate == Long.MIN_VALUE) {
			trackerImpl.setModifiedDate(null);
		}
		else {
			trackerImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (sessionId == null) {
			trackerImpl.setSessionId(StringPool.BLANK);
		}
		else {
			trackerImpl.setSessionId(sessionId);
		}

		if (remoteAddr == null) {
			trackerImpl.setRemoteAddr(StringPool.BLANK);
		}
		else {
			trackerImpl.setRemoteAddr(remoteAddr);
		}

		if (RemoteHost == null) {
			trackerImpl.setRemoteHost(StringPool.BLANK);
		}
		else {
			trackerImpl.setRemoteHost(RemoteHost);
		}

		if (userAgent == null) {
			trackerImpl.setUserAgent(StringPool.BLANK);
		}
		else {
			trackerImpl.setUserAgent(userAgent);
		}

		trackerImpl.resetOriginalValues();

		return trackerImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		userTrackerId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		screenName = objectInput.readUTF();
		modifiedDate = objectInput.readLong();
		sessionId = objectInput.readUTF();
		remoteAddr = objectInput.readUTF();
		RemoteHost = objectInput.readUTF();
		userAgent = objectInput.readUTF();
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

		objectOutput.writeLong(userTrackerId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (screenName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(screenName);
		}

		objectOutput.writeLong(modifiedDate);

		if (sessionId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sessionId);
		}

		if (remoteAddr == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(remoteAddr);
		}

		if (RemoteHost == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(RemoteHost);
		}

		if (userAgent == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userAgent);
		}
	}

	public String uuid;
	public long userTrackerId;
	public long companyId;
	public long userId;
	public String screenName;
	public long modifiedDate;
	public String sessionId;
	public String remoteAddr;
	public String RemoteHost;
	public String userAgent;
}