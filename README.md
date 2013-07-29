Release release = client.getRelease("1");
Master master = client.getMaster("8471");
Label label = client.getLabel("Planet E");
Map<String, String> params = new HashMap<String, String>();
params.put("q", "Ken Ishii - Pneuma");
params.put("type", "release");
SearchResults search = client.search(params);
Listing listing = client.getListing("41578241");
Order order = client.getOrder()