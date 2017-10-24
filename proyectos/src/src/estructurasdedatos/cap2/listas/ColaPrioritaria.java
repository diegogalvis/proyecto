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
            //si la cola A es menor que la cola B 
            if (colaA.tamaño() < colaB.tamaño()) {
                //hara cola en A
                this.colaA.encolar(cedula);
                // de lo contrario 
            } else {
                //hara cola en B
                this.colaB.encolar(cedula);
            }
        } else {
            //verificamos que la prioridad ingresada sea 1 (si es prioridad)
            if (prioridad ==1){
                //hara cola en la fila prioridad
            this.prioritaria.encolar(cedula);
             }
        }
    }

   
    public void listar() {
       //imprimimos en pantalla la cola A
        System.out.println("cola A:");
        //llamamos la funcion listar de la cola simple
        colaA.listarr();
        System.out.println("\n");
         //imprimimos en pantalla la cola A
        System.out.println("cola B");
         //llamamos la funcion listar de la cola simple
        colaB.listarr();
        System.out.println("\n");
         //imprimimos en pantalla la cola A
        System.out.println("cola prioritaria");
         //llamamos la funcion listar de la cola simple
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
