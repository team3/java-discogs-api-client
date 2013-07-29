package com.discogs.api.model.beans;

import com.discogs.api.model.Release;

public class OrderItemBean {
	private Release release;
	private PriceBean price;
	private long id;

	/**
	 * @return the release
	 */
	public Release getRelease() {
		return release;
	}

	/**
	 * @return the price
	 */
	public PriceBean getPrice() {
		return price;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param release
	 *            the release to set
	 */
	public void setRelease(Release release) {
		this.release = release;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(PriceBean price) {
		this.price = price;
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
		builder.append("OrderItemBean [release=");
		builder.append(release);
		builder.append(", price=");
		builder.append(price);
		builder.append(", id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}
}
