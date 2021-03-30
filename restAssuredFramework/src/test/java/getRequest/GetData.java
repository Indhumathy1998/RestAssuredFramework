package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class GetData {
	@Test
	public void testResponsecode()
	{
		Response resp=get("http://api.openweathermap.org/data/2.5/weather?q=London,uk&appid=295f1db2b000d145be18741a68cc8880");
	       
		int code=resp.getStatusCode();
		
		System.out.println("status code is:"+code);
		
		Assert.assertEquals(code, 200);
	}
	@Test
	public void testbody()
	{
		Response resp=get("http://api.openweathermap.org/data/2.5/weather?q=London,uk&appid=295f1db2b000d145be18741a68cc8880");
	       
		String data=resp.asString();
		
		System.out.println("Data is:"+data);
		
		System.out.println("Response time :"+resp.getTime());
		
	}
	@Test
	public void testbody1()
	{
		Response resp=get("http://api.openweathermap.org/data/2.5/weather?q=London,uk&appid=295f1db2b000d145be18741a68cc8880");
	    
		String data=get("").asString();
		
		long time=get("").getTime();
		
		System.out.println("Response time :"+time);
		
	}

}
