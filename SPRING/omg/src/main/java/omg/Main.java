package omg;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

// json file into smth


public class Main {
	public static void main(String[] args) throws JsonProcessingException
	{
		ObjectMapper obj = new ObjectMapper();
		Data data = new Data();
		data.setParam1(100);
		data.setParam2(true);
		data.setParam3("Hello World");
		
		String res = obj.writeValueAsString(data);
		System.out.println(res );
		
	}

}
