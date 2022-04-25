package com.mycompany.contabancaria;

public class Teste{

    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria();
        cb.depositar(10);

        System.out.println("Data de criação: " + cb.getDataAberturaFormatada());
        System.out.println("Saldo Atual: " + cb.getSaldoFormatado());
    }
}
