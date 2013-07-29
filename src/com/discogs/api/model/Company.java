package com.discogs.api.model;

public class Company extends BasicItem {
	private int entityType;
	private String catno;
	private String entityTypeName;

	/**
	 * @return the entityType
	 */
	public int getEntityType() {
		return entityType;
	}

	/**
	 * @return the catno
	 */
	public String getCatno() {
		return catno;
	}

	/**
	 * @return the entityTypeName
	 */
	public String getEntityTypeName() {
		return entityTypeName;
	}

	/**
	 * @param entityType
	 *            the entityType to set
	 */
	public void setEntityType(int entityType) {
		this.entityType = entityType;
	}

	/**
	 * @param catno
	 *            the catno to set
	 */
	public void setCatno(String catno) {
		this.catno = catno;
	}

	/**
	 * @param entityTypeName
	 *            the entityTypeName to set
	 */
	public void setEntityTypeName(String entityTypeName) {
		this.entityTypeName = entityTypeName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Company [entityType=");
		builder.append(entityType);
		builder.append(", catno=");
		builder.append(catno);
		builder.append(", entityTypeName=");
		builder.append(entityTypeName);
		builder.append("]");
		return builder.toString();
	}

}
