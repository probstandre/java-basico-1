package br.com.edward.sunset;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProgramaData {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		LocalDate niver = LocalDate.parse("2005-06-01", DateTimeFormatter.ISO_LOCAL_DATE);
		niver = niver.plusDays(52);
		System.out.println("Hoje é: " + hoje.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println("Niver é: " + niver.format(DateTimeFormatter.ISO_LOCAL_DATE));
	}
}
