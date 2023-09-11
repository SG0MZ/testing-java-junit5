package guru.springframework.sfgpetclinic.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import guru.springframework.ModelTests;

class OwnerTest implements ModelTests {

	@Test
	void dependentAssertions() {
		Owner owner = new Owner(1L, "Joe", "Buck");
		owner.setCity("Key West");
		owner.setTelephone("1231231234");
		
		assertAll("Properties Test",
				() -> assertAll("Person Properties",
						() -> assertEquals("Joe",owner.getFirstName()),
						() -> assertEquals("Buck",owner.getLastName())),
				() -> assertAll("Owner Properties",
						() -> assertEquals("Key West",owner.getCity()),
						() -> assertEquals("1231231234",owner.getTelephone())
				));
		
		assertThat(owner.getCity(), is("Key West"));
	}

}
