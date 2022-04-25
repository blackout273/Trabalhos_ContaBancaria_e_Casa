package com.mycompany.contabancaria;

import java.text.SimpleDateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class ContaBancaria {

    private double saldo = 0.0;
    private final Date dataAbertura;

    public ContaBancaria() {
        this.dataAbertura = new Date();

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public String getDataAberturaFormatada() {
        SimpleDateFormat dateFormated = new SimpleDateFormat("dd/MM/YYYY");
        return dateFormated.format(dataAbertura);
    }

    public String getSaldoFormatado() {
        Locale locale = new Locale("pt", "BR");
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(locale);

        return dinheiro.format(saldo);
    }

    public void depositar(double deposito) {
        this.saldo += deposito;
    }

    public void sacar(double saque) {
        if (saque > saldo) {
            System.out.println("Conta nao pode ficar negativa");
        } else {
            saldo -= saque;
        }

    }

}
