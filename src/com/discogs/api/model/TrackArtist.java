package com.discogs.api.model;

public class TrackArtist extends BasicItem {
	private String join;
	private String anv;
	private String tracks;
	private String role;

	public String getJoin() {
		return join;
	}

	public String getAnv() {
		return anv;
	}

	public String getTracks() {
		return tracks;
	}

	public String getRole() {
		return role;
	}

	public void setJoin(String join) {
		this.join = join;
	}

	public void setAnv(String anv) {
		this.anv = anv;
	}

	public void setTracks(String tracks) {
		this.tracks = tracks;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TrackArtist [join=");
		builder.append(join);
		builder.append(", anv=");
		builder.append(anv);
		builder.append(", tracks=");
		builder.append(tracks);
		builder.append(", role=");
		builder.append(role);
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
