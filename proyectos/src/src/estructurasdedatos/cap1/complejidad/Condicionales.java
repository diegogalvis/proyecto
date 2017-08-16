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
public class Condicionales {
    
    public void tallercondicionales(){
    
    Scanner entrada = new Scanner (System.in);
    
    int imprime;

    
    System.out.println("MENU CONDIONALES \n");
    
    
    System.out.println("Digite 1 y enter para ==> Que imprima la suma de todos los números pares que van del 1 al 100 y diga cuántos hay.");
    System.out.println("Digite 2 y enter para ==> Que pida dos números y muestre todos los números que van desde el primero al segundo. Se debe controlar que los valores son correctos.");
    System.out.println("Digite 3 y enter para ==> Que muestre los números del 1 al 100 en una tabla de 10x10.");
    System.out.println("Digite 4 para salir.");
    
    imprime = entrada.nextInt();
        
        switch(imprime){
                       
        case 1:
                
            int a,sum,cont;
            sum=0;
            cont=0;
            for (a=1;a<=100;a++){
    	    if (a%2!=0){
            } else {
                sum=sum+a;
                cont=cont+1;
            }
                }
    System.out.println("la suma es");
    System.out.println(sum);
        	
    System.out.println("la cantidad de numeros es");
    System.out.println(cont);
                      
            break;
           
        case 2:
        
            int num1, num2,b;
           
    System.out.println("Introduzca primer número:");
    Scanner n1 = new Scanner(System.in);
                num1 = n1.nextInt();
    System.out.println("Introduzca segundo número:");
    Scanner n2 = new Scanner(System.in);
                num2 = n2.nextInt();
           
            if (num1>num2){
    System.out.println("Los valores introducidos no son correctos");
    }
            else
    {
	    for (b=num1;b<=num2;b++){
    System.out.println(b);
            }  }        
            break;
                
            
       case 3:
    
    
            int x,y,num=1;
            for (x=1;x<=10;x++)
        	{
            for (y=1;y<=10;y++)
            {
        	System.out.println(num);
        	num++;
    	}
    System.out.println("\n");
	}
    System.out.println("\n");

            break;   
                
                
}}}

    

