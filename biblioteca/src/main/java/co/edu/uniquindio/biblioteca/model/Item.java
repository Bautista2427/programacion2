package co.edu.uniquindio.biblioteca.model;

public abstract class Item {
    public String titulo;
    public EstadoItem estado;

    public Item() {
    }

    public Item(String titulo, EstadoItem estado) {
        this.titulo = titulo;
        this.estado = estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public EstadoItem getEstado() {
        return estado;
    }

    public void setEstado(EstadoItem estado) {
        this.estado = estado;
    }

    public void prestar() { estado = EstadoItem.PRESTADO; }
    public void devolver() { estado = EstadoItem.DISPONIBLE; }
}
