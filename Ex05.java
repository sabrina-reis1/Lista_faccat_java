import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor = scanner.nextInt();

        int antecessor = valor - 1;

        System.out.println("O antecessor de " + valor + " é " + antecessor);
    }
}
