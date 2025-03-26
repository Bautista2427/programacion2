package co.edu.uniquindio.biblioteca;

import co.edu.uniquindio.biblioteca.factory.ModelFactory;
import co.edu.uniquindio.biblioteca.model.Usuario;
import co.edu.uniquindio.biblioteca.util.Constantes;

public class Main {

    public static void main(String[] args) {
        ModelFactory modelFactory = ModelFactory.getInstance();
        buscarUsuarioNombre(modelFactory);
        //buscarPrestamoLibro(modelFactory);
        crearUsuario(modelFactory);

    }

    private static void crearUsuario(ModelFactory modelFactory) {
        Usuario usuario = new Usuario(
            "Pepito", 
            "79520318"
        );
        modelFactory.crearUsuario(usuario);
    }

    private static void buscarUsuarioNombre(ModelFactory modelFactory) {
        String nombre = "Valentina";
        String resultado = modelFactory.buscarUsuarioNombre(nombre);
        validarResultado(
                resultado, 
                Constantes.Usuario_EXISTENTE + resultado, 
                Constantes.Usuario_NO_EXISTE);
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