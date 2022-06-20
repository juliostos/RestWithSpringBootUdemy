package br.com.erudio.request.converters;

public class NumberConverter {
//Converte o número para Double
	
	public static Double convertToDouble(String strNumber) {
		if(strNumber == null) return 0d;
		String number = strNumber.replaceAll(",",".");
		if(isNumeric(number)) return Double.parseDouble(number);
		return 0d;
	}
	
//Verifica se é numérico
	public static boolean isNumeric(String strNumber) {
		if(strNumber == null) return false;
		String number = strNumber.replaceAll(",",".");
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
	

}
