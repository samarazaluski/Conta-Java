package Cp1;

import java.util.Arrays;

public class Conta {

    //Defindo atributos
    
    String titular;
    String numConta;
    String agencia;
    double saldo;


    //Definindo métados

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }




//Código em método main()

    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.titular = "Samara";
        c1.numConta = "123-4";
        c1.agencia = "0001-";
        c1.saldo = 2000.00;

        System.out.println("Titular: " + c1.getTitular());
        System.out.println("Digite o número da sua conta: " + c1.getNumConta());
        System.out.println("Digite o número de sua agência: " + c1.getAgencia());
        System.out.println("Seu saldo eh: " + c1.getSaldo());

        System.out.println("-----------------------------");

        Conta c2 = new Conta();
        c2.titular = "Zaluski";
        c2.numConta = "154-4";
        c2.agencia = "0002-";
        c2.saldo = 5000.00;

        System.out.println("Titular: " + c2.getTitular());
        System.out.println("Digite o número da sua conta: " + c2.getNumConta());
        System.out.println("Digite o número de sua agência: " + c2.getAgencia());
        System.out.println("Seu saldo eh: " + c2.getSaldo());

    }
}

