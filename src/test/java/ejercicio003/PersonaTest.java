package ejercicio003;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTest {

	static Grupo lista = new Grupo();
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		ArrayList<String> strings = new ArrayList<String>();
		
		strings.add("Pepe Gonzalez");
		strings.add("Samuel Vazquez");
		strings.add("Sara Nuñez");
		strings.add("Iker Casillas");
		strings.add("Cristiano Ronaldo");
		
		lista.setLista(strings);
	}

	@BeforeEach
	void setUp() throws Exception {
		
	}

	@Test
	void testPersonas() {
		
		String persona=lista.getPersona();
		assertEquals(persona,persona);
		
		
	}

}
