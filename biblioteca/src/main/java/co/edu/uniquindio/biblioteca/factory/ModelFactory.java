package co.edu.uniquindio.biblioteca.factory;

import co.edu.uniquindio.biblioteca.model.Biblioteca;
//import co.edu.uniquindio.biblioteca.model.Bibliotecario;
import co.edu.uniquindio.biblioteca.model.Libro;
//import co.edu.uniquindio.biblioteca.model.Revista;
//import co.edu.uniquindio.biblioteca.model.DVD;
//import co.edu.uniquindio.biblioteca.model.Usuario;
//import co.edu.uniquindio.biblioteca.model.Prestamo;
import co.edu.uniquindio.biblioteca.services.IModelFactoryServices;

public class ModelFactory implements IModelFactoryServices {

    private static ModelFactory modelFactory;
    private Biblioteca biblioteca;

    private ModelFactory(){
        
    }

    public static ModelFactory getInstance() {
        if(modelFactory == null) {
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }

    //private void inicializarDatos() {
        //aBiblioteca biblioteca = new Biblioteca("Biblioteca Central");
        //Bibliotecario bibliotecario = new Bibliotecario("Carlos", "B001");
        //Libro libro = new Libro("Java Programming", "Autor X", "123456789");
        //Revista revista = new Revista("Ciencia Hoy", 42);
        //DVD dvd = new DVD("Inception", "Ciencia Ficción");
    //}

    @Override
    public String buscarUsuarioNombre(String nombre) {
        return biblioteca.buscarUsuarioNombre(nombre);
    }
    
}
