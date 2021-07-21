package br.com.edward.sunset;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProgramaData {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		LocalDate niver = LocalDate.parse("2023-07-20", DateTimeFormatter.ISO_LOCAL_DATE);
		
		Integer dias = 0;
		while (niver.isBefore(hoje)) {
			dias++;
			niver = niver.plusDays(1); // viajantes do futuro
		}
	
		System.out.println("Voce viveu " + dias + " dias"); // arrumar o s
	}
}
