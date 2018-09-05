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

package com.liferay.amf.eventmonitor.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Tracker. This utility wraps
 * {@link com.liferay.amf.eventmonitor.service.impl.TrackerLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see TrackerLocalService
 * @see com.liferay.amf.eventmonitor.service.base.TrackerLocalServiceBaseImpl
 * @see com.liferay.amf.eventmonitor.service.impl.TrackerLocalServiceImpl
 * @generated
 */
@ProviderType
public class TrackerLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.amf.eventmonitor.service.impl.TrackerLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the tracker to the database. Also notifies the appropriate model listeners.
	*
	* @param tracker the tracker
	* @return the tracker that was added
	*/
	public static com.liferay.amf.eventmonitor.model.Tracker addTracker(
		com.liferay.amf.eventmonitor.model.Tracker tracker) {
		return getService().addTracker(tracker);
	}

	/**
	* Creates a new tracker with the primary key. Does not add the tracker to the database.
	*
	* @param userTrackerId the primary key for the new tracker
	* @return the new tracker
	*/
	public static com.liferay.amf.eventmonitor.model.Tracker createTracker(
		long userTrackerId) {
		return getService().createTracker(userTrackerId);
	}

	/**
	* Deletes the tracker from the database. Also notifies the appropriate model listeners.
	*
	* @param tracker the tracker
	* @return the tracker that was removed
	*/
	public static com.liferay.amf.eventmonitor.model.Tracker deleteTracker(
		com.liferay.amf.eventmonitor.model.Tracker tracker) {
		return getService().deleteTracker(tracker);
	}

	/**
	* Deletes the tracker with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param userTrackerId the primary key of the tracker
	* @return the tracker that was removed
	* @throws PortalException if a tracker with the primary key could not be found
	*/
	public static com.liferay.amf.eventmonitor.model.Tracker deleteTracker(
		long userTrackerId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteTracker(userTrackerId);
	}

	public static com.liferay.amf.eventmonitor.model.Tracker fetchTracker(
		long userTrackerId) {
		return getService().fetchTracker(userTrackerId);
	}

	/**
	* Returns the tracker with the matching UUID and company.
	*
	* @param uuid the tracker's UUID
	* @param companyId the primary key of the company
	* @return the matching tracker, or <code>null</code> if a matching tracker could not be found
	*/
	public static com.liferay.amf.eventmonitor.model.Tracker fetchTrackerByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().fetchTrackerByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the tracker with the primary key.
	*
	* @param userTrackerId the primary key of the tracker
	* @return the tracker
	* @throws PortalException if a tracker with the primary key could not be found
	*/
	public static com.liferay.amf.eventmonitor.model.Tracker getTracker(
		long userTrackerId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getTracker(userTrackerId);
	}

	/**
	* Returns the tracker with the matching UUID and company.
	*
	* @param uuid the tracker's UUID
	* @param companyId the primary key of the company
	* @return the matching tracker
	* @throws PortalException if a matching tracker could not be found
	*/
	public static com.liferay.amf.eventmonitor.model.Tracker getTrackerByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getTrackerByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Updates the tracker in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tracker the tracker
	* @return the tracker that was updated
	*/
	public static com.liferay.amf.eventmonitor.model.Tracker updateTracker(
		com.liferay.amf.eventmonitor.model.Tracker tracker) {
		return getService().updateTracker(tracker);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of trackers.
	*
	* @return the number of trackers
	*/
	public static int getTrackersCount() {
		return getService().getTrackersCount();
	}

	public static java.lang.String addTracker() {
		return getService().addTracker();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.amf.eventmonitor.model.impl.TrackerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.amf.eventmonitor.model.impl.TrackerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns a range of all the trackers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.amf.eventmonitor.model.impl.TrackerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of trackers
	* @param end the upper bound of the range of trackers (not inclusive)
	* @return the range of trackers
	*/
	public static java.util.List<com.liferay.amf.eventmonitor.model.Tracker> getTrackers(
		int start, int end) {
		return getService().getTrackers(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static TrackerLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<TrackerLocalService, TrackerLocalService> _serviceTracker =
		ServiceTrackerFactory.open(TrackerLocalService.class);
}