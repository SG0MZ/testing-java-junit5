package guru.springframework.sfgpetclinic.controllers;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

import static org.junit.Assert.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgpetclinic.fauxspring.Model;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.map.VetMapService;
import guru.springframework.sfgpetclinic.services.normal.SpecialtyService;
import guru.springframework.sfgpetclinic.services.normal.VetService;

class VetControllerTest {

	VetService vetService;
	SpecialtyService specialtyService;
	VetController vetController;
	
	@BeforeEach
	void setUp() {
		specialtyService = new SpecialtyMapService();
		vetService = new VetMapService();
		vetController = new VetController(vetService);
		
		Vet vet1 = new Vet(1L,"joe","buck",null);
		Vet vet2 = new Vet(2L,"Jimmy","Smith",null);
		
		
		vetService.save(vet1);
		vetService.save(vet2);
	}
	
	@Test
	void listVets() {
		Model model = new ModelMapImpl();
		String view = vetController.listVets(model);
		
		assertThat("vets/index").isEqualTo(view);
		
		Set modelAttribute = (Set) ((ModelMapImpl) model).getMap().get("vets");
		
		assertThat(modelAttribute).isEqualTo(2);
	}

}
