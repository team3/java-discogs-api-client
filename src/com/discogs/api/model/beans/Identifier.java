package com.discogs.api.model.beans;

public class Identifier {
	private String type;
	private String description;
	private String value;

	public String getType() {
		return type;
	}

	public String getDescription() {
		return description;
	}

	public String getValue() {
		return value;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Identifier [type=" + type + ", description=" + description
				+ ", value=" + value + "]";
	}

}
