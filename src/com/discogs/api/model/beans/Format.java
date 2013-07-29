package com.discogs.api.model.beans;

import java.util.Arrays;

public class Format {
	private String[] descriptions;
	private String name;
	private int qty;

	/**
	 * @return the descriptions
	 */
	public String[] getDescriptions() {
		return descriptions;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the qty
	 */
	public int getQty() {
		return qty;
	}

	/**
	 * @param descriptions
	 *            the descriptions to set
	 */
	public void setDescriptions(String[] descriptions) {
		this.descriptions = descriptions;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param qty
	 *            the qty to set
	 */
	public void setQty(int qty) {
		this.qty = qty;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Format [descriptions=");
		builder.append(Arrays.toString(descriptions));
		builder.append(", name=");
		builder.append(name);
		builder.append(", qty=");
		builder.append(qty);
		builder.append("]");
		return builder.toString();
	}

}
