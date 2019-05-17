package exa.unicen.trabajo_practico_5;

public class Proceso {
    private String nombre;
    private int duracion;
    private int memoria;

    public Proceso(String nombre, int duracion, int memoria) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.memoria = memoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
}
