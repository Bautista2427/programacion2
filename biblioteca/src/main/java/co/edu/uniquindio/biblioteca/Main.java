package co.edu.uniquindio.biblioteca;

import co.edu.uniquindio.biblioteca.factory.ModelFactory;
import co.edu.uniquindio.biblioteca.util.Constantes;

public class Main {

    public static void main(String[] args) {
        ModelFactory modelFactory = ModelFactory.getInstance();
        buscarMiembroNombre(modelFactory);
        buscarPrestamoLibro(modelFactory);

    }

    private static void buscarMiembroNombre(ModelFactory modelFactory) {
        String nombre = "Valentina";
        String resultado = modelFactory.buscarMiembroNombre(nombre);
        validarResultado(
                resultado, 
                Constantes.MIEMBRO_EXISTENTE + resultado, 
                Constantes.MIEMBRO_NO_EXISTE);
    }

    private static void buscarPrestamoLibro(ModelFactory modelFactory) {
        String libro = "Si lo cress, Lo creas";
        String resultado = modelFactory.buscarPrestamoLibro(libro);
        validarResultado(
                resultado, 
                Constantes.LIBRO_NO_DISPONIBLE + resultado, 
                Constantes.LIBRO_DISPONIBLE);
    }

    private static void validarResultado(String resultado, 
                                        String mensajeExitoso, 
                                        String mensajeNoExitoso) {
        if (!resultado.equals("")) {
            System.out.println(mensajeExitoso);
        }
        else {
            System.out.println(mensajeNoExitoso);
        }
    }
}