package prueba;

import static org.junit.Assert.*;

import org.junit.*;

import cuentas.Movimiento;

public class TestMovimiento {
	
	private Movimiento movimiento;
	
	@Before
	public void init() {
		movimiento = new Movimiento();
	}

	@Test
	public void testGetImporte() {
		movimiento.setImporte(100.0);
		assertEquals(100.0, movimiento.getImporte(), 0);
	}

	@Test
	public void testGetConcepto() {
		movimiento.setConcepto("AVE Madrid-Sevilla");
		assertEquals("AVE Madrid-Sevilla", movimiento.getConcepto());
	}
}
