package EntornosDesarrollo.Refactorizacion;

public class cuenta {

	cliente titular;
	String identificador;
	banco banco;
	double saldo;

	public cliente getTitular() {

		return titular;

	}

	public void setTitular(cliente titular) {
		this.titular = titular;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public banco getBanco() {
		return banco;
	}

	public void setBanco(banco banco) {
		this.banco = banco;
	}

	public static boolean transferencia(cuenta origen, cuenta destino, double cantidad) {

		if (origen.getSaldo() < cantidad) {

			return false;

		} else {

			origen.setSaldo(origen.getSaldo() - cantidad);

			destino.setSaldo(destino.getSaldo() + cantidad);

			return true;

		}
	}

	public static boolean traspaso(cuenta origen, cuenta destino, double cantidad) {

		if (origen.getSaldo() < cantidad && origen.getBanco() != destino.getBanco()
				&& origen.getTitular() != destino.getTitular()) {

			return false;

		} else {

			origen.setSaldo(origen.getSaldo() - cantidad);

			destino.setSaldo(destino.getSaldo() + cantidad);

			return true;

		}

	}

	public cuenta(cliente titular, String identificador, double saldo, banco banco) {

		super();
		this.titular = titular;
		this.identificador = identificador;
		this.saldo = saldo;
		this.banco = banco;

	}

}
