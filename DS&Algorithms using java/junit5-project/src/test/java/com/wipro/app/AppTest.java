package com.wipro.app;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
/*
* Parameterized Testing
*/
public class AppTest {
	@ParameterizedTest
	@ValueSource(ints = {1, 3, 5, -3, 15, Integer.MAX_VALUE}) // six numbers
	void isOdd_ShouldReturnTrueForOddNumbers(int number) {
	    assertTrue(number%2 != 0);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"cali","mali","infi","fruiti"})
	void endsWith(String string) {
		assertTrue(string.endsWith("i"));
	}
	@DisplayName("Test Blanks")
	@ParameterizedTest
	@ValueSource(strings = {"", "  "})
	void isBlank_ShouldReturnTrueForNullOrBlankStrings(String input) {
	    assertTrue(input.isBlank());
	}
	
	@DisplayName("Repeated Test")
	@RepeatedTest(value = 5)
	void repeatedMethod(RepetitionInfo repInfo, TestInfo info ) {
//		System.out.println(repInfo.getCurrentRepetition());
//		System.out.println(repInfo.getTotalRepetitions());
		System.out.println(info.getDisplayName());
		//int i=3;
		//assertEquals(repInfo.getCurrentRepetition(),i);
	}
	
	
}


