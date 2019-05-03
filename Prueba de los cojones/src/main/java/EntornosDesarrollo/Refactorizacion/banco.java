package EntornosDesarrollo.Refactorizacion;

public class banco {

	String compañia;
	int identificador;

	public banco(String compañia, int identificador) {

		super();
		this.identificador = identificador;
		this.compañia = compañia;
		

	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

}
