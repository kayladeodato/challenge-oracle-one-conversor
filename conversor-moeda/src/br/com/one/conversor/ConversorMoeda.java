package br.com.one.conversor;

public class ConversorMoeda {

    private Double valor;
    private CotacaoMoedas cotacao;
	Double temperaturaConvertida;

	public ConversorMoeda() {

	}

    // m�todo para convers�o da moeda para real (cota��o)
    public String converterMoedas(Double valor, String moedaOrigem, String moedaDestino) {
    	
    	if(moedaOrigem == "Real" && moedaDestino == "D�lar") {
    		temperaturaConvertida = valor * cotacao.REAL_PARA_DOLAR.getValor();
    		return String.format("%.2f", temperaturaConvertida);
    				
    	}
    	
    	else if (moedaOrigem == "D�lar" && moedaDestino == "Real") {
    		temperaturaConvertida = valor / cotacao.REAL_PARA_DOLAR.getValor();
			return String.format("%.2f", temperaturaConvertida);
    				
    	}
    	
    	else if (moedaOrigem == "Real" && moedaDestino == "Euro") {
    		temperaturaConvertida = valor * cotacao.REAL_PARA_EURO.getValor();
			return String.format("%.2f", temperaturaConvertida);
    				
    	}
    	
    	else if (moedaOrigem == "Euro" && moedaDestino == "Real") {
    		temperaturaConvertida = valor / cotacao.REAL_PARA_EURO.getValor();
			return String.format("%.2f", temperaturaConvertida);
    				
    	}
    	
    	else if (moedaOrigem == "Real" && moedaDestino == "Libras Esterlinas") {
    		temperaturaConvertida = valor * cotacao.REAL_PARA_LIBRAS.getValor();
			return String.format("%.2f", temperaturaConvertida);
    				
    	}
    	
    	else if (moedaOrigem == "Libras Esterlinas" && moedaDestino == "Real") {
    		temperaturaConvertida = valor / cotacao.REAL_PARA_LIBRAS.getValor();
			return String.format("%.2f", temperaturaConvertida);
    				
    	}
    	
    	else if (moedaOrigem == "Real" && moedaDestino == "Peso Argentino") {
    		temperaturaConvertida = valor * cotacao.REAL_PARA_ARGENTINO.getValor();
			return String.format("%.2f", temperaturaConvertida);
    				
    	}
    	
    	else if (moedaOrigem == "Peso Argentino" && moedaDestino == "Real") {
    		temperaturaConvertida = valor / cotacao.REAL_PARA_ARGENTINO.getValor();
			return String.format("%.2f", temperaturaConvertida);
    				
    	}
    	
    	else if (moedaOrigem == "Real" && moedaDestino == "Peso Chileno") {
    		temperaturaConvertida = valor * cotacao.REAL_PARA_CHILENO.getValor();
			return String.format("%.2f", temperaturaConvertida);
    				
    	}
    	
    	else if (moedaOrigem == "Real" && moedaDestino == "Peso Chileno") {
    		temperaturaConvertida = valor * cotacao.REAL_PARA_CHILENO.getValor();
			return String.format("%.2f", temperaturaConvertida);
    				
    	}
    	
    	else if (moedaOrigem == "Peso Chileno" && moedaDestino == "Real") {
    		temperaturaConvertida = valor / cotacao.REAL_PARA_CHILENO.getValor();
			return String.format("%.2f", temperaturaConvertida);
    	}

    	else if (moedaOrigem == "D�lar" && moedaDestino == "Euro") {
    		temperaturaConvertida = valor * cotacao.DOLAR_PARA_EURO.getValor();
			return String.format("%.2f", temperaturaConvertida);
    	}
    	
    	else if (moedaOrigem == "Euro" && moedaDestino == "D�lar") {
    		temperaturaConvertida = valor / cotacao.DOLAR_PARA_EURO.getValor();
			return String.format("%.2f", temperaturaConvertida);
    	}
    	
    	else if (moedaOrigem == "D�lar" && moedaDestino == "Libras Esterlinas") {
    		temperaturaConvertida = valor * cotacao.DOLAR_PARA_LIBRAS.getValor();
			return String.format("%.2f", temperaturaConvertida);
    	}
    	
    	else if (moedaOrigem == "Libras Esterlinas" && moedaDestino == "D�lar") {
    		temperaturaConvertida = valor / cotacao.DOLAR_PARA_LIBRAS.getValor();
			return String.format("%.2f", temperaturaConvertida);
    	}
    	
    	else if (moedaOrigem == "D�lar" && moedaDestino == "Peso Argentino") {
    		temperaturaConvertida = valor * cotacao.DOLAR_PARA_ARGENTINO.getValor();
			return String.format("%.2f", temperaturaConvertida);
    	}
    	
    	else if (moedaOrigem == "Peso Argentino" && moedaDestino == "D�lar") {
    		temperaturaConvertida = valor / cotacao.DOLAR_PARA_ARGENTINO.getValor();
			return String.format("%.2f", temperaturaConvertida);
    	}
    	
    	else if (moedaOrigem == "D�lar" && moedaDestino == "Peso Chileno") {
    		temperaturaConvertida = valor * cotacao.DOLAR_PARA_CHILENO.getValor();
			return String.format("%.2f", temperaturaConvertida);
    	}
    	
    	else if (moedaOrigem == "Peso Chileno" && moedaDestino == "D�lar") {
    		temperaturaConvertida = valor / cotacao.DOLAR_PARA_CHILENO.getValor();
			return String.format("%.2f", temperaturaConvertida);
    	}
    	
    	else if (moedaOrigem == "Euro" && moedaDestino == "Libras Esterlinas") {
    		temperaturaConvertida = valor * cotacao.EURO_PARA_LIBRAS.getValor();
			return String.format("%.2f", temperaturaConvertida);
    	}
    	
    	else if (moedaOrigem == "Libras Esterlinas" && moedaDestino == "Euro") {
    		temperaturaConvertida = valor / cotacao.EURO_PARA_LIBRAS.getValor();
			return String.format("%.2f", temperaturaConvertida);
    	}
    	
    	else if (moedaOrigem == "Euro" && moedaDestino == "Peso Argentino") {
    		temperaturaConvertida = valor * cotacao.EURO_PARA_ARGENTINO.getValor();
			return String.format("%.2f", temperaturaConvertida);
    	}
    	
    	else if (moedaOrigem == "Peso Argentino" && moedaDestino == "Euro") {
    		temperaturaConvertida = valor / cotacao.EURO_PARA_ARGENTINO.getValor();
			return String.format("%.2f", temperaturaConvertida);
    	}
    	
    	else if (moedaOrigem == "Euro" && moedaDestino == "Peso Chileno") {
    		temperaturaConvertida = valor / cotacao.EURO_PARA_CHILENO.getValor();
			return String.format("%.2f", temperaturaConvertida);
    	}
    	
    	else if (moedaOrigem == "Libras" && moedaDestino == "Peso Argentino") {
    		temperaturaConvertida = valor * cotacao.LIBRAS_PARA_ARGENTINO.getValor();
			return String.format("%.2f", temperaturaConvertida);
    	}
    	
    	else if (moedaOrigem == "Peso Argentino" && moedaDestino == "Libras") {
    		temperaturaConvertida = valor / cotacao.LIBRAS_PARA_ARGENTINO.getValor();
			return String.format("%.2f", temperaturaConvertida);
    	}
    	
    	else if (moedaOrigem == "Libras" && moedaDestino == "Peso Chileno") {
    		temperaturaConvertida = valor * cotacao.LIBRAS_PARA_CHILENO.getValor();
			return String.format("%.2f", temperaturaConvertida);
    	}
    	
    	else if (moedaOrigem == "Peso Argentino" && moedaDestino == "Peso Chileno") {
    		temperaturaConvertida = valor * cotacao.ARGENTINO_PARA_CHILENO.getValor();
			return String.format("%.2f", temperaturaConvertida);
    	}
    	
    	else if (moedaOrigem == "Peso Chileno" && moedaDestino == "Peso Argentino") {
    		temperaturaConvertida = valor / cotacao.ARGENTINO_PARA_CHILENO.getValor();
			return String.format("%.2f", temperaturaConvertida);
    	}
    	
    	else {
    		return "";
    	}
    	
    }


}
