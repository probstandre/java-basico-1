import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaCompra {
    public static void main(String[] args) {
        List<String> produtos = new ArrayList<>();
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite");
        String valor = ler.next();
        System.out.println(valor);
    }
}
