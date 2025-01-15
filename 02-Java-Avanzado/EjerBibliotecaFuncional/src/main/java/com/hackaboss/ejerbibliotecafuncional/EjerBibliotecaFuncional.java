
package com.hackaboss.ejerbibliotecafuncional;

import logica.NotificarLibro;


public class EjerBibliotecaFuncional {

    public static void main(String[] args) {
       
        new NotificarLibro(){
            @Override
            public void enviarNotificacion(String msje) {
                System.out.println("Ya se encuentra disponible el libreo " + msje );
            }
            
        }.enviarNotificacion("Clase anonima");
    
    NotificarLibro notLibro = (mensaje) ->{System.out.println("Ya se encuentra disponible el libro "+ mensaje);};
    notLibro.enviarNotificacion("Lamda");
        
    }
    
}
