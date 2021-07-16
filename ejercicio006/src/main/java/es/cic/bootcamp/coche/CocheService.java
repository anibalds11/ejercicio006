package es.cic.bootcamp.coche;

import org.springframework.stereotype.Service;

@Service
public class CocheService {
	public static final String MENSAJE_BIENVENIDA= "Hola mundo";
	public static final String MENSAJE_SALIDA= "Adios mundo";
	
	
	public String darEntrada()
	{
		return MENSAJE_BIENVENIDA;
	}
	
	public String darSalida()
	{
		return MENSAJE_SALIDA;
	}
}
