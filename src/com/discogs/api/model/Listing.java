package com.discogs.api.model;

import com.discogs.api.model.beans.PriceBean;
import com.discogs.api.model.beans.User;

public class Listing extends BasicItem {
	private String status;
	private String posted;
	private String shipsFrom;
	private String comments;
	private String condition;
	private String sleeveCondition;
	private boolean audio;
	private boolean allowOffers;
	private User seller;
	private PriceBean price;
	private Release release;

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @return the posted
	 */
	public String getPosted() {
		return posted;
	}

	/**
	 * @return the shipsFrom
	 */
	public String getShipsFrom() {
		return shipsFrom;
	}

	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * @return the condition
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * @return the sleeveCondition
	 */
	public String getSleeveCondition() {
		return sleeveCondition;
	}

	/**
	 * @return the audio
	 */
	public boolean isAudio() {
		return audio;
	}

	/**
	 * @return the allowOffers
	 */
	public boolean isAllowOffers() {
		return allowOffers;
	}

	/**
	 * @return the sellers
	 */
	public User getSeller() {
		return seller;
	}

	/**
	 * @return the price
	 */
	public PriceBean getPrice() {
		return price;
	}

	/**
	 * @return the release
	 */
	public Release getRelease() {
		return release;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @param posted
	 *            the posted to set
	 */
	public void setPosted(String posted) {
		this.posted = posted;
	}

	/**
	 * @param shipsFrom
	 *            the shipsFrom to set
	 */
	public void setShipsFrom(String shipsFrom) {
		this.shipsFrom = shipsFrom;
	}

	/**
	 * @param comments
	 *            the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}

	/**
	 * @param condition
	 *            the condition to set
	 */
	public void setCondition(String condition) {
		this.condition = condition;
	}

	/**
	 * @param sleeveCondition
	 *            the sleeveCondition to set
	 */
	public void setSleeveCondition(String sleeveCondition) {
		this.sleeveCondition = sleeveCondition;
	}

	/**
	 * @param audio
	 *            the audio to set
	 */
	public void setAudio(boolean audio) {
		this.audio = audio;
	}

	/**
	 * @param allowOffers
	 *            the allowOffers to set
	 */
	public void setAllowOffers(boolean allowOffers) {
		this.allowOffers = allowOffers;
	}

	/**
	 * @param seller
	 *            the sellers to set
	 */
	public void setSeller(User seller) {
		this.seller = seller;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(PriceBean price) {
		this.price = price;
	}

	/**
	 * @param release
	 *            the release to set
	 */
	public void setRelease(Release release) {
		this.release = release;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Listing [status=");
		builder.append(status);
		builder.append(", posted=");
		builder.append(posted);
		builder.append(", shipsFrom=");
		builder.append(shipsFrom);
		builder.append(", comments=");
		builder.append(comments);
		builder.append(", condition=");
		builder.append(condition);
		builder.append(", sleeveCondition=");
		builder.append(sleeveCondition);
		builder.append(", audio=");
		builder.append(audio);
		builder.append(", allowOffers=");
		builder.append(allowOffers);
		builder.append(", seller=");
		builder.append(seller);
		builder.append(", price=");
		builder.append(price);
		builder.append(", release=");
		builder.append(release).append(", " + super.toString());
		builder.append("]");
		return builder.toString();
	}
}
