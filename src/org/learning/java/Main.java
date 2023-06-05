package org.learning.java;

public class Main {
    public static void main(String[] args) {
        Prodotto prodotto = new Prodotto("Prodotto 1", "Descrizione prodotto 1", 15.90, 0.20);

        System.out.println("Codice: " + prodotto.getCodice());
        System.out.println("Nome: " + prodotto.getNome());
        System.out.println("Descrizione: " + prodotto.getDescrizione());
        System.out.println("Prezzo base: " + prodotto.getPrezzoBase());
        System.out.println("Prrezzo con iva: " + prodotto.getPrezzoIva());
        System.out.println("Nome intero: " + prodotto.getNomeIntero());

        prodotto.setNome("Prodotto 1 aggiornato");
        prodotto.setDescrizione("descrizione prodotto 1 aggiornata");
        prodotto.setPrezzo(20.00);
        prodotto.setIva(0.22);

        System.out.println("Nome aggiornato: " + prodotto.getNome());
        System.out.println("Descrizione aggiornata: " + prodotto.getDescrizione());
        System.out.println("Prezzo aggiornato: " + prodotto.getPrezzo());
        System.out.println("Prezzo con IVA aggiornato: " + prodotto.getPrezzoIva());
        System.out.println("Nome esteso aggiornato: " + prodotto.getNomeIntero());
    }
}
