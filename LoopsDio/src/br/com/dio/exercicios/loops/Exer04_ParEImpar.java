package br.com.dio.exercicios.loops;
import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class Exer04_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nNumeros;
        int num;
        int pares = 0, impares = 0;

        System.out.println("Quantidade de número: ");
        nNumeros = scan.nextInt();

        int count = 0;
        do{
            System.out.println("Número: ");
            num = scan.nextInt();

            if (num % 2 == 0) pares++;
            else impares++;

            count ++;
        } while(count < nNumeros);

        System.out.println("Quantidade Par: " + pares);
        System.out.println("Quantidade Impar: " + impares);

    }
}
