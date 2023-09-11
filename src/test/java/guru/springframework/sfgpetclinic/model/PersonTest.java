package guru.springframework.sfgpetclinic.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import guru.springframework.ModelTests;

class PersonTest implements ModelTests{

	@Test
	void groupedAssertions() {
		//given
		Person person = new Person(1L, "Joe", "Buck");
		//then
		assertAll("Test Props Set",
				() -> assertEquals(person.getFirstName(), "Joe"),
				() -> assertEquals(person.getLastName(), "Buck"));
	}

	@Test
	void groupedAssertionMsgs() {
		//given
		Person person = new Person(1L, "Joe", "Buck");
		//then
		assertAll("Test Props Set",
				() -> assertEquals(person.getFirstName(), "Joe", "First Name Failed"),
				() -> assertEquals(person.getLastName(), "Buck", "Last Name Failed"));
	}
	
	
}
