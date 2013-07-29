package com.discogs.api.model;

import java.util.Arrays;

import com.discogs.api.model.BasicItem;

public class Artist extends BasicItem {
	private String realName;
	private String[] nameVariations;
	private String[] aliases;
	private String[] images;
	
	public String getRealName() {
		return realName;
	}

	public String[] getAliases() {
		return aliases;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public void setAliases(String[] aliases) {
		this.aliases = aliases;
	}

	public String[] getImages() {
		return images;
	}

	public void setImages(String[] images) {
		this.images = images;
	}

	public String[] getNameVariations() {
		return nameVariations;
	}

	public void setNameVariations(String[] nameVariations) {
		this.nameVariations = nameVariations;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Artist [realName=");
		builder.append(realName);
		builder.append(", nameVariations=");
		builder.append(Arrays.toString(nameVariations));
		builder.append(", aliases=");
		builder.append(Arrays.toString(aliases));
		builder.append(", images=");
		builder.append(Arrays.toString(images));
		builder.append(super.toString()).append("]");
		return builder.toString();
	}
	
}
