package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

import guru.springframework.ModelRepeatedTests;

public class PersonRepeatedTests implements ModelRepeatedTests{
	
	@RepeatedTest(value = 10, name = "{diplayName} : {currentRepetition} - {totalRepetitions}")
	@DisplayName("My Repeated Test")
	void myRepeatedTest() {
		//todo - impl
	}
	
	@RepeatedTest(5)
	void myRepeatedTestWithDI(TestInfo testInfo, RepetitionInfo repetitionInfo) {
		System.out.println(testInfo.getDisplayName() + ": " + repetitionInfo.getCurrentRepetition());
	}
	
	@RepeatedTest(value = 5, name = "{diplayName} : {currentRepetition} - {totalRepetitions}")
	@DisplayName("My Assignment Repeated Test")
	void myAssignmentRepeatedTest() {
		//todo - impl
	}
}
