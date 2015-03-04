/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs;

/**
 * ConceptMapType are used to define relationships between concepts and concept reference terms e.g
 * IS_A or SAME_AS, BROADER_THAN
 * 
 * @since 1.9
 */
public class ConceptMapType extends BaseOpenmrsMetadata implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer conceptMapTypeId;
	
	private Boolean isHidden = Boolean.FALSE;
	
	/** default constructor */
	public ConceptMapType() {
	}
	
	/** constructor with id */
	public ConceptMapType(Integer conceptMapTypeId) {
		this.conceptMapTypeId = conceptMapTypeId;
	}
	
	/**
	 * @return the conceptMapTypeId
	 */
	public Integer getConceptMapTypeId() {
		return conceptMapTypeId;
	}
	
	/**
	 * @param conceptMapTypeId the conceptMapTypeId to set
	 */
	public void setConceptMapTypeId(Integer conceptMapTypeId) {
		this.conceptMapTypeId = conceptMapTypeId;
	}
	
	/**
	 * @return the isHidden
	 */
	public Boolean getIsHidden() {
		return isHidden;
	}
	
	/**
	 * @param isHidden the isHidden to set
	 */
	public void setIsHidden(Boolean isHidden) {
		this.isHidden = isHidden;
	}
	
	/**
	 * @see org.openmrs.OpenmrsObject#getId()
	 */
	public Integer getId() {
		return getConceptMapTypeId();
	}
	
	/**
	 * @see org.openmrs.OpenmrsObject#setId(java.lang.Integer)
	 */
	public void setId(Integer id) {
		setConceptMapTypeId(id);
	}
	
	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		if (getName() == null)
			return "";
		
		return getName();
	}
	
	/**
	 * Returns true if this concept map type is hidden otherwise false
	 * 
	 * @return
	 */
	public boolean isHidden() {
		return isHidden;
	}
}
