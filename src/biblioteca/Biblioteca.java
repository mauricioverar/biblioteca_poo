/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;

/**
 *
 * @author mao
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // instanciar clase objeto Libro
        Libro libro = new Libro();

        // llamar metodos
        libro = libro.crearLibro();

        // mostrar resultado
        System.out.println(libro.toString());
    }
    
}
