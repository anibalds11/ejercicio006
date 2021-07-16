package es.cic.bootcamp.ejercicio006.coche;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.cic.bootcamp.coche.CocheService;

class CocheServiceTest {

	private CocheService cut;
	
	@BeforeEach
	void setUp() throws Exception {
		
		this.cut= new CocheService();
	}

	@Test
	void testEntrada() {
		assertEquals(this.cut.darEntrada(),CocheService.MENSAJE_BIENVENIDA);
	}

}
