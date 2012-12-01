/**
 * 
 */
package code;

/**
 * @author oded
 *
 */
public class OHandler extends Handler {

	/* (non-Javadoc)
	 * @see code.Handler#handleRequest(code.Request)
	 */
	@Override
	public Boolean handleRequest(Request request) {
		String requestType = "Oded";

		if (requestType.equals(request.getRequestType())){
			String instruction = request.getInstruction();
			String instructionField = request.getInstructionField();
			System.out.println(requestType + " " + instruction + "   " + instructionField);
			return true;
		} else {
			if(handler != null){
				return this.handler.handleRequest(request);
			} 
		}
		return false;
	}

}
