package org.lessons.java.abstraction.animals;

public class Delfino extends Animale {
    // Passo il nome al super costruttore
    public Delfino(String name) {
        super(name);
    }

    // Faccio l'override di verso/mangia della superclasse
    @Override
    public void verso() {
        System.out.println("Iiii");
    }

    @Override
    public void mangia() {
        System.out.println("Crostaceo");
    }
}
