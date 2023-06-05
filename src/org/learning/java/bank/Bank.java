package org.learning.java.bank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il tuo nome: ");
        String nomeUser = scanner.nextLine();

        Conto conto = new Conto(nomeUser);

        System.out.println("Benvenuto, " + conto.getNomeUtente() + ". Il tuo numero conto è: " + conto.getNumeroConto());

        boolean continua = true;
        while (continua) {
            System.out.println("Scegli un operazione");
            System.out.println("- Versare contanti");
            System.out.println("- Prelevare contanti");
            System.out.println("- Esci");

            int scelta = scanner.nextInt();

            switch (scelta) {
                case  1: System.out.print("Inserisci i contanti: ");
                     double soldiVersati = scanner.nextDouble();
                     conto.versare(soldiVersati);
                     System.out.println("Operazio avvenuta con sucesso. Il nuovo saldo è: " + conto.getSaldo());
                     break;

                case 2: System.out.print("Inserisci la somma dda prelevare: ");
                    double soldiPrelevati = scanner.nextDouble();
                    conto.prelevare(soldiPrelevati);
                    System.out.println("Operazio avvenuta con sucesso. Il nuovo saldo è: " + conto.getSaldo());
                    break;

                case 3: continua = false;
                break;

                default: System.out.println("Operazio non riuscita! Riprova.");
                break;
            }
        }
        System.out.println("Grazie per averci scelo");
    }
}
