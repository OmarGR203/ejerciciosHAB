
package ejemplohilos;

import logica.MiHilo;

public class EjemploHilos {

    public static void main(String[] args) {
       
        MiHilo hilo1 = new MiHilo("Hilo 1");
        MiHilo hilo2 = new MiHilo("Hilo 2");
        MiHilo hilo3 = new MiHilo("Hilo 3");
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        
        
    }
    
}
