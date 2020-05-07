# java-rest-with-jersey

public static void main(String[] args) {

		String uri = "http://localhost:8080/HelloRestWithJersey/rest/bonjour/json";

		Client client = ClientBuilder.newClient(new ClientConfig());

		String response = client.target(uri).request().accept(MediaType.APPLICATION_JSON).get(String.class);
		

		System.out.println(response);
