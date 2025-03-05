package co.edu.uniquindio.biblioteca.model;

public class Bibliotecario extends Empleado implements IGestionInventario{
    
    public Bibliotecario() {
    }

    public Bibliotecario(String nombre, String idEmpleado) {
        super(nombre, idEmpleado);
    }

    public void gestionarPrestamos() {
        System.out.println("Gestionando prestamos");
    }

    @Override
    public void gestionarItem() {
        System.out.println("Gestionando ítem: " + item.getTitulo());
    }
}
