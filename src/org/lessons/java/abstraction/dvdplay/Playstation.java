package org.lessons.java.abstraction.dvdplay;

public class Playstation implements Dispositivo {
    @Override
    public void play() {
        System.out.println("Sono una PlayStation e sono in modalità play");
    }

    @Override
    public void stop() {
        System.out.println("Sono una PlayStation e sono in modalità stop");
    }
}
