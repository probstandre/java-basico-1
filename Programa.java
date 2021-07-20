import java.util.Objects;

public class Programa {
    // [[ijij][rdrdrdr]]
    public static void main(String[] args_) {

        String[] args = { "somax", "20", "1" };
        System.out.println("Iniciado");
        if (Objects.nonNull(args) && args.length > 0) {
            
            if ("soma".equals(args[0])) {
                Integer soma = 0;
                for (int i = 1; i < args.length; i++) { // i = i + 1
                    soma += Integer.valueOf(args[i]);
                }
                System.out.println("O resultado da soma e: " + soma);
            } else {
                for (String item : args) {
                    System.out.println("voce informou: " + item);
                }
            }
        } else {
            System.out.println("Em args tem menos que 1");
        }
    }
    /*
    Informe qualquer valor​

    Soma 1 2 5 8 9​

    Multiplica 4 8 6 7
    */

}