package org.lessons.java.abstraction.dvdplay;

public class Creator {
    public static Dispositivo create(String tipoDispositivo) {

        // Se stringa in ingresso tipoDispositivo è uguale a lettore dvd
        // allora creo un nuovo dispositivo Lettore DVD
        if (tipoDispositivo.equals("lettore dvd")) {
            return new LettoreDVD();
        } // Se stringa in ingresso tipoDispositivo è uguale a playstation
        // allora creo un nuovo dispositivo playstation
        else if (tipoDispositivo.equals("playstation")) {
            return new Playstation();
        } // ALTRIMENTI
        else {
            return null;
        }
    }
}