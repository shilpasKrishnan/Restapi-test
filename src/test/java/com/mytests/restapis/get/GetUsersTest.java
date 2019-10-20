package com.mytests.restapis.get;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

public class GetUsersTest {

	
	@Test
	public void getListOfUsersTest() throws ClientProtocolException, IOException {
		
		
		String resourceURL = "http://localhost:8080/restapi-web/backend/user/service/users";
		HttpClient client = new DefaultHttpClient();
		
		
		HttpGet get = new HttpGet(resourceURL);
		
		HttpResponse response = client.execute(get);
		
		
		int statusCode = response.getStatusLine().getStatusCode();
		
		HttpEntity reponseEntity = response.getEntity();
		
		String responseString = EntityUtils.toString(reponseEntity);
		
		System.out.println("The response status code is :" + statusCode);
		System.out.println("Response Entitty is :\n" + responseString);
		
	}
}
