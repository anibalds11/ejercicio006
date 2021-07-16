package es.cic.bootcamp.ejercicio006.coche;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import es.cic.bootcamp.coche.CocheService;

@SpringBootTest
@AutoConfigureMockMvc
class CocheControllerIntegrationTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void testEntrada() throws Exception{
		this.mockMvc
		.perform(get("/entrada"))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().string(CocheService.MENSAJE_BIENVENIDA));
	}
	
	@Test
	void testSalida() throws Exception{
		this.mockMvc
		.perform(get("/salida"))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().string(CocheService.MENSAJE_SALIDA));
	}
}
