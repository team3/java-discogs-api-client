package com.discogs.api.model;

import java.util.List;

import com.discogs.api.model.beans.Image;

public class Label extends BasicItem {
	private String catno;
	private String entitType;
	private String profile;
	private String releasesUrl;
	private String contactInfo;
	private Label parentLabel;
	private String[] subLabels;
	private String[] urls;
	private List<Image> images;
	
	
	public String getCatno() {
		return catno;
	}

	public String getEntitType() {
		return entitType;
	}

	public void setCatno(String catno) {
		this.catno = catno;
	}

	public void setEntitType(String entitType) {
		this.entitType = entitType;
	}

	/**
	 * @return the profile
	 */
	public String getProfile() {
		return profile;
	}

	/**
	 * @return the releasesUrl
	 */
	public String getReleasesUrl() {
		return releasesUrl;
	}

	/**
	 * @return the contactInfo
	 */
	public String getContactInfo() {
		return contactInfo;
	}

	/**
	 * @return the parentLabel
	 */
	public Label getParentLabel() {
		return parentLabel;
	}

	/**
	 * @return the subLabels
	 */
	public String[] getSubLabels() {
		return subLabels;
	}

	/**
	 * @return the urls
	 */
	public String[] getUrls() {
		return urls;
	}

	/**
	 * @return the images
	 */
	public List<Image> getImages() {
		return images;
	}

	/**
	 * @param profile the profile to set
	 */
	public void setProfile(String profile) {
		this.profile = profile;
	}

	/**
	 * @param releasesUrl the releasesUrl to set
	 */
	public void setReleasesUrl(String releasesUrl) {
		this.releasesUrl = releasesUrl;
	}

	/**
	 * @param contactInfo the contactInfo to set
	 */
	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}

	/**
	 * @param parentLabel the parentLabel to set
	 */
	public void setParentLabel(Label parentLabel) {
		this.parentLabel = parentLabel;
	}

	/**
	 * @param subLabels the subLabels to set
	 */
	public void setSubLabels(String[] subLabels) {
		this.subLabels = subLabels;
	}

	/**
	 * @param strings the urls to set
	 */
	public void setUrls(String[] strings) {
		this.urls = strings;
	}

	/**
	 * @param images the images to set
	 */
	public void setImages(List<Image> images) {
		this.images = images;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Label [catno=");
		builder.append(catno);
		builder.append(", entitType=");
		builder.append(entitType);
		builder.append(", profile=");
		builder.append(profile);
		builder.append(", releasesUrl=");
		builder.append(releasesUrl);
		builder.append(", contactInfo=");
		builder.append(contactInfo);
		builder.append(", parentLabel=");
		builder.append(parentLabel);
		builder.append(", subLabels=");
		builder.append(subLabels);
		builder.append(", urls=");
		builder.append(urls);
		builder.append(", images=");
		builder.append(images);
		builder.append("]");
		return builder.toString();
	}

}
