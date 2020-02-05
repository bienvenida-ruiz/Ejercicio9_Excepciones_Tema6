/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9_excepciones_tema6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 Alumno: Bienvenida Ruiz Mazuela
 C.F.G.S. Desarrollo de Aplicaciones Multiplataforma
 Módulo Profesional: Programación
 Curso escolar: 2019/2020
 Profesor: Francisco Jesús Delgado Almirón
 Instituto Tecnológico Poniente
 * 
 */
public class Ejercicio9_EXCEPCIONES_Tema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado1 = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        Scanner teclado3 = new Scanner(System.in);
        Scanner teclado4 = new Scanner(System.in);
        Scanner teclado5 = new Scanner(System.in);

        String nombre;
        double nuevanota;
        int opcion, modificar;

        ArrayList<Double> notas = new ArrayList<>();

        try {
            System.out.println("Dime el nombre del alumno: ");
            nombre = teclado1.nextLine();

            Alumno alumno1 = new Alumno(nombre, notas);

            do {
                System.out.println("");
                System.out.println("--- INSTITUTO TECNOLÓGICO PONIENTE ---");
                System.out.println("");
                System.out.println("1. Añadir calificaciones del alumno.");
                System.out.println("2. Modificar calificaciones del alumno.");
                System.out.println("3. Mostrar calificaciones del alumno.");
                System.out.println("0. SALIR.");
                opcion = teclado3.nextInt();

                if (opcion == 1) {
                    alumno1.pedirNotas();
                }
                if (opcion == 2) {

                    System.out.println("Nota que se desea modificar: ");
                    modificar = teclado5.nextInt();
                    System.out.println("Nueva calificación :");
                    nuevanota = teclado4.nextDouble();
                    alumno1.modificarNota(modificar, nuevanota);

                }
                if (opcion == 3) {
                    alumno1.imprimirCalificaciones();
                }

            } while (opcion != 0);

        } catch (RangoException ex1) {
            System.out.println("RangoException." + ex1.getLocalizedMessage());
        } catch (ArrayIndexOutOfBoundsException ex2) {
            System.out.println("ArrayIndexOutOfBoundsException. " + ex2.getLocalizedMessage());
        }

    }

}
