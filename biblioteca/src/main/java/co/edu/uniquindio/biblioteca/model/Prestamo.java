package co.edu.uniquindio.biblioteca.model;

import java.time.LocalDate;

public class Prestamo {
    private Libro libro;
    private Miembro miembro;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    
    public Prestamo() {
    }
    
    public Prestamo(Libro libro, Miembro miembro, LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        this.libro = libro;
        this.miembro = miembro;
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

    public Miembro getMiembro() {
        return miembro;
    }

    public void setMiembro(Miembro miembro) {
        this.miembro = miembro;
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
        return "Prestamo [libro=" + libro + ", miembro=" + miembro + 
                ", fechaPrestamo=" + fechaPrestamo + 
                ", fechaDevolucion=" + fechaDevolucion + 
                "]";
    }
}