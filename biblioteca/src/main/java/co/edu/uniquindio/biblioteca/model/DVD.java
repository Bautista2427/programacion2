package co.edu.uniquindio.biblioteca.model;

public class DVD extends Item{
    private String genero;

    public DVD() {
    }

    public DVD(String titulo, EstadoItem estado, String genero) {
        super(titulo, estado);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
