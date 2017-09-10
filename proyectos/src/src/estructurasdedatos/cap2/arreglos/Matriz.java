/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap2.arreglos;

/* @author Diego Mauricio galvis*/

public class Matriz {
    

    private int filas;         
    private int columnas;        
    private int[][] matriz;      

    public void crearmatriz(int f, int c) {  
        this.filas = f;                     
        this.columnas = c;                 
        this.matriz = new int[f][c];        
    }

    public void insertar(int f, int c, int dato) {  
        this.filas = f;
        this.columnas = c;
        this.matriz[f][c] = dato;        
    }


    public void eliminar(int f, int c) {
        this.filas = f;
        this.columnas = c;
        this.matriz[f][c] = 0;
    }

    public void buscardato(int dato) {  

        for (int f = 0; f < matriz.length; f++) {  
            for (int c = 0; c < matriz.length; c++) {  
                if (this.matriz[f][c] == dato) {      
                    System.out.println("El dato buscado se encuentra en la posicion: " + f
                            + "," + c);
                }
            }
        }
    }

    public void listar() {
        for (int x = 0; x < matriz.length; x++) {        
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print(matriz[x][y] + "\t");   
            }
            System.out.println(" ");
        }
    }

    public void transponer() {
        int[][] matrizT = new int[matriz[0].length][matriz.length];  
        System.out.println("la transpuesta es: ");
        for (int f = 0; f < matriz.length; f++) {                    
            for (int c = 0; c < matriz[f].length; c++) {             
                matrizT[c][f] = matriz[f][c];                        
                System.out.print(matriz[c][f] + "\t");              
            }
            System.out.println(" ");
        }
    }

    public void multiplicarmatriz(Matriz matriz2) {
        int filam1 = matriz.length;                  
        int columnam1 = matriz.length;
        int filam2 = matriz2.matriz.length;
        int columna2 = matriz2.matriz.length;

        if (columnam1 != filam2) {
            System.out.println("No se puede multiplicar");

        } else {
            int producto[][] = new int[filam1][columna2];
            for (int f=0; f < filam1; f++) {
                for (int c=0; c < columna2; c++){
                int suma = 0;
                for (int p = 0; p < columnam1; p++) {
                    suma += matriz[f][p]*matriz2.matriz[p][c];
                    producto[f][c] = suma;
                }
                System.out.print(producto[f][c] + "\t");
            }
            System.out.println(" ");  
            }}}}
