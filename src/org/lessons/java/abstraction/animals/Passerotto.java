package org.lessons.java.abstraction.animals;

public class Passerotto extends Animale {
    // Passo il nome al super costruttore
    public Passerotto(String name) {
        super(name);
    }

    // Faccio l'override di verso/mangia della superclasse
    @Override
    public void verso() {
        System.out.println("Cip");
    }

    @Override
    public void mangia() {
        System.out.println("Vermetto");
    }
}
