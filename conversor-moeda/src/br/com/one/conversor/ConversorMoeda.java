package br.com.one.conversor;

public class ConversorMoeda {

    private Double valor;
    private CotacaoMoedas cotacao;
	Double valorConvertido;

	public ConversorMoeda() {

	}

    // método para conversão da moeda para real (cotação)
    public String converterMoedas(Double valor, String moedaOrigem, String moedaDestino) {
    	
    	if(moedaOrigem == "Real" && moedaDestino == "Dólar") {
    		valorConvertido = valor * cotacao.REAL_PARA_DOLAR.getValor();
    		return String.format("%.2f", valorConvertido);
    				
    	}
    	
    	else if (moedaOrigem == "Dólar" && moedaDestino == "Real") {
    		valorConvertido = valor / cotacao.REAL_PARA_DOLAR.getValor();
			return String.format("%.2f", valorConvertido);
    				
    	}
    	
    	else if (moedaOrigem == "Real" && moedaDestino == "Euro") {
    		valorConvertido = valor * cotacao.REAL_PARA_EURO.getValor();
			return String.format("%.2f", valorConvertido);
    				
    	}
    	
    	else if (moedaOrigem == "Euro" && moedaDestino == "Real") {
    		valorConvertido = valor / cotacao.REAL_PARA_EURO.getValor();
			return String.format("%.2f", valorConvertido);
    				
    	}
    	
    	else if (moedaOrigem == "Real" && moedaDestino == "Libras Esterlinas") {
    		valorConvertido = valor * cotacao.REAL_PARA_LIBRAS.getValor();
			return String.format("%.2f", valorConvertido);
    				
    	}
    	
    	else if (moedaOrigem == "Libras Esterlinas" && moedaDestino == "Real") {
    		valorConvertido = valor / cotacao.REAL_PARA_LIBRAS.getValor();
			return String.format("%.2f", valorConvertido);
    				
    	}
    	
    	else if (moedaOrigem == "Real" && moedaDestino == "Peso Argentino") {
    		valorConvertido = valor * cotacao.REAL_PARA_ARGENTINO.getValor();
			return String.format("%.2f", valorConvertido);
    				
    	}
    	
    	else if (moedaOrigem == "Peso Argentino" && moedaDestino == "Real") {
    		valorConvertido = valor / cotacao.REAL_PARA_ARGENTINO.getValor();
			return String.format("%.2f", valorConvertido);
    				
    	}
    	
    	else if (moedaOrigem == "Real" && moedaDestino == "Peso Chileno") {
    		valorConvertido = valor * cotacao.REAL_PARA_CHILENO.getValor();
			return String.format("%.2f", valorConvertido);
    				
    	}
    	
    	else if (moedaOrigem == "Real" && moedaDestino == "Peso Chileno") {
    		valorConvertido = valor * cotacao.REAL_PARA_CHILENO.getValor();
			return String.format("%.2f", valorConvertido);
    				
    	}
    	
    	else if (moedaOrigem == "Peso Chileno" && moedaDestino == "Real") {
    		valorConvertido = valor / cotacao.REAL_PARA_CHILENO.getValor();
			return String.format("%.2f", valorConvertido);
    	}

    	else if (moedaOrigem == "Dólar" && moedaDestino == "Euro") {
    		valorConvertido = valor * cotacao.DOLAR_PARA_EURO.getValor();
			return String.format("%.2f", valorConvertido);
    	}
    	
    	else if (moedaOrigem == "Euro" && moedaDestino == "Dólar") {
    		valorConvertido = valor / cotacao.DOLAR_PARA_EURO.getValor();
			return String.format("%.2f", valorConvertido);
    	}
    	
    	else if (moedaOrigem == "Dólar" && moedaDestino == "Libras Esterlinas") {
    		valorConvertido = valor * cotacao.DOLAR_PARA_LIBRAS.getValor();
			return String.format("%.2f", valorConvertido);
    	}
    	
    	else if (moedaOrigem == "Libras Esterlinas" && moedaDestino == "Dólar") {
    		valorConvertido = valor / cotacao.DOLAR_PARA_LIBRAS.getValor();
			return String.format("%.2f", valorConvertido);
    	}
    	
    	else if (moedaOrigem == "Dólar" && moedaDestino == "Peso Argentino") {
    		valorConvertido = valor * cotacao.DOLAR_PARA_ARGENTINO.getValor();
			return String.format("%.2f", valorConvertido);
    	}
    	
    	else if (moedaOrigem == "Peso Argentino" && moedaDestino == "Dólar") {
    		valorConvertido = valor / cotacao.DOLAR_PARA_ARGENTINO.getValor();
			return String.format("%.2f", valorConvertido);
    	}
    	
    	else if (moedaOrigem == "Dólar" && moedaDestino == "Peso Chileno") {
    		valorConvertido = valor * cotacao.DOLAR_PARA_CHILENO.getValor();
			return String.format("%.2f", valorConvertido);
    	}
    	
    	else if (moedaOrigem == "Peso Chileno" && moedaDestino == "Dólar") {
    		valorConvertido = valor / cotacao.DOLAR_PARA_CHILENO.getValor();
			return String.format("%.2f", valorConvertido);
    	}
    	
    	else if (moedaOrigem == "Euro" && moedaDestino == "Libras Esterlinas") {
    		valorConvertido = valor * cotacao.EURO_PARA_LIBRAS.getValor();
			return String.format("%.2f", valorConvertido);
    	}
    	
    	else if (moedaOrigem == "Libras Esterlinas" && moedaDestino == "Euro") {
    		valorConvertido = valor / cotacao.EURO_PARA_LIBRAS.getValor();
			return String.format("%.2f", valorConvertido);
    	}
    	
    	else if (moedaOrigem == "Euro" && moedaDestino == "Peso Argentino") {
    		valorConvertido = valor * cotacao.EURO_PARA_ARGENTINO.getValor();
			return String.format("%.2f", valorConvertido);
    	}
    	
    	else if (moedaOrigem == "Peso Argentino" && moedaDestino == "Euro") {
    		valorConvertido = valor / cotacao.EURO_PARA_ARGENTINO.getValor();
			return String.format("%.2f", valorConvertido);
    	}
    	
    	else if (moedaOrigem == "Euro" && moedaDestino == "Peso Chileno") {
    		valorConvertido = valor / cotacao.EURO_PARA_CHILENO.getValor();
			return String.format("%.2f", valorConvertido);
    	}
    	
    	else if (moedaOrigem == "Libras" && moedaDestino == "Peso Argentino") {
    		valorConvertido = valor * cotacao.LIBRAS_PARA_ARGENTINO.getValor();
			return String.format("%.2f", valorConvertido);
    	}
    	
    	else if (moedaOrigem == "Peso Argentino" && moedaDestino == "Libras") {
    		valorConvertido = valor / cotacao.LIBRAS_PARA_ARGENTINO.getValor();
			return String.format("%.2f", valorConvertido);
    	}
    	
    	else if (moedaOrigem == "Libras" && moedaDestino == "Peso Chileno") {
    		valorConvertido = valor * cotacao.LIBRAS_PARA_CHILENO.getValor();
			return String.format("%.2f", valorConvertido);
    	}
    	
    	else if (moedaOrigem == "Peso Argentino" && moedaDestino == "Peso Chileno") {
    		valorConvertido = valor * cotacao.ARGENTINO_PARA_CHILENO.getValor();
			return String.format("%.2f", valorConvertido);
    	}
    	
    	else if (moedaOrigem == "Peso Chileno" && moedaDestino == "Peso Argentino") {
    		valorConvertido = valor / cotacao.ARGENTINO_PARA_CHILENO.getValor();
			return String.format("%.2f", valorConvertido);
    	}
    	
    	else {
			return String.format("%.2f", valor);
    	}
    	
    }


}
