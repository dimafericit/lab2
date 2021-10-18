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

