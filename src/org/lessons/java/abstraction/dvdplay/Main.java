package org.lessons.java.abstraction.dvdplay;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inizializzo lo scanner da tastiera
        Scanner scan = new Scanner(System.in);

        int Tipo = 0;
        boolean exit = false;
        while (!exit) {
            // Chiedo tipo dispositivo a utente
            System.out.println("Seleziona il tipo di dispositivo:");
            System.out.println("1 - Lettore DVD");
            System.out.println("2 - Playstation");
            System.out.print("Seleziona un numero: ");
            String TipoString = scan.nextLine();
            // Provo a convertire il numero ricevuto dallo scanner in un intero
            try {
                Tipo = Integer.parseInt(TipoString);
                // Se riesco a convertire ed è compreso fra 1 e 2
                if (Tipo > 0 && Tipo < 3) {
                    exit = true;
                } // Altrimenti
                else {
                    System.out.println("Inserire un numero compreso fra 1 e 2.");
                    exit = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Inserire un numero.");
                exit = false;
            }
            System.out.println("---------------");
        }

        Dispositivo[] dispositivi = new Dispositivo[1];

        // Se tipo di dispositivo è uguale a 1, allora LETTORE DVD
        if (Tipo == 1) {
            // Creo oggetto "lettore_dvd" di tipo "LettoreDVD" passando come stringa "lettore dvd"
            LettoreDVD lettore_dvd = (LettoreDVD) Creator.create("lettore dvd");
            System.out.println("Dispositivo LETTORE DVD creato correttamente.");
            dispositivi[0] = lettore_dvd;
        }  // Se tipo di dispositivo è uguale a 2, allora PLAYSTATION
        else if (Tipo == 2) {
            // Creo oggetto "playstation" di tipo "Playstation" passando come stringa "playstation"
            Playstation playstation = (Playstation) Creator.create("playstation");
            System.out.println("Dispositivo PLAYSTATION creato correttamente.");
            dispositivi[0] = playstation;
        }

        int Scelta = 0;
        boolean exitScelta = false;
        while (!exitScelta) {
            // Chiedo all'utente cosa vuole fare
            System.out.println("Cosa vuoi fare?");
            System.out.println("1 - Play");
            System.out.println("2 - Stop");
            System.out.println("3 - Esci");
            System.out.print("Seleziona un numero: ");
            String SceltaString = scan.nextLine();
            // Provo a convertire il numero ricevuto dallo scanner in un intero
            try {
                Scelta = Integer.parseInt(SceltaString);
                // Se riesco a convertire ed è compreso fra 1 e 3
                if (Scelta > 0 && Scelta < 4) {
                    // LETTORE DVD - PLAY
                    if (Tipo == 1 && Scelta == 1) {
                        dispositivi[0].play();
                        System.out.println("---------------");
                    } // LETTORE DVD - STOP
                    else if (Tipo == 1 && Scelta == 2) {
                        dispositivi[0].stop();
                        System.out.println("---------------");
                    } // PLAYSTATION - PLAY
                    else if (Tipo == 2 && Scelta == 1) {
                        dispositivi[0].play();
                        System.out.println("---------------");
                    } // PLAYSTATION - STOP
                    else if (Tipo == 2 && Scelta == 2) {
                        dispositivi[0].stop();
                        System.out.println("---------------");
                    } // ESCI
                    else if (Scelta == 3) {
                        exitScelta = true;
                        System.out.println("Sei uscito correttamente.");
                    }
                } // Altrimenti
                else {
                    System.out.println("Inserire un numero compreso fra 1 e 3.");
                    exitScelta = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Inserire un numero.");
                exitScelta = false;
            }
        }

        // Chiudo lo scanner da tastiera
        scan.close();
    }
}
