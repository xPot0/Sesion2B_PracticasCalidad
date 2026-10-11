package test;

import static org.junit.jupiter.api.Assertions.*;
import Sesion2B.Empleado;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		
	}
	
	@Test
	void nominaBrutaVendedorSinExtras() {
	    assertEquals(2000,Empleado.calculoNominaBruta(Empleado.TipoEmpleado.Vendedor,500,0));
	}
	
	@Test
	void nominaBrutaVendedorBonus100() {
	    assertEquals(2100,Empleado.calculoNominaBruta(Empleado.TipoEmpleado.Vendedor,1000,0));
	}
	
	@Test
	void nominaBrutaVendedorBonus200() {
	    assertEquals(2200,Empleado.calculoNominaBruta(Empleado.TipoEmpleado.Vendedor,1500,0));
	}
	
	@Test
	void nominaBrutaEncargadoSinExtras() {
	    assertEquals(2500,Empleado.calculoNominaBruta(Empleado.TipoEmpleado.Encargado,500,0));
	}
	
	@Test
	void nominaBrutaEncargadoBonus200YHorasExtra() {
	    assertEquals(3000,Empleado.calculoNominaBruta(Empleado.TipoEmpleado.Encargado,2000,10));
	}
	
	@Test
	void nominaNetaSinRetencion() {
	    assertEquals(2000,Empleado.calculoNominaNeta(2000));
	}
	
	@Test
	void nominaNetaRetencion15() {
	    assertEquals(1870,
	        Empleado.calculoNominaNeta(2200));
	}
	
	@Test
	void nominaNetaRetencion18() {
	    assertEquals(2460,Empleado.calculoNominaNeta(3000));
	}

}
