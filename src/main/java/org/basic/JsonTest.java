package org.basic;

//import java.util.HashMap;
//
//import org.json.simple.JSONObject;
//import org.json.simple.JSONValue;
import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;
import org.mule.module.json.JsonData;

public class JsonTest implements Callable{

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		// TODO Auto-generated method stub
		
		MuleMessage message = eventContext.getMessage();
		//Object obj=JSONValue.parse(jsonString);  
		JsonData obj = (JsonData) message.getPayload();
	    //JSONObject jsonObject = (JSONObject) (message.getPayload());  
		//HashMap<String, String> m1 = (HashMap<String, String>) message.getPayload();
		System.out.println("name is : " + (String)obj.getAsString("name"));
		System.out.println("designation is : " + (String)obj.getAsString("designation"));
		message.setPayload("Decoded successfully");
		return message;
	}
	
	

}
