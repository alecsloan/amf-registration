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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TrackerLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TrackerLocalService
 * @generated
 */
@ProviderType
public class TrackerLocalServiceWrapper implements TrackerLocalService,
	ServiceWrapper<TrackerLocalService> {
	public TrackerLocalServiceWrapper(TrackerLocalService trackerLocalService) {
		_trackerLocalService = trackerLocalService;
	}

	/**
	* Adds the tracker to the database. Also notifies the appropriate model listeners.
	*
	* @param tracker the tracker
	* @return the tracker that was added
	*/
	@Override
	public com.liferay.amf.eventmonitor.model.Tracker addTracker(
		com.liferay.amf.eventmonitor.model.Tracker tracker) {
		return _trackerLocalService.addTracker(tracker);
	}

	/**
	* Creates a new tracker with the primary key. Does not add the tracker to the database.
	*
	* @param auditEventId the primary key for the new tracker
	* @return the new tracker
	*/
	@Override
	public com.liferay.amf.eventmonitor.model.Tracker createTracker(
		long auditEventId) {
		return _trackerLocalService.createTracker(auditEventId);
	}

	/**
	* Deletes the tracker from the database. Also notifies the appropriate model listeners.
	*
	* @param tracker the tracker
	* @return the tracker that was removed
	*/
	@Override
	public com.liferay.amf.eventmonitor.model.Tracker deleteTracker(
		com.liferay.amf.eventmonitor.model.Tracker tracker) {
		return _trackerLocalService.deleteTracker(tracker);
	}

	/**
	* Deletes the tracker with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param auditEventId the primary key of the tracker
	* @return the tracker that was removed
	* @throws PortalException if a tracker with the primary key could not be found
	*/
	@Override
	public com.liferay.amf.eventmonitor.model.Tracker deleteTracker(
		long auditEventId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _trackerLocalService.deleteTracker(auditEventId);
	}

	@Override
	public com.liferay.amf.eventmonitor.model.Tracker fetchTracker(
		long auditEventId) {
		return _trackerLocalService.fetchTracker(auditEventId);
	}

	/**
	* Returns the tracker with the matching UUID and company.
	*
	* @param uuid the tracker's UUID
	* @param companyId the primary key of the company
	* @return the matching tracker, or <code>null</code> if a matching tracker could not be found
	*/
	@Override
	public com.liferay.amf.eventmonitor.model.Tracker fetchTrackerByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _trackerLocalService.fetchTrackerByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the tracker with the primary key.
	*
	* @param auditEventId the primary key of the tracker
	* @return the tracker
	* @throws PortalException if a tracker with the primary key could not be found
	*/
	@Override
	public com.liferay.amf.eventmonitor.model.Tracker getTracker(
		long auditEventId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _trackerLocalService.getTracker(auditEventId);
	}

	/**
	* Returns the tracker with the matching UUID and company.
	*
	* @param uuid the tracker's UUID
	* @param companyId the primary key of the company
	* @return the matching tracker
	* @throws PortalException if a matching tracker could not be found
	*/
	@Override
	public com.liferay.amf.eventmonitor.model.Tracker getTrackerByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _trackerLocalService.getTrackerByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Updates the tracker in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tracker the tracker
	* @return the tracker that was updated
	*/
	@Override
	public com.liferay.amf.eventmonitor.model.Tracker updateTracker(
		com.liferay.amf.eventmonitor.model.Tracker tracker) {
		return _trackerLocalService.updateTracker(tracker);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _trackerLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _trackerLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _trackerLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _trackerLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _trackerLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of trackers.
	*
	* @return the number of trackers
	*/
	@Override
	public int getTrackersCount() {
		return _trackerLocalService.getTrackersCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _trackerLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _trackerLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _trackerLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _trackerLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<com.liferay.amf.eventmonitor.model.Tracker> getEvents(
		java.lang.String eventType) throws java.sql.SQLException {
		return _trackerLocalService.getEvents(eventType);
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
	@Override
	public java.util.List<com.liferay.amf.eventmonitor.model.Tracker> getTrackers(
		int start, int end) {
		return _trackerLocalService.getTrackers(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _trackerLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _trackerLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public TrackerLocalService getWrappedService() {
		return _trackerLocalService;
	}

	@Override
	public void setWrappedService(TrackerLocalService trackerLocalService) {
		_trackerLocalService = trackerLocalService;
	}

	private TrackerLocalService _trackerLocalService;
}