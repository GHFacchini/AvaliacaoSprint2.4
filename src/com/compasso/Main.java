package com.compasso;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
            System.out.println("\nInsira uma frase: ");
            Scanner scanner = new Scanner(System.in);

            comparaEmoticon(scanner.nextLine());

        }
    }

    private static void comparaEmoticon(String texto) {
        int pos = -1;
        int contagemFeliz = 0;
        while (true) {
            pos = texto.indexOf(":-)", pos + 1);
            if (pos < 0) break;
            contagemFeliz++;
        }
        pos = -1;
        int contagemTriste = 0;
        while (true) {
            pos = texto.indexOf(":-(", pos + 1);
            if (pos < 0) break;
            contagemTriste++;
        }

        if (contagemFeliz < contagemTriste) {
            System.out.println("\nchateado");
        } else if (contagemFeliz > contagemTriste) {
            System.out.println("\ndivertido");
        } else {
            System.out.println("\nneutro");
        }
    }
}
