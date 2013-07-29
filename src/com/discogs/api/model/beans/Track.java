package com.discogs.api.model.beans;

import java.util.List;

import com.discogs.api.model.Artist;
import com.discogs.api.model.TrackArtist;

public class Track {
	private String duration;
	private String position;
	private String title;
	private List<TrackArtist> artists;
	private List<TrackArtist> extraArtists;

	/**
	 * @return the duration
	 */
	public String getDuration() {
		return duration;
	}

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param duration
	 *            the duration to set
	 */
	public void setDuration(String duration) {
		this.duration = duration;
	}

	/**
	 * @param position
	 *            the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	public List<TrackArtist> getArtists() {
		return artists;
	}

	public void setArtists(List<TrackArtist> list) {
		this.artists = list;
	}

	public List<TrackArtist> getExtraArtists() {
		return extraArtists;
	}

	public void setExtraArtists(List<TrackArtist> extraArtists) {
		this.extraArtists = extraArtists;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Track [duration=");
		builder.append(duration);
		builder.append(", position=");
		builder.append(position);
		builder.append(", title=");
		builder.append(title);
		builder.append(", artists=");
		builder.append(artists);
		builder.append(", extraArtists=");
		builder.append(extraArtists);
		builder.append("]");
		return builder.toString();
	}

}
