package com.discogs.api.model;

import java.util.Arrays;
import java.util.List;

public class SearchResults {
	private Pagination pagination;
	private List<Result> results;

	/**
	 * @return the pagination
	 */
	public Pagination getPagination() {
		return pagination;
	}

	/**
	 * @return the results
	 */
	public List<Result> getResults() {
		return results;
	}

	/**
	 * @param pagination the pagination to set
	 */
	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}

	/**
	 * @param results the results to set
	 */
	public void setResults(List<Result> results) {
		this.results = results;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SearchResults [pagination=");
		builder.append(pagination);
		builder.append(", results=");
		builder.append(results);
		builder.append("]");
		return builder.toString();
	}

	public static class Pagination {
		int perPage;
		long pages;
		int page;
		long items;
		Url urls;

		public static class Url {
			String next;
			String last;

			/**
			 * @return the next
			 */
			public String getNext() {
				return next;
			}

			/**
			 * @return the last
			 */
			public String getLast() {
				return last;
			}

			/**
			 * @param next
			 *            the next to set
			 */
			public void setNext(String next) {
				this.next = next;
			}

			/**
			 * @param last
			 *            the last to set
			 */
			public void setLast(String last) {
				this.last = last;
			}

			/* (non-Javadoc)
			 * @see java.lang.Object#toString()
			 */
			@Override
			public String toString() {
				StringBuilder builder = new StringBuilder();
				builder.append("Url [next=");
				builder.append(next);
				builder.append(", last=");
				builder.append(last);
				builder.append("]");
				return builder.toString();
			}
		}

		/**
		 * @return the perPage
		 */
		public int getPerPage() {
			return perPage;
		}

		/**
		 * @return the pages
		 */
		public long getPages() {
			return pages;
		}

		/**
		 * @return the page
		 */
		public int getPage() {
			return page;
		}

		/**
		 * @return the items
		 */
		public long getItems() {
			return items;
		}

		/**
		 * @return the urls
		 */
		public Url getUrls() {
			return urls;
		}

		/**
		 * @param perPage
		 *            the perPage to set
		 */
		public void setPerPage(int perPage) {
			this.perPage = perPage;
		}

		/**
		 * @param pages
		 *            the pages to set
		 */
		public void setPages(long pages) {
			this.pages = pages;
		}

		/**
		 * @param page
		 *            the page to set
		 */
		public void setPage(int page) {
			this.page = page;
		}

		/**
		 * @param items
		 *            the items to set
		 */
		public void setItems(long items) {
			this.items = items;
		}

		/**
		 * @param urls
		 *            the urls to set
		 */
		public void setUrls(Url urls) {
			this.urls = urls;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Pagination [perPage=");
			builder.append(perPage);
			builder.append(", pages=");
			builder.append(pages);
			builder.append(", page=");
			builder.append(page);
			builder.append(", items=");
			builder.append(items);
			builder.append(", urls=");
			builder.append(urls);
			builder.append("]");
			return builder.toString();
		}
	}

	public static class Result {
		private String[] style;
		private String title;
		private String country;
		private String[] format;
		private String uri;
		private String[] label;
		private String catno;
		private int year;
		private String[] genre;
		private String type;
		private long id;

		/**
		 * @return the style
		 */
		public String[] getStyle() {
			return style;
		}

		/**
		 * @return the title
		 */
		public String getTitle() {
			return title;
		}

		/**
		 * @return the country
		 */
		public String getCountry() {
			return country;
		}

		/**
		 * @return the format
		 */
		public String[] getFormat() {
			return format;
		}

		/**
		 * @return the uri
		 */
		public String getUri() {
			return uri;
		}

		/**
		 * @return the label
		 */
		public String[] getLabel() {
			return label;
		}

		/**
		 * @return the catno
		 */
		public String getCatno() {
			return catno;
		}

		/**
		 * @return the year
		 */
		public int getYear() {
			return year;
		}

		/**
		 * @return the genre
		 */
		public String[] getGenre() {
			return genre;
		}

		/**
		 * @return the id
		 */
		public long getId() {
			return id;
		}

		/**
		 * @param style
		 *            the style to set
		 */
		public void setStyle(String[] style) {
			this.style = style;
		}

		/**
		 * @param title
		 *            the title to set
		 */
		public void setTitle(String title) {
			this.title = title;
		}

		/**
		 * @param country
		 *            the country to set
		 */
		public void setCountry(String country) {
			this.country = country;
		}

		/**
		 * @param format
		 *            the format to set
		 */
		public void setFormat(String[] format) {
			this.format = format;
		}

		/**
		 * @param uri
		 *            the uri to set
		 */
		public void setUri(String uri) {
			this.uri = uri;
		}

		/**
		 * @param strings
		 *            the label to set
		 */
		public void setLabel(String[] strings) {
			this.label = strings;
		}

		/**
		 * @param catno
		 *            the catno to set
		 */
		public void setCatno(String catno) {
			this.catno = catno;
		}

		/**
		 * @param year
		 *            the year to set
		 */
		public void setYear(int year) {
			this.year = year;
		}

		/**
		 * @param genre
		 *            the genre to set
		 */
		public void setGenre(String[] genre) {
			this.genre = genre;
		}

		/**
		 * @param id
		 *            the id to set
		 */
		public void setId(long id) {
			this.id = id;
		}

		/**
		 * @return the type
		 */
		public String getType() {
			return type;
		}

		/**
		 * @param type the type to set
		 */
		public void setType(String type) {
			this.type = type;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Result [style=");
			builder.append(Arrays.toString(style));
			builder.append(", title=");
			builder.append(title);
			builder.append(", country=");
			builder.append(country);
			builder.append(", format=");
			builder.append(Arrays.toString(format));
			builder.append(", uri=");
			builder.append(uri);
			builder.append(", label=");
			builder.append(label);
			builder.append(", catno=");
			builder.append(catno);
			builder.append(", year=");
			builder.append(year);
			builder.append(", genre=");
			builder.append(Arrays.toString(genre));
			builder.append(", type=");
			builder.append(type);
			builder.append(", id=");
			builder.append(id);
			builder.append("]");
			return builder.toString();
		}
	}

}
