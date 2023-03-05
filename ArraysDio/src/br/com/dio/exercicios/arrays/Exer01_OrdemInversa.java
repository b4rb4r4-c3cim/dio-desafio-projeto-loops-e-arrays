package br.com.dio.exercicios.arrays;
/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class Exer01_OrdemInversa {
    public static void main(String[] args) {
        int[]vetor = {-2, -1, 0, 1, 2,3};

        System.out.print("Vetor: ");
        int count = 0;
        while(count < (vetor.length)){
            System.out.print(vetor[count]+" ");
            count++;
        }
        System.out.print("\nVetor: ");
        for(int i = (vetor.length - 1); 1>=0; i--){
            System.out.print(vetor[i] + " ");
        }
    }
}
