package br.com.edward.trijava;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fusorario {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		
		LocalDate niver = LocalDate.parse("2005-07-21", DateTimeFormatter.ISO_LOCAL_DATE);
		niver = niver.plusDays(500);
		System.out.println(niver.format(DateTimeFormatter.ISO_LOCAL_DATE));
	}
}
