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

package com.liferay.amf.registration.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.amf.registration.exception.NoSuchregistrationException;
import com.liferay.amf.registration.model.registration;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the registration service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.amf.registration.service.persistence.impl.registrationPersistenceImpl
 * @see registrationUtil
 * @generated
 */
@ProviderType
public interface registrationPersistence extends BasePersistence<registration> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link registrationUtil} to access the registration persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the registrations where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching registrations
	*/
	public java.util.List<registration> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the registrations where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link registrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of registrations
	* @param end the upper bound of the range of registrations (not inclusive)
	* @return the range of matching registrations
	*/
	public java.util.List<registration> findByUuid(java.lang.String uuid,
		int start, int end);

	/**
	* Returns an ordered range of all the registrations where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link registrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of registrations
	* @param end the upper bound of the range of registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching registrations
	*/
	public java.util.List<registration> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<registration> orderByComparator);

	/**
	* Returns an ordered range of all the registrations where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link registrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of registrations
	* @param end the upper bound of the range of registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching registrations
	*/
	public java.util.List<registration> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<registration> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first registration in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration
	* @throws NoSuchregistrationException if a matching registration could not be found
	*/
	public registration findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<registration> orderByComparator)
		throws NoSuchregistrationException;

	/**
	* Returns the first registration in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration, or <code>null</code> if a matching registration could not be found
	*/
	public registration fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<registration> orderByComparator);

	/**
	* Returns the last registration in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration
	* @throws NoSuchregistrationException if a matching registration could not be found
	*/
	public registration findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<registration> orderByComparator)
		throws NoSuchregistrationException;

	/**
	* Returns the last registration in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration, or <code>null</code> if a matching registration could not be found
	*/
	public registration fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<registration> orderByComparator);

	/**
	* Returns the registrations before and after the current registration in the ordered set where uuid = &#63;.
	*
	* @param fooId the primary key of the current registration
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next registration
	* @throws NoSuchregistrationException if a registration with the primary key could not be found
	*/
	public registration[] findByUuid_PrevAndNext(long fooId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<registration> orderByComparator)
		throws NoSuchregistrationException;

	/**
	* Removes all the registrations where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of registrations where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching registrations
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the registration where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchregistrationException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching registration
	* @throws NoSuchregistrationException if a matching registration could not be found
	*/
	public registration findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchregistrationException;

	/**
	* Returns the registration where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching registration, or <code>null</code> if a matching registration could not be found
	*/
	public registration fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the registration where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching registration, or <code>null</code> if a matching registration could not be found
	*/
	public registration fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the registration where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the registration that was removed
	*/
	public registration removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchregistrationException;

	/**
	* Returns the number of registrations where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching registrations
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the registrations where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching registrations
	*/
	public java.util.List<registration> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the registrations where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link registrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of registrations
	* @param end the upper bound of the range of registrations (not inclusive)
	* @return the range of matching registrations
	*/
	public java.util.List<registration> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the registrations where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link registrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of registrations
	* @param end the upper bound of the range of registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching registrations
	*/
	public java.util.List<registration> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<registration> orderByComparator);

	/**
	* Returns an ordered range of all the registrations where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link registrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of registrations
	* @param end the upper bound of the range of registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching registrations
	*/
	public java.util.List<registration> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<registration> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first registration in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration
	* @throws NoSuchregistrationException if a matching registration could not be found
	*/
	public registration findByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<registration> orderByComparator)
		throws NoSuchregistrationException;

	/**
	* Returns the first registration in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration, or <code>null</code> if a matching registration could not be found
	*/
	public registration fetchByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<registration> orderByComparator);

	/**
	* Returns the last registration in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration
	* @throws NoSuchregistrationException if a matching registration could not be found
	*/
	public registration findByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<registration> orderByComparator)
		throws NoSuchregistrationException;

	/**
	* Returns the last registration in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration, or <code>null</code> if a matching registration could not be found
	*/
	public registration fetchByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<registration> orderByComparator);

	/**
	* Returns the registrations before and after the current registration in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param fooId the primary key of the current registration
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next registration
	* @throws NoSuchregistrationException if a registration with the primary key could not be found
	*/
	public registration[] findByUuid_C_PrevAndNext(long fooId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<registration> orderByComparator)
		throws NoSuchregistrationException;

	/**
	* Removes all the registrations where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of registrations where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching registrations
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the registrations where field2 = &#63;.
	*
	* @param field2 the field2
	* @return the matching registrations
	*/
	public java.util.List<registration> findByField2(boolean field2);

	/**
	* Returns a range of all the registrations where field2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link registrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param field2 the field2
	* @param start the lower bound of the range of registrations
	* @param end the upper bound of the range of registrations (not inclusive)
	* @return the range of matching registrations
	*/
	public java.util.List<registration> findByField2(boolean field2, int start,
		int end);

	/**
	* Returns an ordered range of all the registrations where field2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link registrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param field2 the field2
	* @param start the lower bound of the range of registrations
	* @param end the upper bound of the range of registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching registrations
	*/
	public java.util.List<registration> findByField2(boolean field2, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<registration> orderByComparator);

	/**
	* Returns an ordered range of all the registrations where field2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link registrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param field2 the field2
	* @param start the lower bound of the range of registrations
	* @param end the upper bound of the range of registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching registrations
	*/
	public java.util.List<registration> findByField2(boolean field2, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<registration> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first registration in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration
	* @throws NoSuchregistrationException if a matching registration could not be found
	*/
	public registration findByField2_First(boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator<registration> orderByComparator)
		throws NoSuchregistrationException;

	/**
	* Returns the first registration in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration, or <code>null</code> if a matching registration could not be found
	*/
	public registration fetchByField2_First(boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator<registration> orderByComparator);

	/**
	* Returns the last registration in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration
	* @throws NoSuchregistrationException if a matching registration could not be found
	*/
	public registration findByField2_Last(boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator<registration> orderByComparator)
		throws NoSuchregistrationException;

	/**
	* Returns the last registration in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration, or <code>null</code> if a matching registration could not be found
	*/
	public registration fetchByField2_Last(boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator<registration> orderByComparator);

	/**
	* Returns the registrations before and after the current registration in the ordered set where field2 = &#63;.
	*
	* @param fooId the primary key of the current registration
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next registration
	* @throws NoSuchregistrationException if a registration with the primary key could not be found
	*/
	public registration[] findByField2_PrevAndNext(long fooId, boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator<registration> orderByComparator)
		throws NoSuchregistrationException;

	/**
	* Removes all the registrations where field2 = &#63; from the database.
	*
	* @param field2 the field2
	*/
	public void removeByField2(boolean field2);

	/**
	* Returns the number of registrations where field2 = &#63;.
	*
	* @param field2 the field2
	* @return the number of matching registrations
	*/
	public int countByField2(boolean field2);

	/**
	* Caches the registration in the entity cache if it is enabled.
	*
	* @param registration the registration
	*/
	public void cacheResult(registration registration);

	/**
	* Caches the registrations in the entity cache if it is enabled.
	*
	* @param registrations the registrations
	*/
	public void cacheResult(java.util.List<registration> registrations);

	/**
	* Creates a new registration with the primary key. Does not add the registration to the database.
	*
	* @param fooId the primary key for the new registration
	* @return the new registration
	*/
	public registration create(long fooId);

	/**
	* Removes the registration with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fooId the primary key of the registration
	* @return the registration that was removed
	* @throws NoSuchregistrationException if a registration with the primary key could not be found
	*/
	public registration remove(long fooId) throws NoSuchregistrationException;

	public registration updateImpl(registration registration);

	/**
	* Returns the registration with the primary key or throws a {@link NoSuchregistrationException} if it could not be found.
	*
	* @param fooId the primary key of the registration
	* @return the registration
	* @throws NoSuchregistrationException if a registration with the primary key could not be found
	*/
	public registration findByPrimaryKey(long fooId)
		throws NoSuchregistrationException;

	/**
	* Returns the registration with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param fooId the primary key of the registration
	* @return the registration, or <code>null</code> if a registration with the primary key could not be found
	*/
	public registration fetchByPrimaryKey(long fooId);

	@Override
	public java.util.Map<java.io.Serializable, registration> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the registrations.
	*
	* @return the registrations
	*/
	public java.util.List<registration> findAll();

	/**
	* Returns a range of all the registrations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link registrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of registrations
	* @param end the upper bound of the range of registrations (not inclusive)
	* @return the range of registrations
	*/
	public java.util.List<registration> findAll(int start, int end);

	/**
	* Returns an ordered range of all the registrations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link registrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of registrations
	* @param end the upper bound of the range of registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of registrations
	*/
	public java.util.List<registration> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<registration> orderByComparator);

	/**
	* Returns an ordered range of all the registrations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link registrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of registrations
	* @param end the upper bound of the range of registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of registrations
	*/
	public java.util.List<registration> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<registration> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the registrations from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of registrations.
	*
	* @return the number of registrations
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}