package logica;

import java.util.ArrayList;
import java.util.List;

public class Fabrica {

    private List<String> listaActividades;
    private int numActividad;
    private boolean isActive = true;

    public Fabrica() {
        listaActividades = new ArrayList<>();
        numActividad = 1;
    }

    public synchronized void recibirActividad() {
        String actividad = "Actividad " + numActividad;
        listaActividades.add(actividad);
        System.out.println("\n" + actividad + "ha sido recibida");
        numActividad++;
        notifyAll();
    }

    public synchronized String asignarActividad() {
        while (listaActividades.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return listaActividades.remove(0);
    }

    public synchronized boolean isActive() {
        return isActive;
    }

    public List<String> getListaActividades() {
        return listaActividades;
    }

    public void setListaActividades(List<String> listaActividades) {
        this.listaActividades = listaActividades;
    }

    public int getNumActividad() {
        return numActividad;
    }

    public void setNumActividad(int numActividad) {
        this.numActividad = numActividad;
    }
}
