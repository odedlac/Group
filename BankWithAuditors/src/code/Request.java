package code;

import java.util.Map;

public class Request {

	Map<String, String> instructions;

	
	private String requestType;

	private String instruction;
	private String instructionField;

	public Request(String requestType,String inst, String instF) {
		super();
		this.requestType = requestType;
		this.instruction = inst;
		this.instructionField = instF;
	}


	
	/**
	 * @return the instruction
	 */
	public String getInstruction() {
		return instruction;
	}


	/**
	 * @return the instructionField
	 */
	public String getInstructionField() {
		return instructionField;
	}


	/**
	 * @return the requestType
	 */

	public String getRequestType() {
		return requestType;
	}

	
}
