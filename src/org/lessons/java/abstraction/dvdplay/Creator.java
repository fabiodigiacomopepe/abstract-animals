package org.lessons.java.abstraction.dvdplay;

public class Creator {
    public static Dispositivo create(int tipoDispositivo) {

        // Se numero in ingresso tipoDispositivo è uguale a 1
        // allora creo un nuovo dispositivo Lettore DVD
        if (tipoDispositivo == 1) {
            return new LettoreDVD();
        } // Se numero in ingresso tipoDispositivo è uguale a 2
        // allora creo un nuovo dispositivo playstation
        else if (tipoDispositivo == 2) {
            return new Playstation();
        } // ALTRIMENTI
        else {
            return null;
        }
    }
}