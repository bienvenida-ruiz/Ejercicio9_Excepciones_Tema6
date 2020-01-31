package ejercicio9_excepciones_tema6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Esta clase representa a una excepción para el 
 * rango de las notas de la clase Alumno.
 * Esta clase extiende del objeto Exception.
 * 
 * @author Bienvenida Ruiz Mazuela
 */
public class RangoException extends Exception{
 
    public RangoException(String mensaje){
        super(mensaje);
    }
}
