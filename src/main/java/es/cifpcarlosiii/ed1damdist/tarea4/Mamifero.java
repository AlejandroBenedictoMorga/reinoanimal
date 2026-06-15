package es.cifpcarlosiii.ed1damdist.tarea4;

/**
 * Clase que representa a un animal mamífero, que hereda de la clase Animal.
 * @author Alejandro Benedicto Morga
 * @version 1.0
 */

public class Mamifero extends Animal {

    @Override
    void reproducir() {
        System.out.println("La reproduccion es vivipara");
    }

    @Override
    void relacionar(Animal m) {
        System.out.println("Con el mamifero: " + m.ToString());
    }

    public Mamifero(String nombre) {
        super(nombre);
    }
}
