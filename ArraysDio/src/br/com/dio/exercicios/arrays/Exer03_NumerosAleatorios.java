package br.com.dio.exercicios.arrays;
import java.util.Random;
import java.util.Scanner;
/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/

public class Exer03_NumerosAleatorios {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("Números aleatórios: ");
        for (int numero:numerosAleatorios) {

            System.out.println(numero + " ");

        }System.out.println("Sucessores de números aleatórios: ");
        for (int numero:numerosAleatorios) {

            System.out.println(numero+1 + " ");

        }
        System.out.print("\nAntecessor dos Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero-1) + " ");
        }

    }
}
