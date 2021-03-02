package prueba;

import static org.junit.Assert.*;

import org.junit.*;

import org.hamcrest.*;
import org.hamcrest.number.*;

import cuentas.Cuenta;


public class TestCuenta {
	
	
	private Cuenta cuenta;
	
	@Before 
	public void init() {
		cuenta = new Cuenta("123456", "Luiruirom");
	}
	
	@Test
	public void testGetSaldo() throws Exception{
		cuenta.ingresar("AVE Madrid-Sevilla", 80.0);
		cuenta.ingresar("Telepizza", 30.0);
		assertThat(110.0, new IsCloseTo(cuenta.getSaldo(), 1.0));
	}
	
	@Test
	public void testIngresar() throws Exception{
		cuenta.ingresar("AVE Madrid-Sevilla", 80.0);
		cuenta.ingresar("Telepizza", 30.0);
		assertThat(110.0, new IsCloseTo(cuenta.getSaldo(), 1.0));
	}
	
	@Test
	public void testRetirar() throws Exception{
		cuenta.ingresar("AVE Madrid-Sevilla", 80.0);
		cuenta.ingresar("Telepizza", 30.0);
		cuenta.retirar("AVE Madrid-Sevilla", 50.0);
		cuenta.retirar("Telepizza", 30.0);
		assertThat(30.0, new IsCloseTo(cuenta.getSaldo(), 1.0));
	}
}
