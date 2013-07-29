package com.discogs.api.model.beans;

import com.discogs.api.model.BasicItem;

public class User extends BasicItem {
	private String name;
	private String username;
	private String inventoryUrl;
	private String collectionFoldersUrl;
	private String collectionFieldsUrl;
	private String wantlistUrl;
	private String profile;
	private String homePage;
	private String location;
	private String registered;
	private int numLists;
	private int numForSale;
	private int numCollection;
	private int numWantlist;
	private int numPending;
	private int releasesContributed;
	private double rank;
	private int releasesRated;
	private double ratingAvg;
	private boolean isFriend;
	
	/**
	 * @return the inventoryUrl
	 */
	public String getInventoryUrl() {
		return inventoryUrl;
	}

	/**
	 * @return the collectionFoldersUrl
	 */
	public String getCollectionFoldersUrl() {
		return collectionFoldersUrl;
	}

	/**
	 * @return the collectionFieldsUrl
	 */
	public String getCollectionFieldsUrl() {
		return collectionFieldsUrl;
	}

	/**
	 * @return the wantlistUrl
	 */
	public String getWantlistUrl() {
		return wantlistUrl;
	}

	/**
	 * @return the profile
	 */
	public String getProfile() {
		return profile;
	}

	/**
	 * @return the homePage
	 */
	public String getHomePage() {
		return homePage;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @return the registered
	 */
	public String getRegistered() {
		return registered;
	}

	/**
	 * @return the numLists
	 */
	public int getNumLists() {
		return numLists;
	}

	/**
	 * @return the numForSale
	 */
	public int getNumForSale() {
		return numForSale;
	}

	/**
	 * @return the numCollection
	 */
	public int getNumCollection() {
		return numCollection;
	}

	/**
	 * @return the numWantlist
	 */
	public int getNumWantlist() {
		return numWantlist;
	}

	/**
	 * @return the numPending
	 */
	public int getNumPending() {
		return numPending;
	}

	/**
	 * @return the releasesContributed
	 */
	public int getReleasesContributed() {
		return releasesContributed;
	}

	/**
	 * @return the rank
	 */
	public double getRank() {
		return rank;
	}

	/**
	 * @return the releasesRated
	 */
	public int getReleasesRated() {
		return releasesRated;
	}

	/**
	 * @return the ratingAvg
	 */
	public double getRatingAvg() {
		return ratingAvg;
	}

	/**
	 * @return the isFriend
	 */
	public boolean isFriend() {
		return isFriend;
	}

	/**
	 * @param inventoryUrl the inventoryUrl to set
	 */
	public void setInventoryUrl(String inventoryUrl) {
		this.inventoryUrl = inventoryUrl;
	}

	/**
	 * @param collectionFoldersUrl the collectionFoldersUrl to set
	 */
	public void setCollectionFoldersUrl(String collectionFoldersUrl) {
		this.collectionFoldersUrl = collectionFoldersUrl;
	}

	/**
	 * @param collectionFieldsUrl the collectionFieldsUrl to set
	 */
	public void setCollectionFieldsUrl(String collectionFieldsUrl) {
		this.collectionFieldsUrl = collectionFieldsUrl;
	}

	/**
	 * @param wantlistUrl the wantlistUrl to set
	 */
	public void setWantlistUrl(String wantlistUrl) {
		this.wantlistUrl = wantlistUrl;
	}

	/**
	 * @param profile the profile to set
	 */
	public void setProfile(String profile) {
		this.profile = profile;
	}

	/**
	 * @param homePage the homePage to set
	 */
	public void setHomePage(String homePage) {
		this.homePage = homePage;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @param registered the registered to set
	 */
	public void setRegistered(String registered) {
		this.registered = registered;
	}

	/**
	 * @param numLists the numLists to set
	 */
	public void setNumLists(int numLists) {
		this.numLists = numLists;
	}

	/**
	 * @param numForSale the numForSale to set
	 */
	public void setNumForSale(int numForSale) {
		this.numForSale = numForSale;
	}

	/**
	 * @param numCollection the numCollection to set
	 */
	public void setNumCollection(int numCollection) {
		this.numCollection = numCollection;
	}

	/**
	 * @param numWantlist the numWantlist to set
	 */
	public void setNumWantlist(int numWantlist) {
		this.numWantlist = numWantlist;
	}

	/**
	 * @param numPending the numPending to set
	 */
	public void setNumPending(int numPending) {
		this.numPending = numPending;
	}

	/**
	 * @param releasesContributed the releasesContributed to set
	 */
	public void setReleasesContributed(int releasesContributed) {
		this.releasesContributed = releasesContributed;
	}

	/**
	 * @param rank the rank to set
	 */
	public void setRank(double rank) {
		this.rank = rank;
	}

	/**
	 * @param releasesRated the releasesRated to set
	 */
	public void setReleasesRated(int releasesRated) {
		this.releasesRated = releasesRated;
	}

	/**
	 * @param ratingAvg the ratingAvg to set
	 */
	public void setRatingAvg(double ratingAvg) {
		this.ratingAvg = ratingAvg;
	}

	/**
	 * @param isFriend the isFriend to set
	 */
	public void setFriend(boolean isFriend) {
		this.isFriend = isFriend;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [username=");
		builder.append(username);
		builder.append(", inventoryUrl=");
		builder.append(inventoryUrl);
		builder.append(", collectionFoldersUrl=");
		builder.append(collectionFoldersUrl);
		builder.append(", collectionFieldsUrl=");
		builder.append(collectionFieldsUrl);
		builder.append(", wantlistUrl=");
		builder.append(wantlistUrl);
		builder.append(", profile=");
		builder.append(profile);
		builder.append(", homePage=");
		builder.append(homePage);
		builder.append(", location=");
		builder.append(location);
		builder.append(", registered=");
		builder.append(registered);
		builder.append(", numLists=");
		builder.append(numLists);
		builder.append(", numForSale=");
		builder.append(numForSale);
		builder.append(", numCollection=");
		builder.append(numCollection);
		builder.append(", numWantlist=");
		builder.append(numWantlist);
		builder.append(", numPending=");
		builder.append(numPending);
		builder.append(", releasesContributed=");
		builder.append(releasesContributed);
		builder.append(", rank=");
		builder.append(rank);
		builder.append(", releasesRated=");
		builder.append(releasesRated);
		builder.append(", ratingAvg=");
		builder.append(ratingAvg);
		builder.append(", isFriend=");
		builder.append(isFriend).append(", ").append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	
}
