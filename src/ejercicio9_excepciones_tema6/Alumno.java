/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9_excepciones_tema6;

import java.util.ArrayList;

/**
 *
 * @author ITP1DAM
 */
public class Alumno {
    
    public final static int num_asignaturas=5;
    private String nombre;
    private ArrayList<Double> notas;
    
    
    public Alumno(){
        nombre="";
        notas = new ArrayList<>();
    }
    
    public Alumno(String nombre){
        this.nombre = nombre;
    }
    
}
