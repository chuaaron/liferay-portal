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

package com.liferay.portlet.journal.service;

import com.liferay.portal.kernel.annotation.Isolation;
import com.liferay.portal.kernel.annotation.Propagation;
import com.liferay.portal.kernel.annotation.Transactional;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The interface for the journal structure local service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link JournalStructureLocalServiceUtil} to access the journal structure local service. Add custom service methods to {@link com.liferay.portlet.journal.service.impl.JournalStructureLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JournalStructureLocalServiceUtil
 * @see com.liferay.portlet.journal.service.base.JournalStructureLocalServiceBaseImpl
 * @see com.liferay.portlet.journal.service.impl.JournalStructureLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface JournalStructureLocalService {
	/**
	* Adds the journal structure to the database. Also notifies the appropriate model listeners.
	*
	* @param journalStructure the journal structure to add
	* @return the journal structure that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.journal.model.JournalStructure addJournalStructure(
		com.liferay.portlet.journal.model.JournalStructure journalStructure)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new journal structure with the primary key. Does not add the journal structure to the database.
	*
	* @param id the primary key for the new journal structure
	* @return the new journal structure
	*/
	public com.liferay.portlet.journal.model.JournalStructure createJournalStructure(
		long id);

	/**
	* Deletes the journal structure with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the journal structure to delete
	* @throws PortalException if a journal structure with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteJournalStructure(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the journal structure from the database. Also notifies the appropriate model listeners.
	*
	* @param journalStructure the journal structure to delete
	* @throws SystemException if a system exception occurred
	*/
	public void deleteJournalStructure(
		com.liferay.portlet.journal.model.JournalStructure journalStructure)
		throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

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
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Gets the journal structure with the primary key.
	*
	* @param id the primary key of the journal structure to get
	* @return the journal structure
	* @throws PortalException if a journal structure with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portlet.journal.model.JournalStructure getJournalStructure(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Gets the journal structure with the UUID and group id.
	*
	* @param uuid the UUID of journal structure to get
	* @param groupId the group id of the journal structure to get
	* @return the journal structure
	* @throws PortalException if a journal structure with the UUID and group id could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portlet.journal.model.JournalStructure getJournalStructureByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Gets a range of all the journal structures.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of journal structures to return
	* @param end the upper bound of the range of journal structures to return (not inclusive)
	* @return the range of journal structures
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portlet.journal.model.JournalStructure> getJournalStructures(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Gets the number of journal structures.
	*
	* @return the number of journal structures
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getJournalStructuresCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the journal structure in the database. Also notifies the appropriate model listeners.
	*
	* @param journalStructure the journal structure to update
	* @return the journal structure that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.journal.model.JournalStructure updateJournalStructure(
		com.liferay.portlet.journal.model.JournalStructure journalStructure)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the journal structure in the database. Also notifies the appropriate model listeners.
	*
	* @param journalStructure the journal structure to update
	* @param merge whether to merge the journal structure with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the journal structure that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.journal.model.JournalStructure updateJournalStructure(
		com.liferay.portlet.journal.model.JournalStructure journalStructure,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portlet.journal.model.JournalStructure addStructure(
		long userId, long groupId, java.lang.String structureId,
		boolean autoStructureId, java.lang.String parentStructureId,
		java.lang.String name, java.lang.String description,
		java.lang.String xsd,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void addStructureResources(long groupId,
		java.lang.String structureId, boolean addCommunityPermissions,
		boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void addStructureResources(
		com.liferay.portlet.journal.model.JournalStructure structure,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void addStructureResources(long groupId,
		java.lang.String structureId, java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void addStructureResources(
		com.liferay.portlet.journal.model.JournalStructure structure,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void checkNewLine(long groupId, java.lang.String structureId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portlet.journal.model.JournalStructure copyStructure(
		long userId, long groupId, java.lang.String oldStructureId,
		java.lang.String newStructureId, boolean autoStructureId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void deleteStructure(long groupId, java.lang.String structureId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void deleteStructure(
		com.liferay.portlet.journal.model.JournalStructure structure)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void deleteStructures(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portlet.journal.model.JournalStructure getStructure(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portlet.journal.model.JournalStructure getStructure(
		long groupId, java.lang.String structureId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portlet.journal.model.JournalStructure> getStructures()
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portlet.journal.model.JournalStructure> getStructures(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portlet.journal.model.JournalStructure> getStructures(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getStructuresCount(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portlet.journal.model.JournalStructure> search(
		long companyId, long groupId, java.lang.String keywords, int start,
		int end, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portlet.journal.model.JournalStructure> search(
		long companyId, long groupId, java.lang.String structureId,
		java.lang.String name, java.lang.String description,
		boolean andOperator, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int searchCount(long companyId, long groupId,
		java.lang.String keywords)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int searchCount(long companyId, long groupId,
		java.lang.String structureId, java.lang.String name,
		java.lang.String description, boolean andOperator)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portlet.journal.model.JournalStructure updateStructure(
		long groupId, java.lang.String structureId,
		java.lang.String parentStructureId, java.lang.String name,
		java.lang.String description, java.lang.String xsd,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;
}