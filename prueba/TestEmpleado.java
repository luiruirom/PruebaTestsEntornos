package prueba;

import static org.junit.Assert.*;
import org.junit.*;
import junitparams.JUnitParamsRunner;
import org.junit.runner.RunWith;
import empleado.Empleado;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class TestEmpleado {
	
	private Empleado empleado;
	private Empleado empleadoPrueba;
	
	@Before
	public void init() {
		empleado = new Empleado("Antonio", "Lopez", 20, 2000);
	}
	
	@Test
	@Parameters({"18", "29", "53"})
	public void testPlus(int edad) {
		empleado = new Empleado("Antonio", "López", edad, 2000);
		if (edad > 40)
			assertEquals(true, empleado.plus(0));
		else
			assertEquals(false, empleado.plus(0));
	}

	@Test
	@Parameters({"Juan, Belloso", "Antonio, Lopez"})
	public void testEqualsEmpleado(String nombre, String apellido) {
		empleadoPrueba = new Empleado(nombre, apellido, 20, 2000);
		if(empleadoPrueba.getNombre().equals("Juan"))
			assertEquals(false, empleadoPrueba.equals(empleado));
		else {
			assertEquals(true, empleadoPrueba.equals(empleado));
		}
	}

	@Test
	@Parameters({"18", "20", "30"})
	public void testCompareTo(int edad){
		empleadoPrueba = new Empleado("Antonio", "Lopez", edad, 2000);
		if (edad < 20)
			assertEquals(-1, empleadoPrueba.compareTo(empleado));
		else if (edad > 20){
			assertEquals(1, empleadoPrueba.compareTo(empleado));
		} else {
			assertEquals(0, empleadoPrueba.compareTo(empleado));
		}
	}

}
