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

package com.liferay.portlet.documentlibrary.service.base;

import com.liferay.counter.service.CounterLocalService;

import com.liferay.documentlibrary.service.DLLocalService;
import com.liferay.documentlibrary.service.DLService;

import com.liferay.portal.kernel.annotation.BeanReference;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.GroupLocalService;
import com.liferay.portal.service.GroupService;
import com.liferay.portal.service.LayoutLocalService;
import com.liferay.portal.service.LayoutService;
import com.liferay.portal.service.LockLocalService;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ResourceService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.WebDAVPropsLocalService;
import com.liferay.portal.service.persistence.GroupFinder;
import com.liferay.portal.service.persistence.GroupPersistence;
import com.liferay.portal.service.persistence.LayoutFinder;
import com.liferay.portal.service.persistence.LayoutPersistence;
import com.liferay.portal.service.persistence.LockPersistence;
import com.liferay.portal.service.persistence.ResourceFinder;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserFinder;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.WebDAVPropsPersistence;

import com.liferay.portlet.documentlibrary.model.DLFolder;
import com.liferay.portlet.documentlibrary.service.DLFileEntryLocalService;
import com.liferay.portlet.documentlibrary.service.DLFileEntryService;
import com.liferay.portlet.documentlibrary.service.DLFileRankLocalService;
import com.liferay.portlet.documentlibrary.service.DLFileShortcutLocalService;
import com.liferay.portlet.documentlibrary.service.DLFileShortcutService;
import com.liferay.portlet.documentlibrary.service.DLFileVersionLocalService;
import com.liferay.portlet.documentlibrary.service.DLFileVersionService;
import com.liferay.portlet.documentlibrary.service.DLFolderLocalService;
import com.liferay.portlet.documentlibrary.service.DLFolderService;
import com.liferay.portlet.documentlibrary.service.persistence.DLFileEntryFinder;
import com.liferay.portlet.documentlibrary.service.persistence.DLFileEntryPersistence;
import com.liferay.portlet.documentlibrary.service.persistence.DLFileRankPersistence;
import com.liferay.portlet.documentlibrary.service.persistence.DLFileShortcutPersistence;
import com.liferay.portlet.documentlibrary.service.persistence.DLFileVersionPersistence;
import com.liferay.portlet.documentlibrary.service.persistence.DLFolderFinder;
import com.liferay.portlet.documentlibrary.service.persistence.DLFolderPersistence;
import com.liferay.portlet.expando.service.ExpandoValueLocalService;
import com.liferay.portlet.expando.service.ExpandoValueService;
import com.liferay.portlet.expando.service.persistence.ExpandoValuePersistence;

import java.util.List;

import javax.sql.DataSource;

/**
 * The base implementation of the d l folder local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.liferay.portlet.documentlibrary.service.impl.DLFolderLocalServiceImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link com.liferay.portlet.documentlibrary.service.DLFolderLocalServiceUtil} to access the d l folder local service.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.portlet.documentlibrary.service.impl.DLFolderLocalServiceImpl
 * @see com.liferay.portlet.documentlibrary.service.DLFolderLocalServiceUtil
 * @generated
 */
public abstract class DLFolderLocalServiceBaseImpl
	implements DLFolderLocalService {
	/**
	 * Adds the d l folder to the database. Also notifies the appropriate model listeners.
	 *
	 * @param dlFolder the d l folder to add
	 * @return the d l folder that was added
	 * @throws SystemException if a system exception occurred
	 */
	public DLFolder addDLFolder(DLFolder dlFolder) throws SystemException {
		dlFolder.setNew(true);

		return dlFolderPersistence.update(dlFolder, false);
	}

	/**
	 * Creates a new d l folder with the primary key. Does not add the d l folder to the database.
	 *
	 * @param folderId the primary key for the new d l folder
	 * @return the new d l folder
	 */
	public DLFolder createDLFolder(long folderId) {
		return dlFolderPersistence.create(folderId);
	}

	/**
	 * Deletes the d l folder with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param folderId the primary key of the d l folder to delete
	 * @throws PortalException if a d l folder with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public void deleteDLFolder(long folderId)
		throws PortalException, SystemException {
		dlFolderPersistence.remove(folderId);
	}

	/**
	 * Deletes the d l folder from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dlFolder the d l folder to delete
	 * @throws SystemException if a system exception occurred
	 */
	public void deleteDLFolder(DLFolder dlFolder) throws SystemException {
		dlFolderPersistence.remove(dlFolder);
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query to search with
	 * @return the matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return dlFolderPersistence.findWithDynamicQuery(dynamicQuery);
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return dlFolderPersistence.findWithDynamicQuery(dynamicQuery, start, end);
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return dlFolderPersistence.findWithDynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	 * Counts the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query to search with
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return dlFolderPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Gets the d l folder with the primary key.
	 *
	 * @param folderId the primary key of the d l folder to get
	 * @return the d l folder
	 * @throws PortalException if a d l folder with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DLFolder getDLFolder(long folderId)
		throws PortalException, SystemException {
		return dlFolderPersistence.findByPrimaryKey(folderId);
	}

	/**
	 * Gets the d l folder with the UUID and group id.
	 *
	 * @param uuid the UUID of d l folder to get
	 * @param groupId the group id of the d l folder to get
	 * @return the d l folder
	 * @throws PortalException if a d l folder with the UUID and group id could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DLFolder getDLFolderByUuidAndGroupId(String uuid, long groupId)
		throws PortalException, SystemException {
		return dlFolderPersistence.findByUUID_G(uuid, groupId);
	}

	/**
	 * Gets a range of all the d l folders.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of d l folders to return
	 * @param end the upper bound of the range of d l folders to return (not inclusive)
	 * @return the range of d l folders
	 * @throws SystemException if a system exception occurred
	 */
	public List<DLFolder> getDLFolders(int start, int end)
		throws SystemException {
		return dlFolderPersistence.findAll(start, end);
	}

	/**
	 * Gets the number of d l folders.
	 *
	 * @return the number of d l folders
	 * @throws SystemException if a system exception occurred
	 */
	public int getDLFoldersCount() throws SystemException {
		return dlFolderPersistence.countAll();
	}

	/**
	 * Updates the d l folder in the database. Also notifies the appropriate model listeners.
	 *
	 * @param dlFolder the d l folder to update
	 * @return the d l folder that was updated
	 * @throws SystemException if a system exception occurred
	 */
	public DLFolder updateDLFolder(DLFolder dlFolder) throws SystemException {
		dlFolder.setNew(false);

		return dlFolderPersistence.update(dlFolder, true);
	}

	/**
	 * Updates the d l folder in the database. Also notifies the appropriate model listeners.
	 *
	 * @param dlFolder the d l folder to update
	 * @param merge whether to merge the d l folder with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	 * @return the d l folder that was updated
	 * @throws SystemException if a system exception occurred
	 */
	public DLFolder updateDLFolder(DLFolder dlFolder, boolean merge)
		throws SystemException {
		dlFolder.setNew(false);

		return dlFolderPersistence.update(dlFolder, merge);
	}

	/**
	 * Gets the d l file entry local service.
	 *
	 * @return the d l file entry local service
	 */
	public DLFileEntryLocalService getDLFileEntryLocalService() {
		return dlFileEntryLocalService;
	}

	/**
	 * Sets the d l file entry local service.
	 *
	 * @param dlFileEntryLocalService the d l file entry local service
	 */
	public void setDLFileEntryLocalService(
		DLFileEntryLocalService dlFileEntryLocalService) {
		this.dlFileEntryLocalService = dlFileEntryLocalService;
	}

	/**
	 * Gets the d l file entry remote service.
	 *
	 * @return the d l file entry remote service
	 */
	public DLFileEntryService getDLFileEntryService() {
		return dlFileEntryService;
	}

	/**
	 * Sets the d l file entry remote service.
	 *
	 * @param dlFileEntryService the d l file entry remote service
	 */
	public void setDLFileEntryService(DLFileEntryService dlFileEntryService) {
		this.dlFileEntryService = dlFileEntryService;
	}

	/**
	 * Gets the d l file entry persistence.
	 *
	 * @return the d l file entry persistence
	 */
	public DLFileEntryPersistence getDLFileEntryPersistence() {
		return dlFileEntryPersistence;
	}

	/**
	 * Sets the d l file entry persistence.
	 *
	 * @param dlFileEntryPersistence the d l file entry persistence
	 */
	public void setDLFileEntryPersistence(
		DLFileEntryPersistence dlFileEntryPersistence) {
		this.dlFileEntryPersistence = dlFileEntryPersistence;
	}

	/**
	 * Gets the d l file entry finder.
	 *
	 * @return the d l file entry finder
	 */
	public DLFileEntryFinder getDLFileEntryFinder() {
		return dlFileEntryFinder;
	}

	/**
	 * Sets the d l file entry finder.
	 *
	 * @param dlFileEntryFinder the d l file entry finder
	 */
	public void setDLFileEntryFinder(DLFileEntryFinder dlFileEntryFinder) {
		this.dlFileEntryFinder = dlFileEntryFinder;
	}

	/**
	 * Gets the d l file rank local service.
	 *
	 * @return the d l file rank local service
	 */
	public DLFileRankLocalService getDLFileRankLocalService() {
		return dlFileRankLocalService;
	}

	/**
	 * Sets the d l file rank local service.
	 *
	 * @param dlFileRankLocalService the d l file rank local service
	 */
	public void setDLFileRankLocalService(
		DLFileRankLocalService dlFileRankLocalService) {
		this.dlFileRankLocalService = dlFileRankLocalService;
	}

	/**
	 * Gets the d l file rank persistence.
	 *
	 * @return the d l file rank persistence
	 */
	public DLFileRankPersistence getDLFileRankPersistence() {
		return dlFileRankPersistence;
	}

	/**
	 * Sets the d l file rank persistence.
	 *
	 * @param dlFileRankPersistence the d l file rank persistence
	 */
	public void setDLFileRankPersistence(
		DLFileRankPersistence dlFileRankPersistence) {
		this.dlFileRankPersistence = dlFileRankPersistence;
	}

	/**
	 * Gets the d l file shortcut local service.
	 *
	 * @return the d l file shortcut local service
	 */
	public DLFileShortcutLocalService getDLFileShortcutLocalService() {
		return dlFileShortcutLocalService;
	}

	/**
	 * Sets the d l file shortcut local service.
	 *
	 * @param dlFileShortcutLocalService the d l file shortcut local service
	 */
	public void setDLFileShortcutLocalService(
		DLFileShortcutLocalService dlFileShortcutLocalService) {
		this.dlFileShortcutLocalService = dlFileShortcutLocalService;
	}

	/**
	 * Gets the d l file shortcut remote service.
	 *
	 * @return the d l file shortcut remote service
	 */
	public DLFileShortcutService getDLFileShortcutService() {
		return dlFileShortcutService;
	}

	/**
	 * Sets the d l file shortcut remote service.
	 *
	 * @param dlFileShortcutService the d l file shortcut remote service
	 */
	public void setDLFileShortcutService(
		DLFileShortcutService dlFileShortcutService) {
		this.dlFileShortcutService = dlFileShortcutService;
	}

	/**
	 * Gets the d l file shortcut persistence.
	 *
	 * @return the d l file shortcut persistence
	 */
	public DLFileShortcutPersistence getDLFileShortcutPersistence() {
		return dlFileShortcutPersistence;
	}

	/**
	 * Sets the d l file shortcut persistence.
	 *
	 * @param dlFileShortcutPersistence the d l file shortcut persistence
	 */
	public void setDLFileShortcutPersistence(
		DLFileShortcutPersistence dlFileShortcutPersistence) {
		this.dlFileShortcutPersistence = dlFileShortcutPersistence;
	}

	/**
	 * Gets the d l file version local service.
	 *
	 * @return the d l file version local service
	 */
	public DLFileVersionLocalService getDLFileVersionLocalService() {
		return dlFileVersionLocalService;
	}

	/**
	 * Sets the d l file version local service.
	 *
	 * @param dlFileVersionLocalService the d l file version local service
	 */
	public void setDLFileVersionLocalService(
		DLFileVersionLocalService dlFileVersionLocalService) {
		this.dlFileVersionLocalService = dlFileVersionLocalService;
	}

	/**
	 * Gets the d l file version remote service.
	 *
	 * @return the d l file version remote service
	 */
	public DLFileVersionService getDLFileVersionService() {
		return dlFileVersionService;
	}

	/**
	 * Sets the d l file version remote service.
	 *
	 * @param dlFileVersionService the d l file version remote service
	 */
	public void setDLFileVersionService(
		DLFileVersionService dlFileVersionService) {
		this.dlFileVersionService = dlFileVersionService;
	}

	/**
	 * Gets the d l file version persistence.
	 *
	 * @return the d l file version persistence
	 */
	public DLFileVersionPersistence getDLFileVersionPersistence() {
		return dlFileVersionPersistence;
	}

	/**
	 * Sets the d l file version persistence.
	 *
	 * @param dlFileVersionPersistence the d l file version persistence
	 */
	public void setDLFileVersionPersistence(
		DLFileVersionPersistence dlFileVersionPersistence) {
		this.dlFileVersionPersistence = dlFileVersionPersistence;
	}

	/**
	 * Gets the d l folder local service.
	 *
	 * @return the d l folder local service
	 */
	public DLFolderLocalService getDLFolderLocalService() {
		return dlFolderLocalService;
	}

	/**
	 * Sets the d l folder local service.
	 *
	 * @param dlFolderLocalService the d l folder local service
	 */
	public void setDLFolderLocalService(
		DLFolderLocalService dlFolderLocalService) {
		this.dlFolderLocalService = dlFolderLocalService;
	}

	/**
	 * Gets the d l folder remote service.
	 *
	 * @return the d l folder remote service
	 */
	public DLFolderService getDLFolderService() {
		return dlFolderService;
	}

	/**
	 * Sets the d l folder remote service.
	 *
	 * @param dlFolderService the d l folder remote service
	 */
	public void setDLFolderService(DLFolderService dlFolderService) {
		this.dlFolderService = dlFolderService;
	}

	/**
	 * Gets the d l folder persistence.
	 *
	 * @return the d l folder persistence
	 */
	public DLFolderPersistence getDLFolderPersistence() {
		return dlFolderPersistence;
	}

	/**
	 * Sets the d l folder persistence.
	 *
	 * @param dlFolderPersistence the d l folder persistence
	 */
	public void setDLFolderPersistence(DLFolderPersistence dlFolderPersistence) {
		this.dlFolderPersistence = dlFolderPersistence;
	}

	/**
	 * Gets the d l folder finder.
	 *
	 * @return the d l folder finder
	 */
	public DLFolderFinder getDLFolderFinder() {
		return dlFolderFinder;
	}

	/**
	 * Sets the d l folder finder.
	 *
	 * @param dlFolderFinder the d l folder finder
	 */
	public void setDLFolderFinder(DLFolderFinder dlFolderFinder) {
		this.dlFolderFinder = dlFolderFinder;
	}

	/**
	 * Gets the counter local service.
	 *
	 * @return the counter local service
	 */
	public CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Gets the d l local service.
	 *
	 * @return the d l local service
	 */
	public DLLocalService getDLLocalService() {
		return dlLocalService;
	}

	/**
	 * Sets the d l local service.
	 *
	 * @param dlLocalService the d l local service
	 */
	public void setDLLocalService(DLLocalService dlLocalService) {
		this.dlLocalService = dlLocalService;
	}

	/**
	 * Gets the d l remote service.
	 *
	 * @return the d l remote service
	 */
	public DLService getDLService() {
		return dlService;
	}

	/**
	 * Sets the d l remote service.
	 *
	 * @param dlService the d l remote service
	 */
	public void setDLService(DLService dlService) {
		this.dlService = dlService;
	}

	/**
	 * Gets the group local service.
	 *
	 * @return the group local service
	 */
	public GroupLocalService getGroupLocalService() {
		return groupLocalService;
	}

	/**
	 * Sets the group local service.
	 *
	 * @param groupLocalService the group local service
	 */
	public void setGroupLocalService(GroupLocalService groupLocalService) {
		this.groupLocalService = groupLocalService;
	}

	/**
	 * Gets the group remote service.
	 *
	 * @return the group remote service
	 */
	public GroupService getGroupService() {
		return groupService;
	}

	/**
	 * Sets the group remote service.
	 *
	 * @param groupService the group remote service
	 */
	public void setGroupService(GroupService groupService) {
		this.groupService = groupService;
	}

	/**
	 * Gets the group persistence.
	 *
	 * @return the group persistence
	 */
	public GroupPersistence getGroupPersistence() {
		return groupPersistence;
	}

	/**
	 * Sets the group persistence.
	 *
	 * @param groupPersistence the group persistence
	 */
	public void setGroupPersistence(GroupPersistence groupPersistence) {
		this.groupPersistence = groupPersistence;
	}

	/**
	 * Gets the group finder.
	 *
	 * @return the group finder
	 */
	public GroupFinder getGroupFinder() {
		return groupFinder;
	}

	/**
	 * Sets the group finder.
	 *
	 * @param groupFinder the group finder
	 */
	public void setGroupFinder(GroupFinder groupFinder) {
		this.groupFinder = groupFinder;
	}

	/**
	 * Gets the layout local service.
	 *
	 * @return the layout local service
	 */
	public LayoutLocalService getLayoutLocalService() {
		return layoutLocalService;
	}

	/**
	 * Sets the layout local service.
	 *
	 * @param layoutLocalService the layout local service
	 */
	public void setLayoutLocalService(LayoutLocalService layoutLocalService) {
		this.layoutLocalService = layoutLocalService;
	}

	/**
	 * Gets the layout remote service.
	 *
	 * @return the layout remote service
	 */
	public LayoutService getLayoutService() {
		return layoutService;
	}

	/**
	 * Sets the layout remote service.
	 *
	 * @param layoutService the layout remote service
	 */
	public void setLayoutService(LayoutService layoutService) {
		this.layoutService = layoutService;
	}

	/**
	 * Gets the layout persistence.
	 *
	 * @return the layout persistence
	 */
	public LayoutPersistence getLayoutPersistence() {
		return layoutPersistence;
	}

	/**
	 * Sets the layout persistence.
	 *
	 * @param layoutPersistence the layout persistence
	 */
	public void setLayoutPersistence(LayoutPersistence layoutPersistence) {
		this.layoutPersistence = layoutPersistence;
	}

	/**
	 * Gets the layout finder.
	 *
	 * @return the layout finder
	 */
	public LayoutFinder getLayoutFinder() {
		return layoutFinder;
	}

	/**
	 * Sets the layout finder.
	 *
	 * @param layoutFinder the layout finder
	 */
	public void setLayoutFinder(LayoutFinder layoutFinder) {
		this.layoutFinder = layoutFinder;
	}

	/**
	 * Gets the lock local service.
	 *
	 * @return the lock local service
	 */
	public LockLocalService getLockLocalService() {
		return lockLocalService;
	}

	/**
	 * Sets the lock local service.
	 *
	 * @param lockLocalService the lock local service
	 */
	public void setLockLocalService(LockLocalService lockLocalService) {
		this.lockLocalService = lockLocalService;
	}

	/**
	 * Gets the lock persistence.
	 *
	 * @return the lock persistence
	 */
	public LockPersistence getLockPersistence() {
		return lockPersistence;
	}

	/**
	 * Sets the lock persistence.
	 *
	 * @param lockPersistence the lock persistence
	 */
	public void setLockPersistence(LockPersistence lockPersistence) {
		this.lockPersistence = lockPersistence;
	}

	/**
	 * Gets the resource local service.
	 *
	 * @return the resource local service
	 */
	public ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Gets the resource remote service.
	 *
	 * @return the resource remote service
	 */
	public ResourceService getResourceService() {
		return resourceService;
	}

	/**
	 * Sets the resource remote service.
	 *
	 * @param resourceService the resource remote service
	 */
	public void setResourceService(ResourceService resourceService) {
		this.resourceService = resourceService;
	}

	/**
	 * Gets the resource persistence.
	 *
	 * @return the resource persistence
	 */
	public ResourcePersistence getResourcePersistence() {
		return resourcePersistence;
	}

	/**
	 * Sets the resource persistence.
	 *
	 * @param resourcePersistence the resource persistence
	 */
	public void setResourcePersistence(ResourcePersistence resourcePersistence) {
		this.resourcePersistence = resourcePersistence;
	}

	/**
	 * Gets the resource finder.
	 *
	 * @return the resource finder
	 */
	public ResourceFinder getResourceFinder() {
		return resourceFinder;
	}

	/**
	 * Sets the resource finder.
	 *
	 * @param resourceFinder the resource finder
	 */
	public void setResourceFinder(ResourceFinder resourceFinder) {
		this.resourceFinder = resourceFinder;
	}

	/**
	 * Gets the user local service.
	 *
	 * @return the user local service
	 */
	public UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Gets the user remote service.
	 *
	 * @return the user remote service
	 */
	public UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/**
	 * Gets the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	/**
	 * Gets the user finder.
	 *
	 * @return the user finder
	 */
	public UserFinder getUserFinder() {
		return userFinder;
	}

	/**
	 * Sets the user finder.
	 *
	 * @param userFinder the user finder
	 */
	public void setUserFinder(UserFinder userFinder) {
		this.userFinder = userFinder;
	}

	/**
	 * Gets the web d a v props local service.
	 *
	 * @return the web d a v props local service
	 */
	public WebDAVPropsLocalService getWebDAVPropsLocalService() {
		return webDAVPropsLocalService;
	}

	/**
	 * Sets the web d a v props local service.
	 *
	 * @param webDAVPropsLocalService the web d a v props local service
	 */
	public void setWebDAVPropsLocalService(
		WebDAVPropsLocalService webDAVPropsLocalService) {
		this.webDAVPropsLocalService = webDAVPropsLocalService;
	}

	/**
	 * Gets the web d a v props persistence.
	 *
	 * @return the web d a v props persistence
	 */
	public WebDAVPropsPersistence getWebDAVPropsPersistence() {
		return webDAVPropsPersistence;
	}

	/**
	 * Sets the web d a v props persistence.
	 *
	 * @param webDAVPropsPersistence the web d a v props persistence
	 */
	public void setWebDAVPropsPersistence(
		WebDAVPropsPersistence webDAVPropsPersistence) {
		this.webDAVPropsPersistence = webDAVPropsPersistence;
	}

	/**
	 * Gets the expando value local service.
	 *
	 * @return the expando value local service
	 */
	public ExpandoValueLocalService getExpandoValueLocalService() {
		return expandoValueLocalService;
	}

	/**
	 * Sets the expando value local service.
	 *
	 * @param expandoValueLocalService the expando value local service
	 */
	public void setExpandoValueLocalService(
		ExpandoValueLocalService expandoValueLocalService) {
		this.expandoValueLocalService = expandoValueLocalService;
	}

	/**
	 * Gets the expando value remote service.
	 *
	 * @return the expando value remote service
	 */
	public ExpandoValueService getExpandoValueService() {
		return expandoValueService;
	}

	/**
	 * Sets the expando value remote service.
	 *
	 * @param expandoValueService the expando value remote service
	 */
	public void setExpandoValueService(ExpandoValueService expandoValueService) {
		this.expandoValueService = expandoValueService;
	}

	/**
	 * Gets the expando value persistence.
	 *
	 * @return the expando value persistence
	 */
	public ExpandoValuePersistence getExpandoValuePersistence() {
		return expandoValuePersistence;
	}

	/**
	 * Sets the expando value persistence.
	 *
	 * @param expandoValuePersistence the expando value persistence
	 */
	public void setExpandoValuePersistence(
		ExpandoValuePersistence expandoValuePersistence) {
		this.expandoValuePersistence = expandoValuePersistence;
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query to perform
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = dlFolderPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = DLFileEntryLocalService.class)
	protected DLFileEntryLocalService dlFileEntryLocalService;
	@BeanReference(type = DLFileEntryService.class)
	protected DLFileEntryService dlFileEntryService;
	@BeanReference(type = DLFileEntryPersistence.class)
	protected DLFileEntryPersistence dlFileEntryPersistence;
	@BeanReference(type = DLFileEntryFinder.class)
	protected DLFileEntryFinder dlFileEntryFinder;
	@BeanReference(type = DLFileRankLocalService.class)
	protected DLFileRankLocalService dlFileRankLocalService;
	@BeanReference(type = DLFileRankPersistence.class)
	protected DLFileRankPersistence dlFileRankPersistence;
	@BeanReference(type = DLFileShortcutLocalService.class)
	protected DLFileShortcutLocalService dlFileShortcutLocalService;
	@BeanReference(type = DLFileShortcutService.class)
	protected DLFileShortcutService dlFileShortcutService;
	@BeanReference(type = DLFileShortcutPersistence.class)
	protected DLFileShortcutPersistence dlFileShortcutPersistence;
	@BeanReference(type = DLFileVersionLocalService.class)
	protected DLFileVersionLocalService dlFileVersionLocalService;
	@BeanReference(type = DLFileVersionService.class)
	protected DLFileVersionService dlFileVersionService;
	@BeanReference(type = DLFileVersionPersistence.class)
	protected DLFileVersionPersistence dlFileVersionPersistence;
	@BeanReference(type = DLFolderLocalService.class)
	protected DLFolderLocalService dlFolderLocalService;
	@BeanReference(type = DLFolderService.class)
	protected DLFolderService dlFolderService;
	@BeanReference(type = DLFolderPersistence.class)
	protected DLFolderPersistence dlFolderPersistence;
	@BeanReference(type = DLFolderFinder.class)
	protected DLFolderFinder dlFolderFinder;
	@BeanReference(type = CounterLocalService.class)
	protected CounterLocalService counterLocalService;
	@BeanReference(type = DLLocalService.class)
	protected DLLocalService dlLocalService;
	@BeanReference(type = DLService.class)
	protected DLService dlService;
	@BeanReference(type = GroupLocalService.class)
	protected GroupLocalService groupLocalService;
	@BeanReference(type = GroupService.class)
	protected GroupService groupService;
	@BeanReference(type = GroupPersistence.class)
	protected GroupPersistence groupPersistence;
	@BeanReference(type = GroupFinder.class)
	protected GroupFinder groupFinder;
	@BeanReference(type = LayoutLocalService.class)
	protected LayoutLocalService layoutLocalService;
	@BeanReference(type = LayoutService.class)
	protected LayoutService layoutService;
	@BeanReference(type = LayoutPersistence.class)
	protected LayoutPersistence layoutPersistence;
	@BeanReference(type = LayoutFinder.class)
	protected LayoutFinder layoutFinder;
	@BeanReference(type = LockLocalService.class)
	protected LockLocalService lockLocalService;
	@BeanReference(type = LockPersistence.class)
	protected LockPersistence lockPersistence;
	@BeanReference(type = ResourceLocalService.class)
	protected ResourceLocalService resourceLocalService;
	@BeanReference(type = ResourceService.class)
	protected ResourceService resourceService;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = ResourceFinder.class)
	protected ResourceFinder resourceFinder;
	@BeanReference(type = UserLocalService.class)
	protected UserLocalService userLocalService;
	@BeanReference(type = UserService.class)
	protected UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	@BeanReference(type = UserFinder.class)
	protected UserFinder userFinder;
	@BeanReference(type = WebDAVPropsLocalService.class)
	protected WebDAVPropsLocalService webDAVPropsLocalService;
	@BeanReference(type = WebDAVPropsPersistence.class)
	protected WebDAVPropsPersistence webDAVPropsPersistence;
	@BeanReference(type = ExpandoValueLocalService.class)
	protected ExpandoValueLocalService expandoValueLocalService;
	@BeanReference(type = ExpandoValueService.class)
	protected ExpandoValueService expandoValueService;
	@BeanReference(type = ExpandoValuePersistence.class)
	protected ExpandoValuePersistence expandoValuePersistence;
}