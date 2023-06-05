package org.learning.java.bank;

import java.util.Random;
import java.util.Scanner;

public class Conto {
    private int numeroConto;
    private String nomeUtente;
    private double saldo;

    // Costruttore per creare un nuovo conto
    public Conto(String nomeUtente) {
        this.numeroConto = generaNuovoNemero();
        this.nomeUtente = nomeUtente;
        this.saldo = 0;
    }

    // Metodo privato per ottenere un numero conto random
    private int generaNuovoNemero() {
        Random random = new Random();
        return random.nextInt(1000) + 1;
    }

    // Metodo getter per il numero conto
    public int getNumeroConto() {
        return numeroConto;
    }

    // Metodo geter/setter per il nome proprietario
    public String getNomeUtente() {
        return nomeUtente;
    }

    public void setNomeUtente(String nomeUtente) {
        this.nomeUtente = nomeUtente;
    }

    // Metodo getter per avere il saldo conto
    public double getSaldo() {
        return saldo;
    }

    // Metodo per versare soldi sul conto
    public void versare(double somma) {
        saldo += somma;
    }

    // Metodo per prelevare soldi
    public void prelevare(double somma) {
        if (saldo >= somma) {
            saldo -= somma;
            System.out.println("Operazione completata. Il saldo attuale del conto è: " + saldoFinale());
        } else {
            System.out.println("Il tuo saldo non è sufficente a prelevare la somma");
        }
    }

    // Metodo per le info conto
    public void ottieniInfo() {
        System.out.println("Numero del conto: " + numeroConto);
        System.out.println("Nome cliente: " + nomeUtente);
        System.out.println("Il tuo saldo è: " + saldoFinale());
    }

    // Metodo per ottenere il saldo finale
    private String saldoFinale() {
        return String.format("%.2f €", saldo);
    }
}
