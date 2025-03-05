package co.edu.uniquindio.biblioteca.model;

public class Revista extends Item{
    private int numeroEdicion;

    public Revista() {
    }

    public Revista(String titulo, EstadoItem estado, int numeroEdicion) {
        super(titulo, estado);
        this.numeroEdicion = numeroEdicion;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }
}
