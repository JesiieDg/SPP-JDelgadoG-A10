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
         sumadevectores();
    }
   
       public static void sumadevectores() {  
        int r;
        
       r=TamMat();
       
       int [][]Matriz1 = GeneracionMatriz(r);
       int[][]Matriz2 = GeneracionMatriz(r);
       
       MatricesSuma( Matriz1, Matriz2);
       MatricesResta ( Matriz1, Matriz2);
       MatricesMultiplicacion ( Matriz1, Matriz2);
       
}
    
    public static int  TamMat(){
        int r;
        System.out.println("Introduce tamaño de matrices");
 r = SolicitaEntero();
 return r;
            
    }
    
    public static int [][] GeneracionMatriz(int r) {
        Scanner kb = new Scanner (System.in);
    int t;
        int [][] Matriz = new int [r][r];
        t = (r*r);
        System.out.println("Introduce datos de matriz, capacidad de "+ t + " variables.");
        
        for (int i = 0; i < Matriz.length; i++ ) 
        {
        
            
            for (int j = 0; j < Matriz.length; j++) 
            {

                System.out.println("Introduce varaible " + i +","+ j );

                Matriz[i][j]=SolicitaEntero();

            }
       
        }
        
        return Matriz;
    
    
    }
    
   
    
    public static void MatricesSuma(int [][]Matriz1,int [][] Matriz2) {
        System.out.println("La suma de matrices es: ");
        
        for(int i = 0; i <Matriz1.length; i++)
        {
            for(int j = 0; j <Matriz1.length; j++)
            {
                Matriz2[i][j]+= Matriz1[i][j];
                
                
                System.out.print(Matriz2[i][j]+" ");
            }
            System.out.println("");
        }
        
        
        
        
        
    
    }
    
    public static void error() {
    
        System.out.println("Usted no ha introducido un numero entero");
        System.out.println("Se ha producido un error en la ejecucion del programa.");
        System.out.println("El programa se ha detenido.");
        System.out.println("******************************************************");
        Salida();
        
    
    }
    
    public static void Salida() {
        Scanner kb = new Scanner (System.in);
        int x;
    
        System.out.println("Inserta un numero para reiniciar.");
        System.out.println("Inserta cualquier otra tecla para salir.");
    
    try {
        x =kb.nextInt();
        sumadevectores();
    
    }
    catch (Exception ex) {
        System.exit(0);
            
        }
    
    
    
    
    
    }
    
    public static int SolicitaEntero() {
    
    
       
   Scanner kb = new Scanner(System.in);
   int e=0;
        
        
        try {
            
            e =kb.nextInt();
              
        }
        catch (Exception ex) {
            
           error();
            
        }
        
        return e;
    
    }
    
     public static void MatricesResta(int [][]Matriz1,int [][] Matriz2) {
         
        
         System.out.println("La resta de matrices es: ");
     
       
        for(int i = 0; i <Matriz1.length; i++)
        {
            for(int j = 0; j <Matriz1.length; j++)
            {
                    
                Matriz2[i][j]-= Matriz1[i][j];
                
                
                System.out.print(Matriz2[i][j]+" ");
            }
            System.out.println("");
        }
     }
     
     public static void MatricesMultiplicacion(int [][]a,int [][] b) {
         
         System.out.println("Calculo de Matriz 1 * Matriz 2.");
         
         
         for ( int i = 0; i < a.length; i++) {
         
          for (int j = 0; j < a[1].length; j++  ) {
         
            for (int K =0; K< a.length; K++ ) {
          
                int Matriz3 = a[i][K] * b [K][j];
                
                System.out.println(Matriz3);
           
           
          }
            
         
         }
         
         
         }
         
         
             
         
         System.out.println("Calculo de Matriz 2 * Matriz 1.");
         
         
         for ( int i = 0; i < a.length; i++) {
         
          for (int j = 0; j < a[1].length; j++  ) {
         
            for (int K =0; K< a.length; K++ ) {
          
                int Matriz3 = a[j][K] * b [K][i];
                
                System.out.println(Matriz3);
           
           
          }
            
         
         }
         
         
         }
           
         
     }
    
    
    
    
    
}