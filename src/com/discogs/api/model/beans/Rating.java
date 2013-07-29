package com.discogs.api.model.beans;

public class Rating {
	private int count;
	private String average;

	public int getCount() {
		return count;
	}

	public String getAverage() {
		return average;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void setAverage(String average) {
		this.average = average;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rating [count=");
		builder.append(count);
		builder.append(", average=");
		builder.append(average);
		builder.append("]");
		return builder.toString();
	}

}
