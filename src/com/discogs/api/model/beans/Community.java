package com.discogs.api.model.beans;

import java.util.List;

public class Community {
	String status;
	Rating rating;
	int have;
	List<User> contributors;
	int want;
	User submitter;
	String dataQuality;

	public String getStatus() {
		return status;
	}

	public Rating getRating() {
		return rating;
	}

	public int getHave() {
		return have;
	}

	public List<User> getContributors() {
		return contributors;
	}

	public int getWant() {
		return want;
	}

	public User getSubmitter() {
		return submitter;
	}

	public String getData_quality() {
		return dataQuality;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setRating(Rating rating) {
		this.rating = rating;
	}

	public void setHave(int have) {
		this.have = have;
	}

	public void setContributors(List<User> contributors) {
		this.contributors = contributors;
	}

	public void setWant(int want) {
		this.want = want;
	}

	public void setSubmitter(User submitter) {
		this.submitter = submitter;
	}

	public void setData_quality(String data_quality) {
		this.dataQuality = data_quality;
	}

	@Override
	public String toString() {
		return "Community [status=" + status + ", rating=" + rating + ", have="
				+ have + ", contributors=" + contributors + ", want=" + want
				+ ", submitter=" + submitter + ", dataQuality=" + dataQuality
				+ "]";
	}
}
