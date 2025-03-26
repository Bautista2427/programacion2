package co.edu.uniquindio.biblioteca.model;

import java.time.LocalDate;

public class Prestamo {
    private Libro libro;
    private Usuario Usuario;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    
    public Prestamo() {
    }
    
    public Prestamo(Libro libro, Usuario Usuario, LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        this.libro = libro;
        this.Usuario = Usuario;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.libro.prestar();
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Usuario getUsuario() {
        return Usuario;
    }

    public void setUsuario(Usuario Usuario) {
        this.Usuario = Usuario;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public void devolverLibro() {
        libro.devolver();
    }

    @Override
    public String toString() {
        return "Prestamo [libro=" + libro + ", Usuario=" + Usuario + 
                ", fechaPrestamo=" + fechaPrestamo + 
                ", fechaDevolucion=" + fechaDevolucion + 
                "]";
    }
}