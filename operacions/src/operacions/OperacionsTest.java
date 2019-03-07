package operacions;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OperacionsTest {
	Operacions fn;

	@Before
	public void crearClasse() {
		fn = new Operacions();
	}

	@Test
	public void factorialRecursiuTest() {
		Assert.assertEquals(120, fn.factorial_recursiu(5), 0.001);
	}

	@Test
	public void factorialIteratiuTest() {
		Assert.assertEquals(120, fn.factorial_iteratiu(5), 0.001);
	}

	@Test(expected = IllegalArgumentException.class)
	public void getExceptionTest() {
		double valor = fn.factorial_iteratiu(-3);
		System.out.println(valor);
	}
}