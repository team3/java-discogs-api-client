package com.discogs.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpProtocolParams;

import com.discogs.api.exceptions.ApiRequestException;
import com.discogs.api.exceptions.JsonValueObtainException;
import com.discogs.api.model.Artist;
import com.discogs.api.model.Company;
import com.discogs.api.model.Inventory;
import com.discogs.api.model.Label;
import com.discogs.api.model.Listing;
import com.discogs.api.model.Master;
import com.discogs.api.model.Order;
import com.discogs.api.model.Release;
import com.discogs.api.model.SearchResults;
import com.discogs.api.model.TrackArtist;
import com.discogs.api.model.beans.Community;
import com.discogs.api.model.beans.Format;
import com.discogs.api.model.beans.Identifier;
import com.discogs.api.model.beans.Image;
import com.discogs.api.model.beans.OrderItemBean;
import com.discogs.api.model.beans.PriceBean;
import com.discogs.api.model.beans.Rating;
import com.discogs.api.model.beans.Track;
import com.discogs.api.model.beans.User;
import com.discogs.api.model.beans.Version;
import com.discogs.api.model.beans.Video;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ApiClient {
	public static final String API_URL = "http://api.discogs.com";
	public static final String HEADER_USER_AGENT = "JavaDiscogsApiClient/1.0 +http://github.com";
	public static final String HEADER_ACCEPT = "application/json";
	public static final String HEADER_ACCEPT_ENCODING = "gzip,deflate";
	
	public static void main(String[] args) throws ClientProtocolException, IOException {
		ApiClient client = new ApiClient();
		try {
			Artist artist = client.getArtist(1);
			//Release release = client.getRelease("1");
			//Master master = client.getMaster("8471");
			//Label label = client.getLabel("Planet E");
			//Map<String, String> params = new HashMap<String, String>();
			//params.put("q", "Ken Ishii - Pneuma");
			//params.put("type", "release");
			//SearchResults search = client.search(params);
			//Listing listing = client.getListing("41578241");
			//Order order = client.getOrder()
			//System.out.println(listing.getRelease());
			
			//PriceBean fee = client.getFee(10.2333F, null);
			//User user = client.getProfile("rihanna");
			System.out.println(artist);
		} catch (ApiRequestException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * The Artist resource represents a person in the Discogs database who contributed to a Release in some capacity.
	 * Retrieves an artist by Name.
	 * 
	 * @param name 	name of the artist.
	 * @return an artist by name.
	 * @throws ApiRequestException
	 */
	public Artist getArtist(String name) throws ApiRequestException {
		JsonObject jsonArtist = call("artist", name, null, false);
		if (jsonArtist == null) return null;
		
		String id = getStringValueOrNull(jsonArtist, "id");
		Artist artist = null;
		if (id != null)
			artist = getArtist(Integer.parseInt(id));
		return artist;
	}
	
	/**
	 * The Artist resource represents a person in the Discogs database who contributed to a Release in some capacity.
	 * Retrieves an artist by ID.
	 * 
	 * @param id 	id of the artist.
	 * @return an artist by ID.
	 * @throws ApiRequestException
	 */
	public Artist getArtist(int id) throws ApiRequestException {
		JsonObject jsonArtist = call("artists", String.valueOf(id), null, false);
		if (jsonArtist == null) return null;
		
		Artist artist = new Artist();
		artist.setId(Long.valueOf(getStringValueOrNull(jsonArtist, "id")));
		artist.setName(getStringValueOrNull(jsonArtist, "name"));
		artist.setUri(getStringValueOrNull(jsonArtist, "uri"));
		artist.setNameVariations(getStringArrayValueOrNull(jsonArtist, "namevariations"));
		artist.setAliases(getStringArrayValueOrNull(jsonArtist, "aliases"));
		artist.setDataQuality(getStringValueOrNull(jsonArtist, "data_quality"));
		artist.setRealName(getStringValueOrNull(jsonArtist, "realname"));
		artist.setResourceUrl(getStringValueOrNull(jsonArtist, "resource_url"));
		// images
		JsonArray arrImages = jsonArtist.get("images").getAsJsonArray();
		List<String> images = new ArrayList<String>();
		for (int i = 0; i < arrImages.size(); i++) {
			JsonObject obj = arrImages.get(i).getAsJsonObject();
			JsonElement elUri = obj.get("uri");
			if (elUri != null) images.add(elUri.getAsString());
		}
		artist.setImages(images.toArray(new String[images.size()]));

		return artist;
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws ApiRequestException 
	 */
	public Release getRelease(String id) throws ApiRequestException {
		JsonObject jobj = call("release", id, null, true);
		if (jobj == null) return null;
		JsonObject jsonRelease = jobj.getAsJsonObject("release");
		if (jsonRelease == null) return null;
		
		Release release = new Release();
		release.setId(Long.valueOf(getStringValueOrNull(jsonRelease, "id")));
		release.setStatus(getStringValueOrNull(jsonRelease, "status"));
		release.setStyles(getStringArrayValueOrNull(jsonRelease, "styles"));
		try {
			release.setVideos(getObjectListOrNull(jsonRelease, "videos", Video.class));
		} catch (JsonValueObtainException e) {
			throw new ApiRequestException(e);
		}
		// TODO: set series!
		release.setReleaseFormatted(getStringValueOrNull(jsonRelease, "released_formatted"));
		try {
			release.setLabels(getObjectListOrNull(jsonRelease, "labels", Label.class));
		} catch (JsonValueObtainException e) {
			throw new ApiRequestException(e);
		}
		
		JsonObject objCommunity = jsonRelease.get("community").getAsJsonObject();
		if (objCommunity != null) {
			Community community = new Community();
			community.setStatus(getStringValueOrNull(objCommunity, "status"));
			try {
				community.setRating((Rating) getObjectValueOrNull(objCommunity, Rating.class));
			} catch (JsonValueObtainException e) {
				throw new ApiRequestException(e);
			}
			community.setHave(Integer.parseInt(getStringValueOrNull(objCommunity, "have")));
			try {
				community.setContributors(getObjectListOrNull(objCommunity, "contributors", User.class));
			} catch (JsonValueObtainException e) {
				throw new ApiRequestException(e);
			}
			community.setWant(Integer.parseInt(getStringValueOrNull(objCommunity, "want")));
			try {
				community.setSubmitter((User) getObjectValueOrNull(objCommunity, "submitter", User.class));
			} catch (JsonValueObtainException e) {
				throw new ApiRequestException(e);
			}
			community.setData_quality(getStringValueOrNull(objCommunity, "data_quality"));
			release.setCommunity(community);
		}
		
		release.setReleased(getStringValueOrNull(jsonRelease, "released"));
		release.setMasterUrl(getStringValueOrNull(jsonRelease, "master_url"));
		release.setYear(Utils.safeInt(getStringValueOrNull(jsonRelease, "year")));
		try {
			release.setImages(getObjectListOrNull(jsonRelease, "images", Image.class));
		} catch (JsonValueObtainException e) {
			throw new ApiRequestException(e);
		}
		release.setGenres(getStringArrayValueOrNull(jsonRelease, "genres"));
		release.setThumb(getStringValueOrNull(jsonRelease, "thumb"));
		try {
			release.setExtraArtists(getObjectListOrNull(jsonRelease, "extraartists", Artist.class));
		} catch (JsonValueObtainException e) {
			throw new ApiRequestException(e);
		}
		release.setTitle(getStringValueOrNull(jsonRelease, "title"));
		release.setCountry(getStringValueOrNull(jsonRelease, "country"));
		release.setNotes(getStringValueOrNull(jsonRelease, "notes"));
		try {
			release.setIdentifiers(getObjectListOrNull(jsonRelease, "identifiers", Identifier.class));
		} catch (JsonValueObtainException e) {
			throw new ApiRequestException(e);
		}
		try {
			release.setCompanies(getObjectListOrNull(jsonRelease, "companies", Company.class));
		} catch (JsonValueObtainException e) {
			throw new ApiRequestException(e);
		}
		release.setUri(getStringValueOrNull(jsonRelease, "uri"));
		try {
			release.setArtists(getObjectListOrNull(jsonRelease, "artists", TrackArtist.class));
		} catch (JsonValueObtainException e) {
			throw new ApiRequestException(e);
		}
		try {
			release.setFormats(getObjectListOrNull(jsonRelease, "formats", Format.class));
		} catch (JsonValueObtainException e) {
			throw new ApiRequestException(e);
		}
		JsonArray arrFormats = jsonRelease.get("formats").getAsJsonArray();
		List<Format> formats = new ArrayList<Format>(arrFormats.size());
		for (int i = 0; i < arrFormats.size(); i++) {
			JsonObject objFormat = arrFormats.get(i).getAsJsonObject();
			Format format = new Format();
			format.setDescriptions(getStringArrayValueOrNull(objFormat, "descriptions"));
			format.setName(getStringValueOrNull(objFormat, "name"));
			format.setQty(Utils.safeInt(getStringValueOrNull(objFormat, "qty")));
			formats.add(format);
		}
		release.setFormats(formats);
		release.setResourceUrl(getStringValueOrNull(jsonRelease, "resource_url"));
		release.setMasterId(Utils.safeLong(getStringValueOrNull(jsonRelease, "master_id")));
		
		JsonArray arrTracklist = jsonRelease.get("tracklist").getAsJsonArray();
		List<Track> tracklist = new ArrayList<Track>(arrTracklist.size());
		for (int i = 0; i < arrTracklist.size(); i++) {
			JsonObject objTrack = arrTracklist.get(i).getAsJsonObject();
			Track track = new Track();
			track.setDuration(getStringValueOrNull(objTrack, "duration"));
			track.setPosition(getStringValueOrNull(objTrack, "position"));
			track.setTitle(getStringValueOrNull(objTrack, "title"));
			try {
				track.setArtists(getObjectListOrNull(objTrack, "artists", TrackArtist.class));
				track.setExtraArtists(getObjectListOrNull(objTrack, "extraartists", TrackArtist.class));
			} catch (JsonValueObtainException e) {
				throw new ApiRequestException(e);
			}
			tracklist.add(track);
		}
		release.setTracklist(tracklist);
		release.setDataQuality(getStringValueOrNull(jsonRelease, "data_quality"));
		System.out.println(release.getArtists());
		return release;
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws ApiRequestException
	 */
	public Master getMaster(String id) throws ApiRequestException {
		JsonObject jobj = call("master", id, null, true);
		if (jobj == null) return null;
		JsonObject jsonMaster = jobj.getAsJsonObject();
		
		Master master = new Master();
		master.setStyles(getStringArrayValueOrNull(jsonMaster, "styles"));
		master.setGenres(getStringArrayValueOrNull(jsonMaster, "genres"));
		try {
			master.setVideos(getObjectListOrNull(jsonMaster, "videos", Video.class));
		} catch (JsonValueObtainException e) {
			throw new ApiRequestException(e);
		}
		master.setTitle(getStringValueOrNull(jsonMaster, "title"));
		master.setMainRelease(Long.parseLong(getStringValueOrNull(jsonMaster, "main_release")));
		master.setMainReleaseUrl(getStringValueOrNull(jsonMaster, "main_release_url"));
		try {
			master.setArtists(getObjectListOrNull(jsonMaster, "artists", TrackArtist.class));
		} catch (JsonValueObtainException e) {
			throw new ApiRequestException(e);
		}
		master.setVersionUrl(getStringValueOrNull(jsonMaster, "version_url"));
		try {
			master.setVersions(getObjectListOrNull(jsonMaster, "versions", Version.class));
		} catch (JsonValueObtainException e) {
			throw new ApiRequestException(e);
		}
		master.setYear(Integer.parseInt(getStringValueOrNull(jsonMaster, "year")));
		try {
			master.setImages(getObjectListOrNull(jsonMaster, "images", Image.class));
		} catch (JsonValueObtainException e) {
			throw new ApiRequestException(e);
		}
		master.setResourceUrl(getStringValueOrNull(jsonMaster, "resource_url"));
		try {
			master.setTracklist(getObjectListOrNull(jsonMaster, "tracklist", Track.class));
		} catch (JsonValueObtainException e) {
			throw new ApiRequestException(e);
		}
		master.setId(Long.parseLong(getStringValueOrNull(jsonMaster, "id")));
		master.setDataQuality(getStringValueOrNull(jsonMaster, "data_quality"));
		
		System.out.println(master);
		return master;
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws ApiRequestException
	 */
	public Label getLabel(String id) throws ApiRequestException {
		JsonObject jobj = call("label", id, null, true);
		if (jobj == null) return null;
		JsonObject jsonLabel = jobj.get("label").getAsJsonObject();
		Label label = new Label();
		label.setId(Long.parseLong(getStringValueOrNull(jsonLabel, "id")));
		label.setName(getStringValueOrNull(jsonLabel, "name"));
		label.setProfile(getStringValueOrNull(jsonLabel, "profile"));
		label.setResourceUrl(getStringValueOrNull(jsonLabel, "resource_url"));
		label.setReleasesUrl(getStringValueOrNull(jsonLabel, "releases_url"));
		label.setUri(getStringValueOrNull(jsonLabel, "uri"));
		label.setDataQuality(getStringValueOrNull(jsonLabel, "data_quality"));
		label.setContactInfo(getStringValueOrNull(jsonLabel, "contact_info"));
		try {
			label.setParentLabel((Label) getObjectValueOrNull(jsonLabel, Label.class));
		} catch (JsonValueObtainException e) {
			throw new ApiRequestException(e); 
		}
		// TODO: get all labels info
		label.setSubLabels(getStringArrayValueOrNull(jsonLabel, "sublabels"));
		
		label.setUrls(getStringArrayValueOrNull(jsonLabel, "urls"));
		try {
			label.setImages(getObjectListOrNull(jsonLabel, "images", Image.class));
		} catch (JsonValueObtainException e) {
			throw new ApiRequestException(e);
		}
		return label;
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws ApiRequestException
	 */
	public Image getImage(String id) throws ApiRequestException {
		JsonObject jsonImage = call("images", id, null, false);
		
		return null;
	}
	
	/**
	 * TODO: check the implementation
	 * The Search resource lists objects in the database that meet the criteria you specify.
	 * @param parameters
	 * @return
	 * @throws ApiRequestException
	 */
	public SearchResults search(Map<String, String> parameters) throws ApiRequestException {
		JsonObject jsonSearchResult = call("database", "search", parameters, false);
		if (jsonSearchResult == null) return null;
		SearchResults searchResult = new SearchResults();
		// ---------------------------------------
		JsonObject jsonPagination = jsonSearchResult.get("pagination").getAsJsonObject();
		if (jsonPagination == null) return null;
		//---------------------------------------
		SearchResults.Pagination pagination = new SearchResults.Pagination();
		pagination.setPerPage(Integer.parseInt(getStringValueOrNull(jsonPagination, "per_page")));
		pagination.setPages(Long.parseLong(getStringValueOrNull(jsonPagination, "pages")));
		pagination.setPage(Integer.parseInt(getStringValueOrNull(jsonPagination, "page")));
		pagination.setPages(Long.parseLong(getStringValueOrNull(jsonPagination, "items")));
		try {
			pagination.setUrls((SearchResults.Pagination.Url) getObjectValueOrNull(jsonPagination, "urls", SearchResults.Pagination.Url.class));
		} catch (JsonValueObtainException e) {
			throw new ApiRequestException(e);
		}
		searchResult.setPagination(pagination);
		
		// ---------------------------------------
		JsonArray jsonResults = jsonSearchResult.get("results").getAsJsonArray();
		
		List<SearchResults.Result> results = new ArrayList<SearchResults.Result>(jsonResults.size());
		
		for (Iterator<JsonElement> itr = jsonResults.iterator(); itr.hasNext();) {
			SearchResults.Result result = new SearchResults.Result();
			JsonObject obj = itr.next().getAsJsonObject();
			result.setStyle(getStringArrayValueOrNull(obj, "style"));
			result.setTitle(getStringValueOrNull(obj, "title"));
			result.setCountry(getStringValueOrNull(obj, "country"));
			result.setFormat(getStringArrayValueOrNull(obj, "format"));
			result.setUri(getStringValueOrNull(obj, "uri"));
			result.setLabel(getStringArrayValueOrNull(obj, "label"));
			result.setCatno(getStringValueOrNull(obj, "catno"));
			result.setYear(Integer.parseInt(getStringValueOrNull(obj, "year")));
			result.setGenre(getStringArrayValueOrNull(obj, "genre"));
			result.setType(getStringValueOrNull(obj, "type"));

			results.add(result);
		}
		searchResult.setResults(results);
		
		System.out.println("Search: " + searchResult);
		return searchResult;
	}
	
	/**
	 * Returns the list of listings in a user’s inventory.
	 * Basic information about each listing and the corresponding release is provided, suitable for display in a list. 
	 * For detailed information about the release, make another API call to fetch the corresponding Release.
	 * 
	 * @return
	 * @throws ApiRequestException
	 */
	public Inventory getInventory() throws ApiRequestException {
		throw new UnsupportedOperationException("method is not implemented"); 
	}
	
	/**
	 * The Listing resource allows you to view and manage Marketplace listings.
	 * @param id if of the lising.
	 * @return
	 */
	public Listing getListing(String id) throws ApiRequestException {
		JsonObject jobj = call("marketplace/listings", id, null, false);
		if (jobj == null) return null;
		Listing listing = new Listing();
		listing.setId(Long.parseLong(getStringValueOrNull(jobj, "id")));
		listing.setResourceUrl(getStringValueOrNull(jobj, "resource_url"));
		listing.setUri(getStringValueOrNull(jobj, "uri"));
		listing.setStatus(getStringValueOrNull(jobj, "status"));
		listing.setPosted(getStringValueOrNull(jobj, "posted"));
		listing.setShipsFrom(getStringValueOrNull(jobj, "ships_from"));
		listing.setComments(getStringValueOrNull(jobj, "comments"));
		listing.setCondition(getStringValueOrNull(jobj, "condition"));
		listing.setSleeveCondition(getStringValueOrNull(jobj, "sleeve_condition"));
		listing.setAudio(Boolean.getBoolean(getStringValueOrNull(jobj, "audio")));
		listing.setAllowOffers(Boolean.getBoolean(getStringValueOrNull(jobj, "allow_offers")));
		try {
			listing.setSeller((User) getObjectValueOrNull(jobj, "seller", User.class));
		} catch (JsonValueObtainException e) {
			throw new ApiRequestException(e);
		}
		try {
			listing.setPrice((PriceBean) getObjectValueOrNull(jobj, "price", PriceBean.class));
		} catch (JsonValueObtainException e) {
			throw new ApiRequestException(e);
		}
		try {
			listing.setRelease((Release) getObjectValueOrNull(jobj, "release", Release.class));
		} catch (JsonValueObtainException e) {
			throw new ApiRequestException(e);
		}
		
		return listing;
	}
	
	/**
	 * View the data associated with an order.
	 * Authentication as the seller is required.
	 * @param id
	 * @return
	 * @throws ApiRequestException
	 */
	public Order getOrder(String id) throws ApiRequestException {
		JsonObject jobj = call("marketplace/orders", id, null, false);
		if (jobj == null) return null;
		
		Order order = null;
		try {
			order = new Order();
			order.setOrderId(getStringValueOrNull(jobj, "id"));
			order.setResourceUrl(getStringValueOrNull(jobj, "resource_url"));
			order.setUri(getStringValueOrNull(jobj, "uri"));
			order.setStatus(getStringValueOrNull(jobj, "status"));
			order.setNextStatus(getStringArrayValueOrNull(jobj, "next_status"));
			order.setFee((PriceBean) getObjectValueOrNull(jobj, PriceBean.class));
			// TODO: use java.util.Date
			order.setCreated(getStringValueOrNull(jobj, "created"));
			JsonArray arrItems = jobj.get("items").getAsJsonArray();
			List<OrderItemBean> items = new ArrayList<OrderItemBean>(arrItems.size());
			for (Iterator<JsonElement> itr = arrItems.iterator(); itr.hasNext();) {
				OrderItemBean bean = new OrderItemBean();
				JsonObject jsonItem = itr.next().getAsJsonObject();
				bean.setRelease((Release) getObjectValueOrNull(jsonItem, "release", Release.class));
				bean.setPrice((PriceBean) getObjectValueOrNull(jsonItem, "price", PriceBean.class));
				bean.setId(Long.parseLong(getStringValueOrNull(jsonItem, "id")));
				
				items.add(bean);
			}
			order.setItems(items);
			order.setShipping((PriceBean) getObjectValueOrNull(jobj, "shipping", PriceBean.class));
			order.setShippingAddress(getStringValueOrNull(jobj, "shipping_address"));
			order.setAdditionalInstructions(getStringValueOrNull(jobj, "additional_instructions"));
			order.setSeller((User) getObjectValueOrNull(jobj, "seller", User.class));
			// TODO: use java.util.Date
			order.setLastActivity(getStringValueOrNull(jobj, "last_activity"));
			order.setBuyer((User) getObjectValueOrNull(jobj, "buyer", User.class));
			order.setTotal((PriceBean) getObjectValueOrNull(jobj, "total", PriceBean.class));
		} catch (JsonValueObtainException e) {
			throw new ApiRequestException(e);
		}
		return order;
	}
	
	/**
	 * The Fee resource allows you to quickly calculate the fee (in USD) for selling an item on the Marketplace.
	 * Calculate the fee for the provided price and currency.
	 * 
	 * @param price
	 * @return
	 * @throws ApiRequestException
	 */
	public PriceBean getFee(float price, String currency) throws ApiRequestException {
		PriceBean fee = null;
		Map<String, String> params = new HashMap<String, String>();
		if (currency != null) {
			params.put("currency", currency);
		}
		JsonObject jobj = call("marketplace/fee", String.valueOf(price), params, false);
		if (jobj == null) return null;
		
		try {
			fee = (PriceBean) getObjectValueOrNull(jobj, PriceBean.class);
		} catch (JsonValueObtainException e) {
			throw new ApiRequestException(e);
		}
		
		return fee;
	}
	
	/**
	 * The Profile resource represents user metadata, statistics, and preferences
	 * Retrieve a user by username.
	 * 
	 * @param username name of the user.

	 * @return
	 * @throws ApiRequestException
	 */
	public User getProfile(String username) throws ApiRequestException {
		User user = null;
	
		JsonObject jobj = call("users", username, null, false);
		if (jobj == null) return null;
		else user = new User();
		
		user.setId(Long.parseLong(getStringValueOrNull(jobj, "id")));
		user.setUsername(getStringValueOrNull(jobj, "username"));
		user.setInventoryUrl(getStringValueOrNull(jobj, "inventory_url"));
		user.setCollectionFoldersUrl(getStringValueOrNull(jobj, "collection_folders_url"));
		user.setCollectionFieldsUrl(getStringValueOrNull(jobj, "collection_fields_url"));
		user.setWantlistUrl(getStringValueOrNull(jobj, "wantlist_url"));
		user.setUri(getStringValueOrNull(jobj, "uri"));
		user.setName(getStringValueOrNull(jobj, "name"));
		user.setProfile(getStringValueOrNull(jobj, "profile"));
		user.setHomePage(getStringValueOrNull(jobj, "home_page"));
		user.setLocation(getStringValueOrNull(jobj, "location"));
		user.setRegistered(getStringValueOrNull(jobj, "registered"));
		user.setNumLists(Integer.parseInt(getStringValueOrNull(jobj, "num_lists")));
		user.setNumForSale(Integer.parseInt(getStringValueOrNull(jobj, "num_for_sale")));
		user.setNumCollection(Integer.parseInt(getStringValueOrNull(jobj, "num_collection")));
		user.setNumWantlist(Integer.parseInt(getStringValueOrNull(jobj, "num_wantlist")));
		user.setNumPending(Integer.parseInt(getStringValueOrNull(jobj, "num_pending")));
		user.setReleasesContributed(Integer.parseInt(getStringValueOrNull(jobj, "releases_contributed")));
		user.setRank(Double.parseDouble(getStringValueOrNull(jobj, "rank")));
		user.setReleasesRated(Integer.parseInt(getStringValueOrNull(jobj, "releases_rated")));
		user.setRatingAvg(Double.parseDouble(getStringValueOrNull(jobj, "rating_avg")));
		user.setFriend(Boolean.getBoolean(getStringValueOrNull(jobj, "is_friend")));
		return user;
	}
	
	
	
	/**
	 * 
	 * @param method
	 * @param id
	 * @param params
	 * @return
	 */
	private JsonObject call(String method, String id, Map<String, String> params, boolean callResp) throws ApiRequestException {
		JsonObject jobj = null;
		
		HttpClient httpClient = new DefaultHttpClient();
		httpClient.getParams().setParameter("Accept", HEADER_ACCEPT);
		httpClient.getParams().setParameter("Accept-Encoding", HEADER_ACCEPT_ENCODING);
		httpClient.getParams().setParameter(HttpProtocolParams.USER_AGENT, HEADER_USER_AGENT);
		
		HttpGet request;
		try {
			// creating the params string
			StringBuilder queryString = new StringBuilder();
			if (params != null) {
				for (Iterator<Entry<String, String>> itr = params.entrySet().iterator(); itr.hasNext();) {
					Entry<String, String> entry = itr.next();
					queryString.append("&" + entry.getKey() + "=" + URLEncoder.encode(entry.getValue(), "UTF-8"));
				}
			}
			
			request = new HttpGet(API_URL + "/" + method + "/" + URLEncoder.encode(id, "UTF-8") + "?f=json" + queryString.toString());
			System.out.println("request: " + API_URL + "/" + method + "/" + URLEncoder.encode(id, "UTF-8") + "?f=json" + queryString.toString());
			HttpResponse response = httpClient.execute(request);
			JsonParser parser = new JsonParser();
			JsonObject json = (JsonObject) parser.parse(new BufferedReader(new InputStreamReader(response.getEntity().getContent())));
			if (json.get("message") != null) {
				jobj = null;
				throw new ApiRequestException(json.get("message").getAsString());
			}
			if (callResp)
				jobj = (JsonObject) json.get("resp");
			else
				jobj = json;
			System.out.println("-->" + jobj);
		} catch (UnsupportedEncodingException e) {
			throw new ApiRequestException(e);
		} catch (ClientProtocolException e) {
			throw new ApiRequestException(e);
		} catch (IOException e) {
			throw new ApiRequestException(e);
		}
		
		return jobj;
	}
	
	private String[] jsonArrayToStringArray(JsonArray jsonArr) {
		String[] arr = new String[jsonArr.size()];
		for (int i = 0; i < jsonArr.size(); i++) {
			arr[i] = ((JsonElement) jsonArr.get(i)).getAsString();
		}
		return arr;
	}
	
	private String getStringValueOrNull(JsonObject jobj, String element) {
		JsonElement el = jobj.get(element);
		return (el == null ? null : el.getAsString());
	}
	
	private String[] getStringArrayValueOrNull(JsonObject jobj, String element) {
		JsonArray arrNameVariations = jobj.get(element).getAsJsonArray();
		return (arrNameVariations == null ? null : jsonArrayToStringArray(arrNameVariations));
	}
	
	private <T> List<T> getObjectListOrNull(JsonObject obj, String element, Class<T> klass) throws JsonValueObtainException {
		List<T> objects = null;
		JsonArray jarr = (JsonArray) obj.get(element);
		if (jarr == null) return objects;
		else objects = new ArrayList<T>(jarr.size());
		
		for (int i = 0; i < jarr.size(); i++) {
			JsonObject tmp = (JsonObject) jarr.get(i);
			@SuppressWarnings("unchecked")
			T object = (T) getObjectValueOrNull(tmp, klass);
			objects.add(object);
		}
		
		return objects;
	}
	
	private <T>Object getObjectValueOrNull(JsonObject obj, String element, Class<T> klass) throws JsonValueObtainException {
		JsonObject _tmp = obj.get(element).getAsJsonObject();
		return (_tmp == null ? null: getObjectValueOrNull(_tmp, klass));
	}
	
	private <T>Object getObjectValueOrNull(JsonObject obj, Class<T> klass) throws JsonValueObtainException {
		T o = null;
		try {
			o = klass.newInstance();
			// iteration over the properties of the json object
			for(Iterator<Map.Entry<String, JsonElement>> itr = obj.entrySet().iterator(); itr.hasNext();) {
				Map.Entry<String, JsonElement> entry = itr.next();
				// creating the name of the setter-method
				String methodName = "set" + Utils.prepareMethodName(entry.getKey());
				
				Method method = null;
				if ((method = Utils.findMethod(methodName, klass)) != null) {
					System.out.println("Method: " + method);
					Class<?>[] _tmp = method.getParameterTypes();
					// setter of the property should always contain more then one parameter
					if (_tmp.length == 0) break;
					Class parameterType = _tmp[0];
					System.out.println("TYPE: " + parameterType.getName());
					if ("int".equals(parameterType.getName())) {
						int value = entry.getValue().getAsInt();
						System.out.println("\t setting value: " + value);
						method.invoke(o, new Object[] {value});
					} else
					if ("java.lang.String".equals(parameterType.getName())) {
						String value = entry.getValue().getAsString();
						System.out.println("\t setting value: " + value);
						method.invoke(o, new Object[] {value});
					} else
					if ("boolean".equals(parameterType.getName())) {
						boolean value = entry.getValue().getAsBoolean();
						System.out.println("\t setting value: " + value);
						method.invoke(o, new Object[] {value});
					} else
					if ("long".equals(parameterType.getName())) {
						long value = entry.getValue().getAsLong();
						System.out.println("\t setting value: " + value);
						method.invoke(o, new Object[] {value});
					} else
					if ("double".equals(parameterType.getName())) {
						double value = entry.getValue().getAsDouble();
						System.out.println("\t setting value: " + value);
						method.invoke(o, new Object[] {value});
					}
					// TODO: proceed class
				}
			}
		} catch (InstantiationException e) {
			throw new JsonValueObtainException(e);
		} catch (IllegalAccessException e) {
			throw new JsonValueObtainException(e);
		} catch (IllegalArgumentException e) {
			throw new JsonValueObtainException(e);
		} catch (InvocationTargetException e) {
			throw new JsonValueObtainException(e);
		}
		
		return o;
	}
	
	
}