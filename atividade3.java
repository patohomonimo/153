import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int sexo;

        System.out.println("digite 1 para masculino ou 2 para feminino: ");
        sexo = leia.nextInt();
        
        if (sexo == 1) {
            System.out.println("masculino");
        } else {
            System.out.println("feminino");
        }

    }
}