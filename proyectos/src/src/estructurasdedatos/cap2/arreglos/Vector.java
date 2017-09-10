/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuraDeDatos.estructuraVector;

/*@author Diego Mauricio Galvis Arboleda.*/

public class Vector {
private int tamaño;
private String[]vector;

public void crearVector(int d){
this.tamaño=d;
this.vector=new String[this.tamaño];
}

public void settamaño(int s){
this.tamaño=s;
}
public int gettamaño(){
return tamaño;
}
public boolean eliminar(int m){
this.vector=null;
return true;
}
public void insertar(String n, int pos){
this.vector[pos]=d;
}

public String[] listar(){
for (int l=0;l<=tamaño; l++){
System.out.println(vector[l]);
}


public void ordenarVec(int vector[]){
for(int i = 0; i < vector.length - 1; i++)
        {
            for(int j = 0; j < vector.length - 1; j++)
            {
                if (vector[j] < vector[j + 1])
                {
                    int tmp = vector[j+1];
                    vector[j+1] = vector[j];
                    vector[j] = tmp;
                }
            }
        }
    
}

public void buscarBinario(int pos){
int posini=0;
int posfin=vector.length-1;
while(posin0 i<=posfin)
poscentral = (posfin+posini)/2;
if (vector[poscentral]==pos){
System.out.println("el dato esta en:"+posini+"y"+posfin);
}
else {if(pos<=vector[poscentral]){
posfin=poscentral;
}
}
}
}
public void actualizar(int pos, int d){
if ((pos<tamaño)&&(pos>0)){
this.vector[pos]=d;
}
else{
System.out.println("tamaño del vector incorrecto");
}
}
public void borrar(int pos){
if ((pos<tamaño)&&(pos<0))
    this.vector[pos]=null;
}
else {
System.out.println("tamaño incorrecto");
}
}
