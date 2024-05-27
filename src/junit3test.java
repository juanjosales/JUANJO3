import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class junit3test {

	@Test
	void testpositivos() {
		String nombre = "juanjo";
		
		String resultado = Principal.nombre(nombre);
		
		assertEquals("juanjo", resultado);
	}

}
