package com.discogs.api.model.beans;

public class Image {
	private String uri;
	private int height;
	private int width;
	private String resourceUrl;
	private String type;
	private String uri150;

	public String getUri() {
		return uri;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public String getResourceUrl() {
		return resourceUrl;
	}

	public String getType() {
		return type;
	}

	public String getUri150() {
		return uri150;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setResourceUrl(String resourceUrl) {
		this.resourceUrl = resourceUrl;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setUri150(String uri150) {
		this.uri150 = uri150;
	}

	@Override
	public String toString() {
		return "Image [uri=" + uri + ", height=" + height + ", width=" + width
				+ ", resourceUrl=" + resourceUrl + ", type=" + type
				+ ", uri150=" + uri150 + "]";
	}
}
