package com.discogs.api.model;

import java.util.Arrays;
import java.util.List;

import com.discogs.api.model.beans.Community;
import com.discogs.api.model.beans.Format;
import com.discogs.api.model.beans.Identifier;
import com.discogs.api.model.beans.Image;
import com.discogs.api.model.beans.Track;
import com.discogs.api.model.beans.Video;

public class Release extends BasicItem {
	private List<TrackArtist> artists;
	private Community community;
	private List<Company> companies;
	private String country;
	private List<Artist> extraArtists;
	private List<Format> formats;
	private String[] genres;
	private List<Identifier> identifiers;
	private List<Image> images;
	private List<Label> labels;
	private long masterId;
	private String masterUrl;
	private String notes;
	private String released;
	private String releaseFormatted;
	private String[] series;
	private String status;
	private String[] styles;
	private String thumb;
	private String title;
	private List<Track> tracklist;
	private List<Video> videos;
	private int year;
	private String catalogNumber;
	private String description;
	
	/**
	 * @return the artists
	 */
	public List<TrackArtist> getArtists() {
		return artists;
	}

	/**
	 * @return the community
	 */
	public Community getCommunity() {
		return community;
	}

	/**
	 * @return the companies
	 */
	public List<Company> getCompanies() {
		return companies;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @return the extraArtists
	 */
	public List<Artist> getExtraArtists() {
		return extraArtists;
	}

	/**
	 * @return the formats
	 */
	public List<Format> getFormats() {
		return formats;
	}

	/**
	 * @return the genres
	 */
	public String[] getGenres() {
		return genres;
	}

	/**
	 * @return the identifiers
	 */
	public List<Identifier> getIdentifiers() {
		return identifiers;
	}

	/**
	 * @return the images
	 */
	public List<Image> getImages() {
		return images;
	}

	/**
	 * @return the labels
	 */
	public List<Label> getLabels() {
		return labels;
	}

	/**
	 * @return the masterId
	 */
	public long getMasterId() {
		return masterId;
	}

	/**
	 * @return the masterUrl
	 */
	public String getMasterUrl() {
		return masterUrl;
	}

	/**
	 * @return the notes
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * @return the released
	 */
	public String getReleased() {
		return released;
	}

	/**
	 * @return the releaseFormatted
	 */
	public String getReleaseFormatted() {
		return releaseFormatted;
	}

	/**
	 * @return the series
	 */
	public String[] getSeries() {
		return series;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @return the styles
	 */
	public String[] getStyles() {
		return styles;
	}

	/**
	 * @return the thumb
	 */
	public String getThumb() {
		return thumb;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the tracklist
	 */
	public List<Track> getTracklist() {
		return tracklist;
	}

	/**
	 * @return the videos
	 */
	public List<Video> getVideos() {
		return videos;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param list
	 *            the artists to set
	 */
	public void setArtists(List<TrackArtist> list) {
		this.artists = list;
	}

	/**
	 * @param community
	 *            the community to set
	 */
	public void setCommunity(Community community) {
		this.community = community;
	}

	/**
	 * @param companies
	 *            the companies to set
	 */
	public void setCompanies(List<Company> companies) {
		this.companies = companies;
	}

	/**
	 * @param country
	 *            the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @param extraArtists
	 *            the extraArtists to set
	 */
	public void setExtraArtists(List<Artist> extraArtists) {
		this.extraArtists = extraArtists;
	}

	/**
	 * @param formats
	 *            the formats to set
	 */
	public void setFormats(List<Format> formats) {
		this.formats = formats;
	}

	/**
	 * @param genres
	 *            the genres to set
	 */
	public void setGenres(String[] genres) {
		this.genres = genres;
	}

	/**
	 * @param identifiers
	 *            the identifiers to set
	 */
	public void setIdentifiers(List<Identifier> identifiers) {
		this.identifiers = identifiers;
	}

	/**
	 * @param images
	 *            the images to set
	 */
	public void setImages(List<Image> images) {
		this.images = images;
	}

	/**
	 * @param labels
	 *            the labels to set
	 */
	public void setLabels(List<Label> labels) {
		this.labels = labels;
	}

	/**
	 * @param masterId
	 *            the masterId to set
	 */
	public void setMasterId(long masterId) {
		this.masterId = masterId;
	}

	/**
	 * @param masterUrl
	 *            the masterUrl to set
	 */
	public void setMasterUrl(String masterUrl) {
		this.masterUrl = masterUrl;
	}

	/**
	 * @param notes
	 *            the notes to set
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	}

	/**
	 * @param released
	 *            the released to set
	 */
	public void setReleased(String released) {
		this.released = released;
	}

	/**
	 * @param releaseFormatted
	 *            the releaseFormatted to set
	 */
	public void setReleaseFormatted(String releaseFormatted) {
		this.releaseFormatted = releaseFormatted;
	}

	/**
	 * @param series
	 *            the series to set
	 */
	public void setSeries(String[] series) {
		this.series = series;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @param styles
	 *            the styles to set
	 */
	public void setStyles(String[] styles) {
		this.styles = styles;
	}

	/**
	 * @param thumb
	 *            the thumb to set
	 */
	public void setThumb(String thumb) {
		this.thumb = thumb;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @param tracklist
	 *            the tracklist to set
	 */
	public void setTracklist(List<Track> tracklist) {
		this.tracklist = tracklist;
	}

	/**
	 * @param videos
	 *            the videos to set
	 */
	public void setVideos(List<Video> videos) {
		this.videos = videos;
	}

	/**
	 * @param year
	 *            the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the catalogNumber
	 */
	public String getCatalogNumber() {
		return catalogNumber;
	}

	/**
	 * @param catalogNumber the catalogNumber to set
	 */
	public void setCatalogNumber(String catalogNumber) {
		this.catalogNumber = catalogNumber;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Release [artists=");
		builder.append(artists);
		builder.append(", community=");
		builder.append(community);
		builder.append(", companies=");
		builder.append(companies);
		builder.append(", country=");
		builder.append(country);
		builder.append(", extraArtists=");
		builder.append(extraArtists);
		builder.append(", formats=");
		builder.append(formats);
		builder.append(", genres=");
		builder.append(Arrays.toString(genres));
		builder.append(", identifiers=");
		builder.append(identifiers);
		builder.append(", images=");
		builder.append(images);
		builder.append(", labels=");
		builder.append(labels);
		builder.append(", masterId=");
		builder.append(masterId);
		builder.append(", masterUrl=");
		builder.append(masterUrl);
		builder.append(", notes=");
		builder.append(notes);
		builder.append(", released=");
		builder.append(released);
		builder.append(", releaseFormatted=");
		builder.append(releaseFormatted);
		builder.append(", series=");
		builder.append(Arrays.toString(series));
		builder.append(", status=");
		builder.append(status);
		builder.append(", styles=");
		builder.append(Arrays.toString(styles));
		builder.append(", thumb=");
		builder.append(thumb);
		builder.append(", title=");
		builder.append(title);
		builder.append(", tracklist=");
		builder.append(tracklist);
		builder.append(", videos=");
		builder.append(videos);
		builder.append(", year=");
		builder.append(year);
		builder.append(", catalogNumber=");
		builder.append(catalogNumber);
		builder.append(", description=");
		builder.append(description);
		builder.append("]");
		return builder.toString();
	}

}
