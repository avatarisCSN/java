
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase; 
import com.mongodb.MongoClient; 
import com.mongodb.MongoCredential;  
import org.bson.Document; 
 
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
 
import javax.net.ssl.HttpsURLConnection;
 
public class HttpURLConnectionExample {
 
    private final String USER_AGENT = "Mozilla/5.0";
 
    public static void main(String[] args) throws Exception {
 
        HttpURLConnectionExample http = new HttpURLConnectionExample();
 
        System.out.println("Testing 1 - Send Http GET request");
        String[] response2 = new String[5];
        response2  = http.sendGet();
        System.out.println(response2[0]);
 
        
     // Creating a Mongo client 
        MongoClient mongo = new MongoClient( "localhost" , 27017 ); 
     
        // Creating Credentials 
        MongoCredential credential; 
        credential = MongoCredential.createCredential("sampleUser", "myDb", 
           "password".toCharArray()); 
        System.out.println("Connected to the database successfully");  
        
        // Accessing the database 
        MongoDatabase database = mongo.getDatabase("myDb"); 
        System.out.println("Credentials ::"+ credential); 
        MongoCollection<Document> collection = database.getCollection("sampleCollection"); 
        System.out.println("create table"); 
        
       Document document = new Document("title", "MongoDB") 
        	    
        		.append("id", response2[0])
        	      .append("description", response2[1]) 
        	      .append("likes", response2[2]) 
        	      .append("url", response2[3]) 
        	      .append("by", response2[4]);  
        	      collection.insertOne(document); 
        	      System.out.println("Document inserted successfully");     
        
 
    }
 
    // HTTP-запрос GET
    private String[] sendGet() throws Exception {
    	
    	  
 
        String url = "https://static.cex.io/marketing/pairs?limit=5";
 
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
 
                 // Значение по умолчанию - GET
        con.setRequestMethod("GET");
 
                 // Добавляем заголовок запроса
        con.setRequestProperty("User-Agent", USER_AGENT);
 
        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);
 
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        String[] response1 = new String[5];
        int count =0;
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
           response1[count]= inputLine;
           System.out.println(response1[count]);
           count++;
        }
        in.close();																																																																																																																																																																																																																																																																																																																																																																							
 
                 // Распечатываем результат
        System.out.println(response.toString());
        
 return response1;
    }
 
         // HTTP-запрос POST
    private void sendPost() throws Exception {
 
        String url = "https://selfsolve.apple.com/wcResults.do";
        URL obj = new URL(url);
        HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();
 
                 // Добавляем заголовок запроса
        con.setRequestMethod("POST");
        con.setRequestProperty("User-Agent", USER_AGENT);
        con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
 
        String urlParameters = "sn=C02G8416DRJM&cn=&locale=&caller=&num=12345";
 
                 // Отправить запрос на публикацию
        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(urlParameters);
        wr.flush();
        wr.close();
 
        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Post parameters : " + urlParameters);
        System.out.println("Response Code : " + responseCode);
 
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
 
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
 
                 // Распечатываем результат
        System.out.println(response.toString());
 
    }
 
}
