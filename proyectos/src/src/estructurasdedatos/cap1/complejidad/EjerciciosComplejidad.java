/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap1.complejidad;
 
import java.awt.Color;
import java.util.Scanner;
import javax.swing.JLabel;
import javax.swing.*;

/**
 *
 * @author tusk
 */
public class EjerciciosComplejidad {
    
    public  void tallerejercicioscomplejidad() {
        
    
    Scanner entrada = new Scanner(System.in);
    int n;
    
    
    JOptionPane.showMessageDialog(null,"         COMPLEJIDAD POR:\n      Diego Mauricio Galvis A.\nAceptar para mostrar el menu \n");
    System.out.println("Menu que muestra un ejemplo de dicha complejidad\n");
   
    
    System.out.println(" Digite 1 y enter para => Complejidad  O(1)       ");
    System.out.println(" Digite 2 y enter para => Complejidad  O(n)       ");
    System.out.println(" Digite 3 y enter para => Complejidad  O(n^2)     ");
    System.out.println(" Digite 4 y enter para => Complejidad  O(Log2 n ) ");
    System.out.println(" Digite 5 y enter para => Complejidad  O(nLog2 n) \n\n"); 
    
    
    n = entrada.nextInt();
     
      switch(n){
          
          //Complejidad O(1)
            case 1:
                System.out.println("Escribe un numero y sabras si es par o no");
                Scanner scanner = new Scanner (System.in);       
                int x = scanner.nextInt();                            
                
                if(x%2==0){                  
                    System.out.println("El numero es PAR");
                }
                else{
                    System.out.println("El numero es IMPAR");
                }    
                break;
             
                  
                  
              //Complejidad O(n)   
                  
             case 2:    
                System.out.println("Escribe un numero y sabras si es primo o no");
                Scanner b = new Scanner (System.in);
                int num = b.nextInt();
                int num2 = num-1 ;
                while((num%num2) != 0){ 
                num2--;
                }
                if(num2 ==1 ){ 
                System.out.println("SI es Primo");
                }
                else{
                System.out.println("No es Primo");
                } 
               
                
                break;
                
                
             //Complejidad O(n^2) 
             case 3:  
             int mult;
             
             for(int i=1;i<=10;i++){
                       System.out.println("\n");
                for(int j=1;j<=10;j++){
                 mult=i*j;  
                 System.out.println(i+"*"+j+"="+mult);
           
                  
             } 
             }
            break; 
                  
            //Complejidad O(Log2 n ) 
             case 4:
                 
                int arre[]={1,2,3,4,5,6,7,8,9,10};
                int variable = 8;
                int posini = 0;
                int posfin = arre.length-1;
                int poscen;
                
                while(posini <= posfin){
                    poscen =(posfin+posini)/2;
                    if(arre[poscen] == variable){
                        System.out.println("Dato encontrado entre las posiciones "+posini+" y "+posfin);
                        break;
                    }
                    
                    else if(variable<arre[poscen]){
                        posfin = poscen-1;
                        
                    }
                    else{
                        posini = poscen + 1;
                    } 
                }
                
                break; 
      
            //Complejidad O(nLog2 n)        
      case 5:
      int p,m,nume=1;
            for (p=1;p<=10;p++)
        	{
            for (m=1;m<=10;m++)
            {
        	System.out.println(nume);
        	nume++;
    	}
    System.out.println("\n");
	}
    System.out.println("\n");

            break;   

    }}        }

   

    
            

   
             
                
                 
             
                 
                 
                 
                 
                 
                 
                 
                 
                 
               

   