package co.edu.uniquindio.biblioteca.model;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;

    private List<Usuario> listaUsuarios = new ArrayList<>();
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

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
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

    public String buscarUsuarioNombre(String nombre) {
        String resultado = "";
        for (Usuario Usuario: getListaUsuarios()) {
            if(Usuario.getNombre().equalsIgnoreCase(nombre)) {
                resultado = Usuario.toString();
                break;
            }
        }
        return resultado;   
    }
}
