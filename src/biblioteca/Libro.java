/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

import java.util.Scanner;

/**
 *
 * @author Mauricio
 */
public class Libro {

  // declarar atts
  public int isbn;
  public String titulo;
  public String autor;
  public int numeroPaginas;

  // constructor
  public Libro(int isbn, String titulo, String autor, int numeroPaginas) {
    this.isbn = isbn;
    this.titulo = titulo;
    this.autor = autor;
    this.numeroPaginas = numeroPaginas;
  }

  // constructor vacio
  public Libro() {
  }

  // metodos
  public Libro crearLibro() {

    // instanciar Scanner para recibir datos dentro de un try
    // new Scanner(System.in).useDelimiter("\r\n") // para ingresar parrafo
    try (Scanner scan = new Scanner(System.in)) {
      // ingresar datos
      System.out.println("Ingrese isbn");
      isbn = scan.nextInt();
      //scan.nextLine();  // para evitar salto de linea
      System.out.println("Ingrese titulo");
      titulo = scan.next();
      System.out.println("Ingrese autor");
      autor = scan.next();
      System.out.println("Ingrese numeroPaginas");
      numeroPaginas = scan.nextInt();
    }

    // crear libro
    Libro libro = new Libro(isbn, titulo, autor, numeroPaginas);

    // retornar resultado
    return libro;
  }

  @Override
  public String toString() {
    return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", numeroPaginas=" + numeroPaginas + "]";
  }
}
