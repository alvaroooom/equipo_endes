package com.endes.entidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DesarrolladorTest {

    private Desarrollador desarrollador1;
    private Desarrollador desarrollador32;
    private Desarrollador desarrollador86;

    @BeforeEach
    void setUp() throws Exception {
        desarrollador1 = new Desarrollador("78171637Z", "Mario", 1500.0, "C");
        desarrollador32 = new Desarrollador("79125362P", "Alvaro", 1500.0, "Python");
        desarrollador86 = new Desarrollador("71380232K", "Maria", 1500.0, "Java");
    }

    @Test
    @DisplayName("Test del método getLenguajePrincipal de la clase Desarrollador")
    void testGetLenguajePrincipal() {
        assertEquals("C", desarrollador1.getLenguajePrincipal(), "El lenguaje principal debería ser C");
        assertEquals("Python", desarrollador32.getLenguajePrincipal(), "El lenguaje principal debería ser Python");
        assertEquals("Java", desarrollador86.getLenguajePrincipal(), "El lenguaje principal debería ser Java");
    }

    @Test
    @DisplayName("Test del método calcularProductividad de la clase Desarrollador")
    void testCalcularProductividad() {
        assertEquals(1500, desarrollador1.calcularProductividad(), 0.01, "La productividad debería ser 1500 para C");
        assertEquals(1650, desarrollador32.calcularProductividad(), 0.01, "La productividad debería ser 1650 para Python");
        assertEquals(1650, desarrollador86.calcularProductividad(), 0.01, "La productividad debería ser 1650 para Java");
    }

    @Test
    @DisplayName("Test de excepción en setLenguajePrincipal con valor nulo o vacío")
    void testSetLenguajePrincipalException() {
        Exception exception1 = assertThrows(IllegalArgumentException.class, () -> {
            desarrollador1.setLenguajePrincipal(null);
        });
        assertEquals("El lenguaje principal no puede ser nulo ni vacío.", exception1.getMessage());

        Exception exception2 = assertThrows(IllegalArgumentException.class, () -> {
            desarrollador1.setLenguajePrincipal("");
        });
        assertEquals("El lenguaje principal no puede ser nulo ni vacío.", exception2.getMessage());
    }


	@Test
	@DisplayName("Test del método getDni de la clase Personal")
	void testGetDni() {
		assertEquals("78171637Z", desarrollador1.getDni(), "El DNI debería ser 78171637Z");
		assertEquals("79125362P", desarrollador32.getDni(), "El DNI debería ser 79125362P");
		assertEquals("71380232K", desarrollador86.getDni(), "El DNI debería ser 71380232K");
	}
	
	@Test
	@DisplayName("Test del método getNombre de la clase Personal")
	void testGetNombre() {
		assertEquals("Mario", desarrollador1.getNombre(), "El nombre debería ser Mario");
		assertEquals("Alvaro", desarrollador32.getNombre(), "El nombre debería ser Alvaro");
		assertEquals("Maria", desarrollador86.getNombre(), "El nombre debería ser Maria");
	}
	
	@Test
	@DisplayName("Test del método getSueldoBase de la clase Personal")
	void testGetSueldoBase() {
		assertEquals(1500.0, desarrollador1.getSueldoBase(), "El sueldo debería ser 1500.0");
		assertEquals(1500.0, desarrollador32.getSueldoBase(), "El sueldo debería ser 1500.0");
		assertEquals(1500.0, desarrollador86.getSueldoBase(), "El sueldo debería ser 1500.0");
	}
	
	@Test
	@DisplayName("Test del método setSueldoBase de la clase Personal")
	void testSetSueldoBase() {
		desarrollador1.setSueldoBase(6000.0);
        assertEquals(6000.0, desarrollador1.getSueldoBase(), "El sueldo debería ser 6000.0 después de la actualización");
	}
	
}
