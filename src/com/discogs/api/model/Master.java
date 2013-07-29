package com.discogs.api.model;

import java.util.Arrays;
import java.util.List;

import com.discogs.api.model.beans.Image;
import com.discogs.api.model.beans.Track;
import com.discogs.api.model.beans.Version;
import com.discogs.api.model.beans.Video;

public class Master extends BasicItem {
	private String[] styles;
	private String[] genres;
	private List<Video> videos;
	private String title;
	private long mainRelease;
	private String mainReleaseUrl;
	private List<TrackArtist> artists;
	private String versionUrl;
	private List<Version> versions;
	private int year;
	private List<Image> images;
	private List<Track> tracklist;
	private long id;
	private String dataQuality;

	/**
	 * @return the styles
	 */
	public String[] getStyles() {
		return styles;
	}

	/**
	 * @return the genres
	 */
	public String[] getGenres() {
		return genres;
	}

	/**
	 * @return the videos
	 */
	public List<Video> getVideos() {
		return videos;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the mainRelease
	 */
	public long getMainRelease() {
		return mainRelease;
	}

	/**
	 * @return the mainReleaseUrl
	 */
	public String getMainReleaseUrl() {
		return mainReleaseUrl;
	}

	/**
	 * @return the artists
	 */
	public List<TrackArtist> getArtists() {
		return artists;
	}

	/**
	 * @return the versionUrl
	 */
	public String getVersionUrl() {
		return versionUrl;
	}

	/**
	 * @return the versions
	 */
	public List<Version> getVersions() {
		return versions;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @return the images
	 */
	public List<Image> getImages() {
		return images;
	}

	/**
	 * @return the tracklist
	 */
	public List<Track> getTracklist() {
		return tracklist;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the dataQuality
	 */
	public String getDataQuality() {
		return dataQuality;
	}

	/**
	 * @param styles
	 *            the styles to set
	 */
	public void setStyles(String[] styles) {
		this.styles = styles;
	}

	/**
	 * @param genres
	 *            the genres to set
	 */
	public void setGenres(String[] genres) {
		this.genres = genres;
	}

	/**
	 * @param videos
	 *            the videos to set
	 */
	public void setVideos(List<Video> videos) {
		this.videos = videos;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @param mainRelease
	 *            the mainRelease to set
	 */
	public void setMainRelease(long mainRelease) {
		this.mainRelease = mainRelease;
	}

	/**
	 * @param mainReleaseUrl
	 *            the mainReleaseUrl to set
	 */
	public void setMainReleaseUrl(String mainReleaseUrl) {
		this.mainReleaseUrl = mainReleaseUrl;
	}

	/**
	 * @param artists
	 *            the artists to set
	 */
	public void setArtists(List<TrackArtist> artists) {
		this.artists = artists;
	}

	/**
	 * @param versionUrl
	 *            the versionUrl to set
	 */
	public void setVersionUrl(String versionUrl) {
		this.versionUrl = versionUrl;
	}

	/**
	 * @param versions
	 *            the versions to set
	 */
	public void setVersions(List<Version> versions) {
		this.versions = versions;
	}

	/**
	 * @param year
	 *            the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @param images
	 *            the images to set
	 */
	public void setImages(List<Image> images) {
		this.images = images;
	}

	/**
	 * @param tracklist
	 *            the tracklist to set
	 */
	public void setTracklist(List<Track> tracklist) {
		this.tracklist = tracklist;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @param dataQuality
	 *            the dataQuality to set
	 */
	public void setDataQuality(String dataQuality) {
		this.dataQuality = dataQuality;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Master [styles=");
		builder.append(Arrays.toString(styles));
		builder.append(", genres=");
		builder.append(Arrays.toString(genres));
		builder.append(", videos=");
		builder.append(videos);
		builder.append(", title=");
		builder.append(title);
		builder.append(", mainRelease=");
		builder.append(mainRelease);
		builder.append(", mainReleaseUrl=");
		builder.append(mainReleaseUrl);
		builder.append(", artists=");
		builder.append(artists);
		builder.append(", versionUrl=");
		builder.append(versionUrl);
		builder.append(", versions=");
		builder.append(versions);
		builder.append(", year=");
		builder.append(year);
		builder.append(", images=");
		builder.append(images);
		builder.append(", tracklist=");
		builder.append(tracklist);
		builder.append(", id=");
		builder.append(id);
		builder.append(", dataQuality=");
		builder.append(dataQuality);
		builder.append("]");
		return builder.toString();
	}
}
