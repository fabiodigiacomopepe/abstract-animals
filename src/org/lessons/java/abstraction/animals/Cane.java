package org.lessons.java.abstraction.animals;

public class Cane extends Animale implements PossibilitaNuotare {
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

    // Faccio l'override di nuota dell'interfaccia PossibilitaNuotare
    @Override
    public void nuota() {
        System.out.println("Sto nuotando!!!");
    }
}
