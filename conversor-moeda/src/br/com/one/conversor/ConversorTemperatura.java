package br.com.one.conversor;

public class ConversorTemperatura {

    Double temperaturaConvertida;

    public ConversorTemperatura() {

    }

    public String converterTemperatura(Double temperatura, String temperaturaOrigem, String temperaturaDestino) {
        if (temperaturaOrigem == "Celsius" && temperaturaDestino == "Fahrenheit") {
            temperaturaConvertida = (1.8 * temperatura + 32);
            return String.format("%.2f", temperaturaConvertida);

        } else if (temperaturaOrigem == "Celsius" && temperaturaDestino == "Kelvin") {
            temperaturaConvertida = temperatura + 273.15;
            return String.format("%.2f", temperaturaConvertida);

        } else if (temperaturaOrigem == "Fahrenheit" && temperaturaDestino == "Celsius") {
            temperaturaConvertida = (temperatura - 32) * 5 / 9;
            return String.format("%.2f", temperaturaConvertida);

        } else if (temperaturaOrigem == "Fahrenheit" && temperaturaDestino == "Kelvin") {
            temperaturaConvertida = (temperatura + 459.67) * 5 / 9;
            return String.format("%.2f", temperaturaConvertida);

        } else if (temperaturaOrigem == "Kelvin" && temperaturaDestino == "Celsius") {
            temperaturaConvertida = (temperatura - 273.15);
            return String.format("%.2f", temperaturaConvertida);

        } else if (temperaturaOrigem == "Kelvin" && temperaturaDestino == "Fahrenheit") {
            temperaturaConvertida = temperatura * 9 / 5 - 459.67;
            return String.format("%.2f", temperaturaConvertida);

        } else {
            return "";
        }
    }

}

