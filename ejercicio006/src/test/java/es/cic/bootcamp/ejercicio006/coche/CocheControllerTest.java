package es.cic.bootcamp.ejercicio006.coche;

import static es.cic.bootcamp.coche.CocheService.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.cic.bootcamp.coche.CocheController;
import es.cic.bootcamp.coche.CocheService; 


class CocheControllerTest {
	
	private CocheController cut;
	
	private CocheService dependencia;
	
	@BeforeEach
	void setUp() throws Exception {
		cut = new CocheController();
		dependencia= mock(CocheService.class);
		
		cut.setCocheService(dependencia);
	}

	@Test
	void testEntrada() {
		when(cut.darEntrada()).thenReturn("Hola mundo");
		String resultado= cut.darEntrada();
		
		assertEquals(MENSAJE_BIENVENIDA,resultado,"El mensaje no es correcto");
		verify(dependencia, times(1)).darEntrada();
	}

}
