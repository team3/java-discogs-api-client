Release release = client.getRelease("1");<br/>
Master master = client.getMaster("8471");<br/>
Label label = client.getLabel("Planet E");<br/>
Map<String, String> params = new HashMap<String, String>();<br/>
params.put("q", "Ken Ishii - Pneuma");<br/>
params.put("type", "release");<br/>
SearchResults search = client.search(params);<br/>
Listing listing = client.getListing("41578241");<br/>
Order order = client.getOrder()
