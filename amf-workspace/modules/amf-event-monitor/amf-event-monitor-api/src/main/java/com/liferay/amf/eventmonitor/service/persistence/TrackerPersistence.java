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

package com.liferay.amf.eventmonitor.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.amf.eventmonitor.exception.NoSuchTrackerException;
import com.liferay.amf.eventmonitor.model.Tracker;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the tracker service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.amf.eventmonitor.service.persistence.impl.TrackerPersistenceImpl
 * @see TrackerUtil
 * @generated
 */
@ProviderType
public interface TrackerPersistence extends BasePersistence<Tracker> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TrackerUtil} to access the tracker persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the trackers where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching trackers
	*/
	public java.util.List<Tracker> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the trackers where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TrackerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of trackers
	* @param end the upper bound of the range of trackers (not inclusive)
	* @return the range of matching trackers
	*/
	public java.util.List<Tracker> findByUuid(java.lang.String uuid, int start,
		int end);

	/**
	* Returns an ordered range of all the trackers where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TrackerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of trackers
	* @param end the upper bound of the range of trackers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching trackers
	*/
	public java.util.List<Tracker> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Tracker> orderByComparator);

	/**
	* Returns an ordered range of all the trackers where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TrackerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of trackers
	* @param end the upper bound of the range of trackers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching trackers
	*/
	public java.util.List<Tracker> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Tracker> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first tracker in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tracker
	* @throws NoSuchTrackerException if a matching tracker could not be found
	*/
	public Tracker findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Tracker> orderByComparator)
		throws NoSuchTrackerException;

	/**
	* Returns the first tracker in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tracker, or <code>null</code> if a matching tracker could not be found
	*/
	public Tracker fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Tracker> orderByComparator);

	/**
	* Returns the last tracker in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tracker
	* @throws NoSuchTrackerException if a matching tracker could not be found
	*/
	public Tracker findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Tracker> orderByComparator)
		throws NoSuchTrackerException;

	/**
	* Returns the last tracker in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tracker, or <code>null</code> if a matching tracker could not be found
	*/
	public Tracker fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Tracker> orderByComparator);

	/**
	* Returns the trackers before and after the current tracker in the ordered set where uuid = &#63;.
	*
	* @param userTrackerId the primary key of the current tracker
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tracker
	* @throws NoSuchTrackerException if a tracker with the primary key could not be found
	*/
	public Tracker[] findByUuid_PrevAndNext(long userTrackerId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Tracker> orderByComparator)
		throws NoSuchTrackerException;

	/**
	* Removes all the trackers where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of trackers where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching trackers
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns all the trackers where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching trackers
	*/
	public java.util.List<Tracker> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the trackers where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TrackerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of trackers
	* @param end the upper bound of the range of trackers (not inclusive)
	* @return the range of matching trackers
	*/
	public java.util.List<Tracker> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the trackers where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TrackerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of trackers
	* @param end the upper bound of the range of trackers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching trackers
	*/
	public java.util.List<Tracker> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Tracker> orderByComparator);

	/**
	* Returns an ordered range of all the trackers where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TrackerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of trackers
	* @param end the upper bound of the range of trackers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching trackers
	*/
	public java.util.List<Tracker> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Tracker> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first tracker in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tracker
	* @throws NoSuchTrackerException if a matching tracker could not be found
	*/
	public Tracker findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Tracker> orderByComparator)
		throws NoSuchTrackerException;

	/**
	* Returns the first tracker in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tracker, or <code>null</code> if a matching tracker could not be found
	*/
	public Tracker fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Tracker> orderByComparator);

	/**
	* Returns the last tracker in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tracker
	* @throws NoSuchTrackerException if a matching tracker could not be found
	*/
	public Tracker findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Tracker> orderByComparator)
		throws NoSuchTrackerException;

	/**
	* Returns the last tracker in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tracker, or <code>null</code> if a matching tracker could not be found
	*/
	public Tracker fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Tracker> orderByComparator);

	/**
	* Returns the trackers before and after the current tracker in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param userTrackerId the primary key of the current tracker
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tracker
	* @throws NoSuchTrackerException if a tracker with the primary key could not be found
	*/
	public Tracker[] findByUuid_C_PrevAndNext(long userTrackerId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Tracker> orderByComparator)
		throws NoSuchTrackerException;

	/**
	* Removes all the trackers where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of trackers where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching trackers
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Caches the tracker in the entity cache if it is enabled.
	*
	* @param tracker the tracker
	*/
	public void cacheResult(Tracker tracker);

	/**
	* Caches the trackers in the entity cache if it is enabled.
	*
	* @param trackers the trackers
	*/
	public void cacheResult(java.util.List<Tracker> trackers);

	/**
	* Creates a new tracker with the primary key. Does not add the tracker to the database.
	*
	* @param userTrackerId the primary key for the new tracker
	* @return the new tracker
	*/
	public Tracker create(long userTrackerId);

	/**
	* Removes the tracker with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param userTrackerId the primary key of the tracker
	* @return the tracker that was removed
	* @throws NoSuchTrackerException if a tracker with the primary key could not be found
	*/
	public Tracker remove(long userTrackerId) throws NoSuchTrackerException;

	public Tracker updateImpl(Tracker tracker);

	/**
	* Returns the tracker with the primary key or throws a {@link NoSuchTrackerException} if it could not be found.
	*
	* @param userTrackerId the primary key of the tracker
	* @return the tracker
	* @throws NoSuchTrackerException if a tracker with the primary key could not be found
	*/
	public Tracker findByPrimaryKey(long userTrackerId)
		throws NoSuchTrackerException;

	/**
	* Returns the tracker with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param userTrackerId the primary key of the tracker
	* @return the tracker, or <code>null</code> if a tracker with the primary key could not be found
	*/
	public Tracker fetchByPrimaryKey(long userTrackerId);

	@Override
	public java.util.Map<java.io.Serializable, Tracker> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the trackers.
	*
	* @return the trackers
	*/
	public java.util.List<Tracker> findAll();

	/**
	* Returns a range of all the trackers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TrackerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of trackers
	* @param end the upper bound of the range of trackers (not inclusive)
	* @return the range of trackers
	*/
	public java.util.List<Tracker> findAll(int start, int end);

	/**
	* Returns an ordered range of all the trackers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TrackerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of trackers
	* @param end the upper bound of the range of trackers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of trackers
	*/
	public java.util.List<Tracker> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Tracker> orderByComparator);

	/**
	* Returns an ordered range of all the trackers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TrackerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of trackers
	* @param end the upper bound of the range of trackers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of trackers
	*/
	public java.util.List<Tracker> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Tracker> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the trackers from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of trackers.
	*
	* @return the number of trackers
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}