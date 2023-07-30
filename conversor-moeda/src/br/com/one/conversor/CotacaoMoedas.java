package br.com.one.conversor;

public enum CotacaoMoedas {
	
	REAL_PARA_DOLAR (4.703),
	REAL_PARA_EURO (5.214),
	REAL_PARA_LIBRAS(6.078),
	REAL_PARA_ARGENTINO(57.866),
	REAL_PARA_CHILENO(0.006),
	DOLAR_PARA_EURO(0.907),
	DOLAR_PARA_LIBRAS(0.778),
	DOLAR_PARA_ARGENTINO(273.690),
	DOLAR_PARA_CHILENO(829.353),
	EURO_PARA_LIBRAS(0.858),
	EURO_PARA_ARGENTINO(301.726),
	EURO_PARA_CHILENO(914.307),
	LIBRAS_PARA_ARGENTINO(351.594),
	LIBRAS_PARA_CHILENO(1065.422),
	ARGENTINO_PARA_CHILENO(3.03);
	
	private final Double valor;
	
	CotacaoMoedas(Double valor) {
		this.valor = valor;
	}
	
	public Double getValor() {
        return this.valor;
    }

}
