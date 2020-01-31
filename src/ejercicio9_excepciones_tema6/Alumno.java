/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9_excepciones_tema6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Esta clase representa a un alumno.
 *
 * @author Bienvenida Ruiz Mazuela
 */
public class Alumno {

    public final static int num_asignaturas = 5;
    private String nombre;
    private ArrayList<Double> notas;

    /**
     * Constructor por defecto.
     */
    public Alumno() {
        nombre = "";
        notas = new ArrayList<>();
    }

    /**
     * Constructor por parámetros.
     *
     * @param nombre
     */
    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    /**
     * GETTER Método por el que se obtiene el nombre.
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * SETTER Método por el cual se modifica el nombre.
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que pide las notas del alumno y controla por medio de
     * RangoException que se introduzcan notas válidas.
     *
     * @throws RangoException
     */
    public void pedirNotas() throws RangoException {
        Scanner teclado1 = new Scanner(System.in);
        double nota;

        for (int i = 0; i < num_asignaturas; i++) {

            System.out.println("Dime la nota " + (i + 1) + ":");
            nota = teclado1.nextDouble();

            if (nota >= 0 && nota <= 10) {
                notas.add(nota);
            } else {
                throw new RangoException("Error. Nota no válida.");
            }
        }

    }

}
