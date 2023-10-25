package org.lessons.java.abstraction.animals;

public class Main {
    // Creo metodi faiNuotare e faiVolare
    public static void faiNuotare(PossibilitaNuotare animale) {
        animale.nuota();
    }

    public static void faiVolare(PossibilitaVolare animale) {
        animale.vola();
    }

    public static void main(String[] args) {
        // Istanzio 4 nuovi animali (cane, passerotto, aquila, delfino)
        Animale cane = new Cane("Larry il cane");
        Animale passerotto = new Passerotto("Titty il passerotto");
        Animale aquila = new Aquila("Ryder l'aquila");
        Animale delfino = new Delfino("Sally il delfino");

        // Passo gli animali creati in un array
        Animale[] animali = {cane, passerotto, aquila, delfino};

        // Ciclo sull'array e stampo metodo (dormi/verso/mangia) per ogni animale
        for (Animale animale : animali) {
            System.out.println(animale.getName());
            animale.dormi();
            animale.verso();
            animale.mangia();
            // Richiamo metodi faiNuotare se l'animale è un'istanza di PossibilitaNuotare
            //                 faiVolare se l'animale è un'istanza di PossibilitaVolare
            // Faccio il casting per poter passare l'argomento correttamente
            if (animale instanceof PossibilitaNuotare) {
                faiNuotare((PossibilitaNuotare) animale);
            } else if (animale instanceof PossibilitaVolare) {
                faiVolare((PossibilitaVolare) animale);
            }
            System.out.println("-------");
        }
    }
}
