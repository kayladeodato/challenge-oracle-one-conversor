package br.com.one.conversor;

public class ConversorTemperatura {

    Double temperaturaConvertida;

    public ConversorTemperatura() {

    }

    public String converterTemperatura(Double temperatura, String temperaturaOrigem, String temperaturaDestino) {
        if (temperaturaOrigem.equals("Celsius") && temperaturaDestino.equals("Fahrenheit")) {
            temperaturaConvertida = (1.8 * temperatura + 32);
            return String.format("%.2f ºF", temperaturaConvertida);

        } else if (temperaturaOrigem.equals("Celsius") && temperaturaDestino.equals("Kelvin")) {
            temperaturaConvertida = temperatura + 273.15;
            return String.format("%.2f K", temperaturaConvertida);

        } else if (temperaturaOrigem.equals("Fahrenheit") && temperaturaDestino.equals("Celsius")) {
            temperaturaConvertida = (temperatura - 32) * 5 / 9;
            return String.format("%.2f ºC", temperaturaConvertida);

        } else if (temperaturaOrigem.equals("Fahrenheit") && temperaturaDestino.equals("Kelvin")) {
            temperaturaConvertida = (temperatura + 459.67) * 5 / 9;
            return String.format("%.2f K", temperaturaConvertida);

        } else if (temperaturaOrigem.equals("Kelvin") && temperaturaDestino.equals("Celsius")) {
            temperaturaConvertida = (temperatura - 273.15);
            return String.format("%.2f ºC", temperaturaConvertida);

        } else if (temperaturaOrigem.equals("Kelvin") && temperaturaDestino.equals("Fahrenheit")) {
            temperaturaConvertida = temperatura * 9 / 5 - 459.67;
            return String.format("%.2f ºF", temperaturaConvertida);

        } else {
            return String.format("%.2f", temperatura);
        }
    }

}

