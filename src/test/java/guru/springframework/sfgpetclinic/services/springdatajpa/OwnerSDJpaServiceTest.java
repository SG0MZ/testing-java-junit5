package guru.springframework.sfgpetclinic.services.springdatajpa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgpetclinic.model.Owner;

@Disabled(value = "Disabled until we learn Mocking")
class OwnerSDJpaServiceTest {

	OwnerSDJpaService service;
	
	@BeforeEach
	void setUp() {
		service = new OwnerSDJpaService(null, null, null);
	}
	
	@Disabled
	@Test
	void findByLastName() {
		Owner foundOwner = service.findByLastName("Buck");
	}
	
	@Test
	void findAllByLastNameLike() {
	}
	
	@Test
	void findAll() {
	}

	@Test
	void findById() {
	}
	
	@Test
	void save() {
	}
	
	@Test
	void delete() {
	}
	
	@Test
	void deleteById() {
	}
	
}
