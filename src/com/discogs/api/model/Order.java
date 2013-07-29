package com.discogs.api.model;

import java.util.Arrays;
import java.util.List;

import com.discogs.api.model.beans.OrderItemBean;
import com.discogs.api.model.beans.PriceBean;
import com.discogs.api.model.beans.User;

public class Order extends BasicItem {
	
	private String orderId;
	private String messagesUrl;
	private String status;
	private String[] nextStatus;
	private PriceBean fee;
	private String created;
	private List<OrderItemBean> items;
	private PriceBean shipping;
	private String shippingAddress;
	private String additionalInstructions;
	private User seller;
	private String lastActivity;
	private User buyer;
	private PriceBean total;


	/**
	 * @return the orderId
	 */
	public String getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return the messagesUrl
	 */
	public String getMessagesUrl() {
		return messagesUrl;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @return the nextStatus
	 */
	public String[] getNextStatus() {
		return nextStatus;
	}

	/**
	 * @return the fee
	 */
	public PriceBean getFee() {
		return fee;
	}

	/**
	 * @return the created
	 */
	public String getCreated() {
		return created;
	}

	/**
	 * @return the items
	 */
	public List<OrderItemBean> getItems() {
		return items;
	}

	/**
	 * @return the shipping
	 */
	public PriceBean getShipping() {
		return shipping;
	}

	/**
	 * @return the shippingAddress
	 */
	public String getShippingAddress() {
		return shippingAddress;
	}

	/**
	 * @return the additionalInstructions
	 */
	public String getAdditionalInstructions() {
		return additionalInstructions;
	}

	/**
	 * @return the seller
	 */
	public User getSeller() {
		return seller;
	}

	/**
	 * @return the lastActivity
	 */
	public String getLastActivity() {
		return lastActivity;
	}

	/**
	 * @return the buyer
	 */
	public User getBuyer() {
		return buyer;
	}

	/**
	 * @return the total
	 */
	public PriceBean getTotal() {
		return total;
	}

	/**
	 * @param messagesUrl
	 *            the messagesUrl to set
	 */
	public void setMessagesUrl(String messagesUrl) {
		this.messagesUrl = messagesUrl;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @param nextStatus
	 *            the nextStatus to set
	 */
	public void setNextStatus(String[] nextStatus) {
		this.nextStatus = nextStatus;
	}

	/**
	 * @param fee
	 *            the fee to set
	 */
	public void setFee(PriceBean fee) {
		this.fee = fee;
	}

	/**
	 * @param created
	 *            the created to set
	 */
	public void setCreated(String created) {
		this.created = created;
	}

	/**
	 * @param items
	 *            the items to set
	 */
	public void setItems(List<OrderItemBean> items) {
		this.items = items;
	}

	/**
	 * @param shipping
	 *            the shipping to set
	 */
	public void setShipping(PriceBean shipping) {
		this.shipping = shipping;
	}

	/**
	 * @param shippingAddress
	 *            the shippingAddress to set
	 */
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	/**
	 * @param additionalInstructions
	 *            the additionalInstructions to set
	 */
	public void setAdditionalInstructions(String additionalInstructions) {
		this.additionalInstructions = additionalInstructions;
	}

	/**
	 * @param seller
	 *            the seller to set
	 */
	public void setSeller(User seller) {
		this.seller = seller;
	}

	/**
	 * @param lastActivity
	 *            the lastActivity to set
	 */
	public void setLastActivity(String lastActivity) {
		this.lastActivity = lastActivity;
	}

	/**
	 * @param buyer
	 *            the buyer to set
	 */
	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}

	/**
	 * @param total
	 *            the total to set
	 */
	public void setTotal(PriceBean total) {
		this.total = total;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Order [orderId=");
		builder.append(orderId);
		builder.append(", messagesUrl=");
		builder.append(messagesUrl);
		builder.append(", status=");
		builder.append(status);
		builder.append(", nextStatus=");
		builder.append(Arrays.toString(nextStatus));
		builder.append(", fee=");
		builder.append(fee);
		builder.append(", created=");
		builder.append(created);
		builder.append(", items=");
		builder.append(items);
		builder.append(", shipping=");
		builder.append(shipping);
		builder.append(", shippingAddress=");
		builder.append(shippingAddress);
		builder.append(", additionalInstructions=");
		builder.append(additionalInstructions);
		builder.append(", seller=");
		builder.append(seller);
		builder.append(", lastActivity=");
		builder.append(lastActivity);
		builder.append(", buyer=");
		builder.append(buyer);
		builder.append(", total=");
		builder.append(total);
		builder.append("]");
		return builder.toString();
	}

}
