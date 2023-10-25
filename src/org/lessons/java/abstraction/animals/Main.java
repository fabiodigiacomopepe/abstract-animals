package org.lessons.java.abstraction.animals;

public class Main {
    public static void main(String[] args) {
        // Istanzio 4 nuovi animali (cane, passerotto, aquila, delfino)
        Animale cane = new Cane("Larry il cane");
        Animale passerotto = new Passerotto("Titty il passerotto");
        Animale aquila = new Aquila("Ryder l'aquila");
        Animale delfino = new Delfino("Sally il delfino");

        // Passo gli animali creati in un array
        Animale[] animali = {cane, passerotto, aquila, delfino};

        // Ciclo sull'array e stampo metodo (dormi/verso/mangia( per ogni animale
        for (Animale animale : animali) {
            System.out.println(animale.getName());
            animale.dormi();
            animale.verso();
            animale.mangia();
            System.out.println("-------");
        }
    }
}
