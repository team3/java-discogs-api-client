package com.discogs.api.model;

public abstract class BasicItem {
	private String resourceUrl;
	private String name;
	private long id;
	private String uri;
	private String dataQuality;

	/**
	 * @return the resourceUrl
	 */
	public String getResourceUrl() {
		return resourceUrl;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the uri
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * @return the dataQuality
	 */
	public String getDataQuality() {
		return dataQuality;
	}

	/**
	 * @param resourceUrl
	 *            the resourceUrl to set
	 */
	public void setResourceUrl(String resourceUrl) {
		this.resourceUrl = resourceUrl;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @param uri
	 *            the uri to set
	 */
	public void setUri(String uri) {
		this.uri = uri;
	}

	/**
	 * @param dataQuality
	 *            the dataQuality to set
	 */
	public void setDataQuality(String dataQuality) {
		this.dataQuality = dataQuality;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BasicItem [resourceUrl=");
		builder.append(resourceUrl);
		builder.append(", name=");
		builder.append(name);
		builder.append(", id=");
		builder.append(id);
		builder.append(", uri=");
		builder.append(uri);
		builder.append(", dataQuality=");
		builder.append(dataQuality);
		builder.append("]");
		return builder.toString();
	}
}
