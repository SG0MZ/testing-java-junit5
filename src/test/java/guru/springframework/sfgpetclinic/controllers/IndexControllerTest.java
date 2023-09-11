package guru.springframework.sfgpetclinic.controllers;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assume.*;

import java.time.Duration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IndexControllerTest {

	IndexController controller;
	
	@BeforeEach
	void setUp() {
		controller = new IndexController();
	}
	
	@DisplayName("Test Proper View name is returned for index page")
	@Test
	void index() {
		assertEquals("index", controller.index());
		assertEquals("index", controller.index(),"Wrong View Returned");
		
		assertEquals("index", controller.index(), () -> "Another Expensive Message " + 
				"Make me only if you have to");
	}
	
	@Test
	@DisplayName("Test exception")
	void oupsHandler() {
		assertThrows(ValueNotFoundException.class, () -> {
			controller.oupsHandler();
		});
		
//		assertTrue("notimplementation".equals(controller.oupsHandler()), () -> "This is some expensive" +
//					"Message to build" +
//					"for my test");		
	}
	
	@Disabled("Demo of timeout")
	@Test
	void testTimeOut() {
		assertTimeout(Duration.ofMillis(100), () -> {
			Thread.sleep(2000);
			System.out.println("I got here");
		});
	}
	
	@Disabled("Demo of timeout")
	@Test
	void testTimeOutPrompt() {
		assertTimeoutPreemptively(Duration.ofMillis(100), () -> {
			Thread.sleep(2000);
			System.out.println("I got here 2342342345");
		});
	}
	
	@Test
	void testAssumptionTrue() {
		assumeTrue("GURU".equalsIgnoreCase(System.getenv("GURU_RUNTIME")));
	}
	
	@Test
	void testAssumptionTrueAssumptionIsTrue() {
		assumeTrue("GURU".equalsIgnoreCase("GURU"));
	}
	
}
