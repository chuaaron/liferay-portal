/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
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

package com.liferay.portal.service;

/**
 * <p>
 * This class is a wrapper for {@link ResourceCodeLocalService}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       ResourceCodeLocalService
 * @generated
 */
public class ResourceCodeLocalServiceWrapper implements ResourceCodeLocalService {
	public ResourceCodeLocalServiceWrapper(
		ResourceCodeLocalService resourceCodeLocalService) {
		_resourceCodeLocalService = resourceCodeLocalService;
	}

	/**
	* Adds the resource code to the database. Also notifies the appropriate model listeners.
	*
	* @param resourceCode the resource code to add
	* @return the resource code that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.ResourceCode addResourceCode(
		com.liferay.portal.model.ResourceCode resourceCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resourceCodeLocalService.addResourceCode(resourceCode);
	}

	/**
	* Creates a new resource code with the primary key. Does not add the resource code to the database.
	*
	* @param codeId the primary key for the new resource code
	* @return the new resource code
	*/
	public com.liferay.portal.model.ResourceCode createResourceCode(long codeId) {
		return _resourceCodeLocalService.createResourceCode(codeId);
	}

	/**
	* Deletes the resource code with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param codeId the primary key of the resource code to delete
	* @throws PortalException if a resource code with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteResourceCode(long codeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_resourceCodeLocalService.deleteResourceCode(codeId);
	}

	/**
	* Deletes the resource code from the database. Also notifies the appropriate model listeners.
	*
	* @param resourceCode the resource code to delete
	* @throws SystemException if a system exception occurred
	*/
	public void deleteResourceCode(
		com.liferay.portal.model.ResourceCode resourceCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		_resourceCodeLocalService.deleteResourceCode(resourceCode);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resourceCodeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _resourceCodeLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resourceCodeLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resourceCodeLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the resource code with the primary key.
	*
	* @param codeId the primary key of the resource code to get
	* @return the resource code
	* @throws PortalException if a resource code with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.ResourceCode getResourceCode(long codeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _resourceCodeLocalService.getResourceCode(codeId);
	}

	/**
	* Gets a range of all the resource codes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of resource codes to return
	* @param end the upper bound of the range of resource codes to return (not inclusive)
	* @return the range of resource codes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.model.ResourceCode> getResourceCodes(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resourceCodeLocalService.getResourceCodes(start, end);
	}

	/**
	* Gets the number of resource codes.
	*
	* @return the number of resource codes
	* @throws SystemException if a system exception occurred
	*/
	public int getResourceCodesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resourceCodeLocalService.getResourceCodesCount();
	}

	/**
	* Updates the resource code in the database. Also notifies the appropriate model listeners.
	*
	* @param resourceCode the resource code to update
	* @return the resource code that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.ResourceCode updateResourceCode(
		com.liferay.portal.model.ResourceCode resourceCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resourceCodeLocalService.updateResourceCode(resourceCode);
	}

	/**
	* Updates the resource code in the database. Also notifies the appropriate model listeners.
	*
	* @param resourceCode the resource code to update
	* @param merge whether to merge the resource code with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the resource code that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.ResourceCode updateResourceCode(
		com.liferay.portal.model.ResourceCode resourceCode, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resourceCodeLocalService.updateResourceCode(resourceCode, merge);
	}

	public com.liferay.portal.model.ResourceCode addResourceCode(
		long companyId, java.lang.String name, int scope)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resourceCodeLocalService.addResourceCode(companyId, name, scope);
	}

	public void checkResourceCodes()
		throws com.liferay.portal.kernel.exception.SystemException {
		_resourceCodeLocalService.checkResourceCodes();
	}

	public void checkResourceCodes(long companyId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		_resourceCodeLocalService.checkResourceCodes(companyId, name);
	}

	public com.liferay.portal.model.ResourceCode getResourceCode(
		long companyId, java.lang.String name, int scope)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resourceCodeLocalService.getResourceCode(companyId, name, scope);
	}

	public ResourceCodeLocalService getWrappedResourceCodeLocalService() {
		return _resourceCodeLocalService;
	}

	private ResourceCodeLocalService _resourceCodeLocalService;
}