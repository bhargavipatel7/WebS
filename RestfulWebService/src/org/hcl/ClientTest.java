package org.hcl;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Client client = ClientBuilder.newClient();
		Client client1 = ClientBuilder.newClient();
//		Client client2 = ClientBuilder.newClient();
//		Client client3 = ClientBuilder.newClient();
//		Client client4 = ClientBuilder.newClient();
		
		WebTarget target = client.target("http://localhost:8080/RestfulWebService/demo/hello");
		WebTarget target1 = client1.target("http://localhost:8080/RestfulWebService/demo");
		
		System.out.println(
				target.request(MediaType.TEXT_PLAIN).get(String.class)
				);
		
		System.out.println(
				target1.request(MediaType.TEXT_PLAIN).get(String.class)
				);
	}

}
