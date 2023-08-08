package br.com.one.conversor;

public class ConversorMoeda {
	Double valorConvertido;

	public ConversorMoeda() {

	}

    // método para conversão da moeda para real (cotação)
    public String converterMoedas(Double valor, String moedaOrigem, String moedaDestino) {
    	
    	if(moedaOrigem.equals("Real") && moedaDestino.equals("Dólar")) {
    		valorConvertido = valor * CotacaoMoedas.REAL_PARA_DOLAR.getValor();
    		return String.format("%.2f", valorConvertido);
    				
    	}
    	
    	else if (moedaOrigem.equals("Dólar") && moedaDestino.equals("Real")) {
    		valorConvertido = valor / CotacaoMoedas.REAL_PARA_DOLAR.getValor();
			return String.format("%.2f", valorConvertido);
    				
    	}
    	
    	else if (moedaOrigem.equals("Real") && moedaDestino.equals("Euro")) {
    		valorConvertido = valor * CotacaoMoedas.REAL_PARA_EURO.getValor();
			return String.format("%.2f", valorConvertido);
    				
    	}
    	
    	else if (moedaOrigem.equals("Euro") && moedaDestino.equals("Real")) {
    		valorConvertido = valor / CotacaoMoedas.REAL_PARA_EURO.getValor();
			return String.format("%.2f", valorConvertido);
    				
    	}
    	
    	else if (moedaOrigem.equals("Real") && moedaDestino.equals("Libras Esterlinas")) {
    		valorConvertido = valor * CotacaoMoedas.REAL_PARA_LIBRAS.getValor();
			return String.format("%.2f", valorConvertido);
    				
    	}
    	
    	else if (moedaOrigem.equals("Libras Esterlinas") && moedaDestino.equals("Real")) {
    		valorConvertido = valor / CotacaoMoedas.REAL_PARA_LIBRAS.getValor();
			return String.format("%.2f", valorConvertido);
    				
    	}
    	
    	else if (moedaOrigem.equals("Real") && moedaDestino.equals("Peso Argentino")) {
    		valorConvertido = valor * CotacaoMoedas.REAL_PARA_ARGENTINO.getValor();
			return String.format("%.2f", valorConvertido);
    				
    	}
    	
    	else if (moedaOrigem.equals("Peso Argentino") && moedaDestino.equals("Real")) {
    		valorConvertido = valor / CotacaoMoedas.REAL_PARA_ARGENTINO.getValor();
			return String.format("%.2f", valorConvertido);
    				
    	}
    	
    	else if (moedaOrigem.equals("Real") && moedaDestino.equals("Peso Chileno")) {
    		valorConvertido = valor * CotacaoMoedas.REAL_PARA_CHILENO.getValor();
			return String.format("%.2f", valorConvertido);
    				
    	}
    	
    	else if (moedaOrigem.equals("Peso Chileno") && moedaDestino.equals("Real")) {
    		valorConvertido = valor / CotacaoMoedas.REAL_PARA_CHILENO.getValor();
			return String.format("%.2f", valorConvertido);
    	}

    	else if (moedaOrigem.equals("Dólar") && moedaDestino.equals("Euro")) {
    		valorConvertido = valor * CotacaoMoedas.DOLAR_PARA_EURO.getValor();
			return String.format("%.2f", valorConvertido);
    	}
    	
    	else if (moedaOrigem.equals("Euro") && moedaDestino.equals("Dólar")) {
    		valorConvertido = valor / CotacaoMoedas.DOLAR_PARA_EURO.getValor();
			return String.format("%.2f", valorConvertido);
    	}
    	
    	else if (moedaOrigem.equals("Dólar") && moedaDestino.equals("Libras Esterlinas")) {
    		valorConvertido = valor * CotacaoMoedas.DOLAR_PARA_LIBRAS.getValor();
			return String.format("%.2f", valorConvertido);
    	}
    	
    	else if (moedaOrigem.equals("Libras Esterlinas") && moedaDestino.equals("Dólar")) {
    		valorConvertido = valor / CotacaoMoedas.DOLAR_PARA_LIBRAS.getValor();
			return String.format("%.2f", valorConvertido);
    	}
    	
    	else if (moedaOrigem.equals("Dólar") && moedaDestino.equals("Peso Argentino")) {
    		valorConvertido = valor * CotacaoMoedas.DOLAR_PARA_ARGENTINO.getValor();
			return String.format("%.2f", valorConvertido);
    	}
    	
    	else if (moedaOrigem.equals("Peso Argentino") && moedaDestino.equals("Dólar")) {
    		valorConvertido = valor / CotacaoMoedas.DOLAR_PARA_ARGENTINO.getValor();
			return String.format("%.2f", valorConvertido);
    	}
    	
    	else if (moedaOrigem.equals("Dólar") && moedaDestino.equals("Peso Chileno")) {
    		valorConvertido = valor * CotacaoMoedas.DOLAR_PARA_CHILENO.getValor();
			return String.format("%.2f", valorConvertido);
    	}
    	
    	else if (moedaOrigem.equals("Peso Chileno") && moedaDestino.equals("Dólar")) {
    		valorConvertido = valor / CotacaoMoedas.DOLAR_PARA_CHILENO.getValor();
			return String.format("%.2f", valorConvertido);
    	}
    	
    	else if (moedaOrigem.equals("Euro") && moedaDestino.equals("Libras Esterlinas")) {
    		valorConvertido = valor * CotacaoMoedas.EURO_PARA_LIBRAS.getValor();
			return String.format("%.2f", valorConvertido);
    	}
    	
    	else if (moedaOrigem.equals("Libras Esterlinas") && moedaDestino.equals("Euro")) {
    		valorConvertido = valor / CotacaoMoedas.EURO_PARA_LIBRAS.getValor();
			return String.format("%.2f", valorConvertido);
    	}
    	
    	else if (moedaOrigem.equals("Euro") && moedaDestino.equals("Peso Argentino")) {
    		valorConvertido = valor * CotacaoMoedas.EURO_PARA_ARGENTINO.getValor();
			return String.format("%.2f", valorConvertido);
    	}
    	
    	else if (moedaOrigem.equals("Peso Argentino") && moedaDestino.equals("Euro")) {
    		valorConvertido = valor / CotacaoMoedas.EURO_PARA_ARGENTINO.getValor();
			return String.format("%.2f", valorConvertido);
    	}
    	
    	else if (moedaOrigem.equals("Euro") && moedaDestino.equals("Peso Chileno")) {
    		valorConvertido = valor / CotacaoMoedas.EURO_PARA_CHILENO.getValor();
			return String.format("%.2f", valorConvertido);
    	}
    	
    	else if (moedaOrigem.equals("Libras") && moedaDestino.equals("Peso Argentino")) {
    		valorConvertido = valor * CotacaoMoedas.LIBRAS_PARA_ARGENTINO.getValor();
			return String.format("%.2f", valorConvertido);
    	}
    	
    	else if (moedaOrigem.equals("Peso Argentino") && moedaDestino.equals("Libras")) {
    		valorConvertido = valor / CotacaoMoedas.LIBRAS_PARA_ARGENTINO.getValor();
			return String.format("%.2f", valorConvertido);
    	}
    	
    	else if (moedaOrigem.equals("Libras") && moedaDestino.equals("Peso Chileno")) {
    		valorConvertido = valor * CotacaoMoedas.LIBRAS_PARA_CHILENO.getValor();
			return String.format("%.2f", valorConvertido);
    	}
    	
    	else if (moedaOrigem.equals("Peso Argentino") && moedaDestino.equals("Peso Chileno")) {
    		valorConvertido = valor * CotacaoMoedas.ARGENTINO_PARA_CHILENO.getValor();
			return String.format("%.2f", valorConvertido);
    	}
    	
    	else if (moedaOrigem.equals("Peso Chileno") && moedaDestino.equals("Peso Argentino")) {
    		valorConvertido = valor / CotacaoMoedas.ARGENTINO_PARA_CHILENO.getValor();
			return String.format("%.2f", valorConvertido);
    	}
    	
    	else {
			return String.format("%.2f", valor);
    	}
    	
    }


}
