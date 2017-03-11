/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.jdelgadog.a10;

import java.util.Scanner;

/**
 *
 * @author GILDARDO
 */
public class SPPJDelgadoGA10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tamaño = solicitaDimensiones();
        int[][] a = arreglo("A", tamaño);
        int[][] b = arreglo("B", tamaño);

        sumaMatriz(a, b);
        restaMatriz(a, b);
    }

    public static int solicitaEntero() {
        Scanner kb = new Scanner(System.in);
        boolean flag;
        int n = 0;
        do {
            System.out.println("Introduce un número entero");
            try {
                n = kb.nextInt();
                flag = false;

            } catch (Exception er) {
                System.out.println("Lo que introdujo no es un entero, Inténtalo de nuevo");
                flag = true;
                kb.nextLine();
            }
        } while (flag);

        return n;
    }

    public static int solicitaDimensiones() {
        Scanner key = new Scanner(System.in);
        boolean flag;
        int a = 0;
        do {
            try {
                System.out.println("Escribe la dimensión de las matrices : ");
                a = key.nextInt();
                flag = false;
            } catch (Exception e) {
                System.out.println("Error");
                key.next();
                flag = true;
            }
        } while (flag);
        return a;
    }

    public static int[][] arreglo(String a, int tamaño) {
        int[][] arreglo = new int[tamaño][tamaño];
        System.out.println("Arreglo: " + a);
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                arreglo[i][j] = solicitaEntero();
            }
        }
        return arreglo;
    }
    //realizar la suma de matrices en un metodo

    public static int[][] sumaMatriz(int[][] a, int[][] b) {
        int[][] resultado = new int[a.length][a.length];
        System.out.println("Suma A+B: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                resultado[i][j] = a[i][j] + b[i][j];
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println("");
        }
        return resultado;
    }

    //Realizar resta de matrices
    public static int[][] restaMatriz(int[][] a, int[][] b) {
        int[][] resultado = new int[a.length][a.length];
        System.out.println("Resta A-B: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                resultado[i][j] = a[i][j] - b[i][j];
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println("");
        }
        return resultado;
    }

    //Realizar multiplicación de matrices
    public static int[][] multiplicaciónMatrizAB(int[][] a, int[][] b) {
        int[][] resultado = new int[a.length][a.length];
        System.out.println("Multiplicación A*B: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                resultado[i][j] = resultado[i][j]+(a[i][j] * b[i][j]);
                System.out.print(resultado[i][j] + " ");
                    }
                    System.out.println("");
                }
                return resultado;
            }
        }
