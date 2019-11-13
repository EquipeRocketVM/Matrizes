/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExemploProfessor;

import java.util.Scanner;

/**
 *
 * @author vitoria.csilva15
 */
public class MatrizFuncoes {

    static Scanner sc = new Scanner(System.in);

    static int[] tamanhoMatriz() {

        // fez uma matriz para retornar somente 1 valor
        int tamanho[] = new int[2];

        System.out.println("Linha: ");
        tamanho[0] = sc.nextInt();
        System.out.println("Coluna: ");
        tamanho[1] = sc.nextInt();

        return tamanho;

    }

    static int[][] CriarMatriz(int[] tamanho) {
        //Vai criar uma matriz com i + j

        int[][] matriz = new int[tamanho[0]][tamanho[1]];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Matriz[%d][%d] : \n ", i, j);
                matriz[i][j] = sc.nextInt();
            }

        }
        return matriz;
    }

    static int obterNumero() {

        // Npergunta pro usuario um numero pra ver se repete na matriz
        System.out.println("Digite um número: ");
        int n = sc.nextInt();
        return n;
    }

    static int verificarOco(int[][] m, int n) {
        // quantas vezes o numero aparece
        int cont = 0; // contador para receber a variavel dentro da matriz
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == n) {
                    cont++;
                }

            }

        }
        return cont;

    }
    
    static void imprimirOco(int n, int cont){
        System.out.printf("O número %d apareceu %d vezes", n, cont);
    }

    public static void main(String[] args) {
        
        int [] t = tamanhoMatriz(); // funcao sem parametro retorna vetor
        int [][] m = CriarMatriz(t); // funcao recebe um vetor e retorna uma matriz
        int n = obterNumero(); // funcao que nao tem parametro e retorna um inteiro
        int cont = verificarOco(m, n); // funcao que recebe matriz e um inteiro e retorna um inteiro
        imprimirOco(n, cont); // recebe dois inteiros e nao retorna nada
        System.out.println("");
        
        
    }
}
