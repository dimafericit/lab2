package com.company;

import java.util.List;

public class Benutzer {
    private String vorname;
    private String nachname;
    private List<Sports> sports;

    //constructor
    public Benutzer(String vorname, String nachname, List<Sports> sports){
        this.vorname = vorname;
        this.nachname = nachname;
        this.sports = sports;
    }

    //setters
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setSports(List<Sports> sports) {
        this.sports = sports;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    //getters
    public List<Sports> getSports() {
        return sports;
    }

    public String getNachname() {
        return nachname;
    }

    public String getVorname() {
        return vorname;
    }

    //Benutzer class print method
    @Override
    public String toString() {
        return "Benutzer{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname  +
                '}';
    }

    //calculates time for every sport in the list
    public double kalkuliereZeit(){
        double zeit = 0;
        for (Sports sport : sports){
            zeit += sport.kalkuliereZeit();
        }
        return zeit;
    }

    //calculates time for a specific sport
    public double kalkuliereZeit(Sports sport){
        return sport.kalkuliereZeit();
    }

    //calculates the average time in the list
    public double kalkuliereDurchschnittzeit(){
        if (sports.isEmpty())
            return 0;
        double zeit = this.kalkuliereZeit();
        return zeit / sports.size();
    }
}

