package guru.springframework.sfgpetclinic.controllers;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assume.*;
import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

import guru.springframework.ControllerTests;

class IndexControllerTest implements ControllerTests {

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
		
		assertThat(controller.index()).isEqualTo("index");
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
	
	@EnabledOnOs(OS.MAC)
	@Test
	void testMeOnMacOS() {
		
	}
	
	@EnabledOnOs(OS.WINDOWS)
	@Test
	void testMeOnWindows() {
		
	}
	
	@EnabledOnJre(JRE.JAVA_8)
	@Test
	void testMeOnJava8() {
		
	}
	
	@EnabledOnJre(JRE.JAVA_11)
	@Test
	void testMeOnJava11() {
		
	}
	
	@EnabledIfEnvironmentVariable(named = "USER", matches = "jt")
	@Test
	void testIfUserJT() {
		
	}
	
	@EnabledIfEnvironmentVariable(named = "USER", matches = "fred")
	@Test
	void testIfUserFred() {
		
	}
}
