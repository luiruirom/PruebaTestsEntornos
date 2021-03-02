package prueba;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestCuenta.class, TestEmpleado.class, TestMovimiento.class })
public class AllTests {

}
