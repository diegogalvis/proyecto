package estructuraDeDatos.estructuraCola;

/*@author Diego Mauricio Galvis A*/

public class ColaPrioridad {
    private ColaSimple colaA;
    private ColaSimple colaB;
    private ColaSimple prioritaria;

   
    public void crearcolas() {
        this.colaA = new ColaSimple();
        this.colaB = new ColaSimple();
        this.prioritaria = new ColaSimple();
    }

 
    public void hacercola(int cedula, int prioridad) {
               if (prioridad == 0) {           
            if (colaA.tamaño() < colaB.tamaño()) {               
                this.colaA.encolar(cedula);               
            } else {               
                this.colaB.encolar(cedula);
            }
        } else {            
            if (prioridad ==1){              
            this.prioritaria.encolar(cedula);
             }
        }
    }

   
    public void listar() {    
        System.out.println("cola A:");        
        colaA.listarr();
        System.out.println("\n");         
        System.out.println("cola B");        
        colaB.listarr();
        System.out.println("\n");       
        System.out.println("cola prioritaria");         
        prioritaria.listarr();

    }

    public void atiende() {        
        for (int i = 0; i <= prioritaria.tamaño(); i++) {           
            prioritaria.dejacola();
        }
     
        if (prioritaria.tamaño() == 0) {           
            colaA.dejacola();
            colaB.dejacola();            
        }
    }
}
