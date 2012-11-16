package code;

public abstract class Request {

	private String requestType;

	public String getRequestType() {
		return requestType;
	}

	protected void setRequestType(String requestType) {
		this.requestType = requestType;
	}
	
}
