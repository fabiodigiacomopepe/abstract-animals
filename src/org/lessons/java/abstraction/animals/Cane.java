package org.lessons.java.abstraction.animals;

public class Cane extends Animale {
    // Passo il nome al super costruttore
    public Cane(String name) {
        super(name);
    }

    // Faccio l'override di verso/mangia della superclasse
    @Override
    public void verso() {
        System.out.println("Bauu");
    }

    @Override
    public void mangia() {
        System.out.println("Croccantini");
    }
}
