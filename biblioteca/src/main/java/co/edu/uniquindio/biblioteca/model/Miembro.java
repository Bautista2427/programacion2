package co.edu.uniquindio.biblioteca.model;

import java.util.ArrayList;
import java.util.List;

public class Miembro {
    private String nombre;
    private String idMiembro;

    private List<Prestamo> listaPrestamos = new ArrayList<>();

    public Miembro() {
    }

    public Miembro(String nombre, String idMiembro, List<Prestamo> listaPrestamos) {
        this.nombre = nombre;
        this.idMiembro = idMiembro;
        this.listaPrestamos = listaPrestamos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdMiembro() {
        return idMiembro;
    }

    public void setIdMiembro(String idMiembro) {
        this.idMiembro = idMiembro;
    }

    public List<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos(List<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }

    public void actualizarNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public void eliminarMiembro() {
        System.out.println("Miembro eliminado");
    }
    
    @Override
    public String toString() {
        return "Miembro [" +
                "nombre=" + nombre + '\'' +
                ", idMiembro=" + idMiembro + '\'' +
                ", listaPrestamos=" + listaPrestamos + '\'' +
                "]";
    }
}
