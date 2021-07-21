package br.com.edward.trijava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaCompra {
    public static void main(String[] args) {
        List<String> produtos = new ArrayList<>();
        try (Scanner ler = new Scanner(System.in)) {
            while (produtos.size() < 5) {
                System.out.println("Digite um produto");
                String valor = ler.next();
                produtos.add(valor);
            }
            System.out.println("A lista: " + produtos);
        }
    }
}
