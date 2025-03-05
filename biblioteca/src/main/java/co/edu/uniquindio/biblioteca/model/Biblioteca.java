package co.edu.uniquindio.biblioteca.model;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;

    private List<Miembro> listaMiembros = new ArrayList<>();
    private List<Libro> listaLibros = new ArrayList<>();
    private List<Prestamo> listaPrestamos = new ArrayList<>();
    

    public Biblioteca() {
    }

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Miembro> getListaMiembros() {
        return listaMiembros;
    }

    public void setListaMiembros(List<Miembro> listaMiembros) {
        this.listaMiembros = listaMiembros;
    }

    public List<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public List<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos(List<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }

    public String buscarPrestamo(Libro libro) {
        String resultado = "";
        for(Prestamo prestamo: getListaPrestamos()) {
            if (prestamo.getLibro().equals(libro)) {
                resultado = prestamo.toString();
                break;
            }
        }
        return resultado;
    }

    public String buscarMiembroNombre(String nombre) {
        String resultado = "";
        for (Miembro miembro: getListaMiembros()) {
            if(miembro.getNombre().equalsIgnoreCase(nombre)) {
                resultado = miembro.toString();
                break;
            }
        }
        return resultado;   
    }
}
