package tests;

import static org.junit.Assert.*;
import org.junit.Test;

import code.Request;

public class RequestTest {

	@Test
	public void test() {
		
		String instruction = "10";
		String instructionField = "5";
		String expectedOutput = "Oded";
		String actualOutput;
		String input = "Oded";
		Request classUnderTest = new Request(input, instruction, instructionField);
		
		actualOutput = classUnderTest.getRequestType();
		
			
		assertEquals("Not equal",expectedOutput,actualOutput);
	}

	@Test
	public void test2() {
		
		String instruction = "10";
		String instructionField = "5";
		String expectedOutput = "10";
		String actualOutput;
		String input = "Oded";
		Request classUnderTest = new Request(input, instruction, instructionField);
		
		
		actualOutput = classUnderTest.getInstruction();
		
		assertEquals("Not equal",expectedOutput,actualOutput);
	}

	@Test
	public void test3() {
		
		String instruction = "10";
		String instructionField = "5";
		String expectedOutput = "5";
		String actualOutput;
		String input = "Oded";
		Request classUnderTest = new Request(input, instruction, instructionField);
		
		
		actualOutput = classUnderTest.getInstructionField();
		
		assertEquals("Not equal",expectedOutput,actualOutput);
	}


    @Test
    public void test4() {

        String instruction = "10";
        String instructionField = "5";
        String expectedOutput = "Tristian";
        String actualOutput;
        String input = "Tristian";
        Request classUnderTest = new Request(input, instruction, instructionField);

        actualOutput = classUnderTest.getRequestType();


        assertEquals("Not equal",expectedOutput,actualOutput);
    }

    @Test
    public void test5() {

        String instruction = "10";
        String instructionField = "5";
        String expectedOutput = "10";
        String actualOutput;
        String input = "Tristian";
        Request classUnderTest = new Request(input, instruction, instructionField);


        actualOutput = classUnderTest.getInstruction();

        assertEquals("Not equal",expectedOutput,actualOutput);
    }

    @Test
    public void test6() {

        String instruction = "10";
        String instructionField = "5";
        String expectedOutput = "5";
        String actualOutput;
        String input = "Tristian";
        Request classUnderTest = new Request(input, instruction, instructionField);


        actualOutput = classUnderTest.getInstructionField();

        assertEquals("Not equal",expectedOutput,actualOutput);
    }
	
}
