package code;

import java.util.Map;

public abstract class Request {

	Map<String,String> instructions;

	
	private String requestType;

	
	
	
	public String getRequestType() {
		return requestType;
	}

	protected void setRequestType(String requestType) {
		this.requestType = requestType;
	}
	
}
