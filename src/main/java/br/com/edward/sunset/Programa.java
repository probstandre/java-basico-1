package br.com.edward.sunset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Programa {
    // [[ytftyfty][tftft][ygygy]]
    public static void main(String[] args) {
    	
        System.out.println("Ligou");
        if (Objects.nonNull(args) && args.length > 0) {
            if ("soma".equals(args[0])) {
                soma(args);
            } else if ("add".equals(args[0])) {
                add(args);
            } else if ("exp".equals(args[0])) {
                exp();
            } else {
                listar(args);
            }
        } else {
            System.out.println("nao veio nada :(");
        }
    }

    private static void add(String[] args) {
        List<String> compras = new ArrayList<>();
        Integer i = 0;
        while (++i < args.length) {
            compras.add(args[i]);
        }
        System.out.println(Arrays.toString(compras.toArray()));
    }

    private static void soma(String[] args) {
        Integer soma = 0;
        for (int i = 1; i < args.length; i++) { // i = i + 1 
            soma += Integer.valueOf(args[i]);
        }
        System.out.println("A soma dos valores: " + soma);
    }

    private static void listar(String[] args) {
        for (String item : args) {
            System.out.println(item);
        }
    }

    private static void exp() {
        Integer a = 0;
        Integer b = 0;
        System.out.println(a++);
        System.out.println(++b);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}