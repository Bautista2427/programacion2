package co.edu.uniquindio.biblioteca.model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String idUsuario;

    private List<Prestamo> listaPrestamos = new ArrayList<>();

    public Usuario() {
    }

    public Usuario(String nombre, String idUsuario, List<Prestamo> listaPrestamos) {
        this.nombre = nombre;
        this.idUsuario = idUsuario;
        this.listaPrestamos = listaPrestamos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
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

    public void eliminarUsuario() {
        System.out.println("Usuario eliminado");
    }
    
    @Override
    public String toString() {
        return "Usuario [" +
                "nombre=" + nombre + '\'' +
                ", idUsuario=" + idUsuario + '\'' +
                ", listaPrestamos=" + listaPrestamos + '\'' +
                "]";
    }
}
