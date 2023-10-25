package org.lessons.java.abstraction.animals;

public abstract class Animale {
    // ATTRIBUTI
    private String name;

    // COSTRUTTORE
    public Animale(String name) {
        this.name = name;
    }

    // GETTER E SETTER
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // METODI
    public void dormi() {
        System.out.println("Zzz");
    }

    // METODI ASTRATTI
    public abstract void verso();

    public abstract void mangia();
}
