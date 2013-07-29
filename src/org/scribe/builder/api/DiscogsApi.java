package org.scribe.builder.api;

import org.scribe.model.Token;

public class DiscogsApi extends DefaultApi10a {

	public static final String REQUEST_TOKEN_URL = "http://api.discogs.com/oauth/request_token";
	public static final String AUTHORIZE_URL = "http://www.discogs.com/oauth/authorize?oauth_token=%s";
	public static final String ACCESS_TOKEN_URL = "http://api.discogs.com/oauth/access_token";

	@Override
	public String getAccessTokenEndpoint() {
		return ACCESS_TOKEN_URL;
	}

	@Override
	public String getAuthorizationUrl(Token token) {
		System.out.println("token:" + token.getToken());
		return String.format(AUTHORIZE_URL, token.getToken());
	}

	@Override
	public String getRequestTokenEndpoint() {
		return REQUEST_TOKEN_URL;
	}

}
