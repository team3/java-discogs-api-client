package com.discogs.api.model.beans;

public class Version {
	private String status;
	private String thumb;
	private String title;
	private String country;
	private String format;
	private String label;
	private String released;
	private String catno;
	private String resourceUrl;
	private long id;

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @return the thumb
	 */
	public String getThumb() {
		return thumb;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @return the format
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @return the released
	 */
	public String getReleased() {
		return released;
	}

	/**
	 * @return the catno
	 */
	public String getCatno() {
		return catno;
	}

	/**
	 * @return the resourceUrl
	 */
	public String getResourceUrl() {
		return resourceUrl;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @param thumb
	 *            the thumb to set
	 */
	public void setThumb(String thumb) {
		this.thumb = thumb;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @param country
	 *            the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @param format
	 *            the format to set
	 */
	public void setFormat(String format) {
		this.format = format;
	}

	/**
	 * @param label
	 *            the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * @param released
	 *            the released to set
	 */
	public void setReleased(String released) {
		this.released = released;
	}

	/**
	 * @param catno
	 *            the catno to set
	 */
	public void setCatno(String catno) {
		this.catno = catno;
	}

	/**
	 * @param resourceUrl
	 *            the resourceUrl to set
	 */
	public void setResourceUrl(String resourceUrl) {
		this.resourceUrl = resourceUrl;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Version [status=");
		builder.append(status);
		builder.append(", thumb=");
		builder.append(thumb);
		builder.append(", title=");
		builder.append(title);
		builder.append(", country=");
		builder.append(country);
		builder.append(", format=");
		builder.append(format);
		builder.append(", label=");
		builder.append(label);
		builder.append(", released=");
		builder.append(released);
		builder.append(", catno=");
		builder.append(catno);
		builder.append(", resourceUrl=");
		builder.append(resourceUrl);
		builder.append(", id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}

}
