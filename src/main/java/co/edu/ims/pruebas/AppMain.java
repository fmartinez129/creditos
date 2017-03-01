/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ims.pruebas;

import co.edu.ims.modelo.Genero;
import co.edu.ims.modelo.Pelicula;
import com.google.gson.Gson;

/**
 *
 * @author 1061775580
 */
public class AppMain {
    public static void main(String[] args){
        Pelicula terminator = new Pelicula("Terminator", 1985);
        Pelicula insideOut = new Pelicula("Inside Out", 2015);
        Pelicula titanic = new Pelicula();
        
        titanic.setAnio(1996);
        titanic.setTitulo("Titanic");
        
        Genero accion = new Genero("Accion");
        Genero comedia = new Genero("Comedia");
        Genero animada = new Genero("Animada");
        Genero siFi = new Genero("Ciencia Ficcion");
       
        terminator.getGeneros().add(siFi);
        terminator.getGeneros().add(accion);
        //
        insideOut.getGeneros().add(siFi);
        titanic.getGeneros().add(accion);
        
        Gson gson = new Gson();
        String json = gson.toJson(terminator);
        
        System.out.println(json);
    }
}
