package org.lessons.java.abstraction.animals;

public class Aquila extends Animale implements PossibilitaVolare {
    // Passo il nome al super costruttore
    public Aquila(String name) {
        super(name);
    }

    // Faccio l'override di verso/mangia della superclasse
    @Override
    public void verso() {
        System.out.println("Ahhg!");
    }

    @Override
    public void mangia() {
        System.out.println("Marmotta");
    }

    // Faccio l'override di vola dell'interfaccia PossibilitaVolare
    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }
}
