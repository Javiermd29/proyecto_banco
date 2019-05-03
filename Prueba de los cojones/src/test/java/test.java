
import static org.junit.Assert.*;

import org.junit.Test;

import EntornosDesarrollo.Refactorizacion.banco;
import EntornosDesarrollo.Refactorizacion.cliente;
import EntornosDesarrollo.Refactorizacion.cuenta;

public class test {

	private banco sanostra = new banco("sanostra", 1999);
	private banco sabadell = new banco("sabadell", 1998);

	private cliente c1 = new cliente("Javier", "Martínez", "43202729N", "Puig de Randa nº 4", "656189501");
	
	private cliente c2 = new cliente("Daniel", "Martínez", "43202728B", "Puig de Randa nº 4", "671845290");

	private cuenta cuentaA = new cuenta(c1, "00497856125423695478", 246.98, sanostra);

	private cuenta cuentaB = new cuenta(c2, "00492306458945210125", 870.32, sabadell);

	// Comprobación Cliente
	
	@Test
	public void testCliente() {

		if (cuentaA.getTitular() == cuentaB.getTitular()) {

			System.out.println("Ok");

		} else {

			System.out.println("Error");

		}

	}

	// Comprobación Salgo Original
	
	@Test
	public void testSalgoOriginal() {

		double sActual = cuentaA.getSaldo();

		cuenta.transferencia(cuentaA, cuentaB, 150);

		if (cuentaA.getSaldo() != sActual) {

			fail();

		}

	}

	// Comprobación Saldo del destinatario
	
	@Test
	public void testSaldoDestinatario() {

		double sActual = cuentaB.getSaldo();

		cuenta.transferencia(cuentaA, cuentaB, 75);

		if (cuentaB.getSaldo() == sActual) {

			fail();

		}

	}
	
	// Comprobación Transferencia OKAY

	@Test
	public void testTransferenciaOk() {

		assertEquals(true, cuenta.transferencia(cuentaA, cuentaB, 50));

	}
	
	// Comprobación Transferencia ERROR

	@Test
	public void testTransferenciaError() {

		assertEquals(false, cuenta.transferencia(cuentaA, cuentaB, 50));

	}

	// Comprobación Traspaso
	
	@Test
	public void testTraspaso() {

		if (cuentaA.getBanco() == cuentaB.getBanco() && cuentaA.getTitular() == cuentaB.getTitular()) {

			cuenta.traspaso(cuentaA, cuentaB, 80);

		} else {

			fail();

		}

	}

}
