/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap1.complejidad;

import java.util.Scanner;

/**
 *
 * @author tusk
 */
public class Ciclos {
    
    public void tallerciclos(){
    
    Scanner entrada = new Scanner (System.in);
    
    int imprime;

    
    System.out.println("\n => MENU CICLOS <= \n");
    
    System.out.println("Digite 1 y enter para ==> Que muestre los números del 1 al 100.");
    System.out.println("Digite 2 y enter para ==> Que muestre los números del 100 al 1.");
    System.out.println("Digite 3 y enter para ==> Que muestre los números pares que haya del 1 al 100.");
    System.out.println("Digite 4 y enter para ==> Que muestre los números impares que haya del 1 al 100.");
    
    imprime = entrada.nextInt();
        
        switch(imprime){
                       
            case 1:
                
                int a;
                for(a=1;a<=100;a++){
                System.out.println(a);
             
                }
                 break;
                 
                
            case 2:
                
                int b;
                for(b=100;b>=1;b--){
                System.out.println(b);
                }
                break;
                
            case 3:
                
                int c;
                for(c=1;c<=100;c++){
                if (c%2==0)
                System.out.println(c);
                }
                break;
                
            case 4:
                int d;           
        	for (d=1;d<=100;d++){
                if (d%2!=0)
                System.out.println(d);
                }
                break;
                
}}}
