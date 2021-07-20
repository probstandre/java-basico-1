import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Programa {
    // [[ytftyfty][tftft][ygygy]]
    public static void main(String[] args_) {
        String[] args = { "add", "2", "8" };
        System.out.println("Ligou");
        if (Objects.nonNull(args) && args.length > 0) {
            if ("soma".equals(args[0])) {
                Integer soma = 0;
                for (int i = 1; i < args.length; i++) { // i = i + 1 
                    soma += Integer.valueOf(args[i]);
                }
                System.out.println("A soma dos valores: " + soma);
            } else if ("add".equals(args[0])) {
                List<String> compras = new ArrayList<>();
                Integer i = 0;
                while (i < args.length) {
                    compras.add(args[i]);
                    ++i;
                }
                System.out.println(Arrays.toString(compras.toArray()));
            } else {
                listar(args);
            }
        } else {
            System.out.println("nao veio nada :(");
        }
    }

    private static void listar(String[] args) {
        for (String item : args) {
            System.out.println(item);
        }
    }
}