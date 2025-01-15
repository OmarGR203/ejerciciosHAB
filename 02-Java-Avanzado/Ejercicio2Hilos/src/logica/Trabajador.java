
package logica;


public class Trabajador extends Thread{
    
    private String nombre;
    private Fabrica fabrica;

    public Trabajador(String nombre, Fabrica fabrica) {
        this.nombre = nombre;
        this.fabrica = fabrica;
    }
    
    @Override
    public void run(){
        while(fabrica.isActive());{
        String actividad = fabrica.asignarActividad();
        
        System.out.println("\n" + nombre + "esta atendiendo " + actividad);
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(nombre + " ha resuelto " + actividad);
    }

    }
    
    
}
