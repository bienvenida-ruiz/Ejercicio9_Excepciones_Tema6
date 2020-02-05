/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9_excepciones_tema6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Bienvenida Ruiz Mazuela
 */
public class Ejercicio9_EXCEPCIONES_Tema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado1 = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        Scanner teclado3 = new Scanner(System.in);

        String nombre;
        double nota;
        //int opcion;
        
        ArrayList <Double> notas = new ArrayList<>();
        
        try{
        System.out.println("Dime el nombre del alumno: ");
        nombre = teclado1.nextLine();
        
        
        Alumno alumno1 = new Alumno(nombre, notas);
        
        alumno1.pedirNotas();
        alumno1.imprimirCalificaciones();
        
        
        }
        catch(RangoException ex1){
            System.out.println("RangoException." + ex1.getLocalizedMessage());
        }
        catch(ArrayIndexOutOfBoundsException ex2){
            System.out.println("ArrayIndexOutOfBoundsException. " + ex2.getLocalizedMessage());
        }
        
    }

}
