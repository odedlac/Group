/**
 * 
 */
package code;

/**
 * @author Tom Hedges
 *
 */
public class TomHandler extends Handler {

	/* (non-Javadoc)
	 * @see code.Handler#handleRequest(code.Request)
	 */
	@Override
	public Boolean handleRequest(Request request) {
		String requestType = "TomHedges";

		if (requestType.equals(request.getRequestType())){
			boolean errorFlag = false;
			int number1 = 0;
			try
			{
				number1 = Integer.parseInt(request.getInstruction());
			} catch (NumberFormatException error)
			{
				System.out.println(requestType + " - ERROR: \"" + request.getInstruction() + "\" is not an integer.");
				errorFlag = true;
			}
			int number2 = 0;
			try
			{
				number2 = Integer.parseInt(request.getInstructionField());
			} catch (NumberFormatException error)
			{
				System.out.println(requestType + " - ERROR: \"" + request.getInstructionField() + "\" is not an integer.");
				errorFlag = true;
			}
			if (!errorFlag){
				System.out.println(requestType + " your numbers multiply to: " + number1*number2);
			} else {
				System.out.println(requestType + " resulted in an error");
				return false;
			}
			return true;
		} else {
			if(handler != null){
				return this.handler.handleRequest(request);
			} 
		}
		return false;
	}

}
