package httttpQEry;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class httpExample {

	public static void main(String[] args) throws ClientProtocolException, IOException {
	HttpClient client = HttpClients.createDefault();
HttpGet httpget = new HttpGet( "http://google.com");
     HttpResponse response =    client.execute(httpget);
     String body = EntityUtils.toString(response.getEntity());
     System.out.println(body);
	}

}
