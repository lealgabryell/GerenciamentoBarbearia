package gerenciamentoBarbeiro;

import java.util.Scanner;

public class Uteis {
    private Scanner sc = new Scanner(System.in);

    public void mostrarLinha() {
        System.out.println(
                ".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
    }

    public int lerInteiro(String mensagem) {
        System.out.println(mensagem);
        int numero;
        while (true) {
            try {
                numero = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Digite um numero valido!");
            }
        }
        return numero;
    }

    public String lerString(String mensagem) {
        System.out.println(mensagem);
        String string = sc.nextLine();
        return string;
    }
}
