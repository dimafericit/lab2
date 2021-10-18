package com.company;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class BenutzerTest {
    private Benutzer benutzer1;
    private Benutzer benutzer2;
    private Benutzer benutzer3;

    void creating() {
        Sports f1 = new Fussball();
        Sports b1 = new Basketball();
        Sports h1 = new Hindernislauf();
        Sports hs1 = new Hochsprung();
        Sports f2 = new Fussball();
        Sports b2 = new Basketball();
        benutzer1 = new Benutzer("Dima", "Burlac", Arrays.asList(f1, b1, h1));
        benutzer2 = new Benutzer("prenume", "nume", Arrays.asList());
        benutzer3 = new Benutzer("prenume", "nume", Arrays.asList(f1, b1, h1, hs1, f2, b2));
    }

    /*
    Fussball: 65
    Basketball: 55
    Hindernislauf: 30
    Hochsprung: 20
     */

    @Test
    public void kalkuliereZeit() {
        creating();
        //benutzer1: 65 + 55 + 30 = 150
        assertEquals(benutzer1.kalkuliereZeit(),150);

        //benutzer2: 0
        assertEquals(benutzer2.kalkuliereZeit(),0);

        //benutzer3: 65 + 55 + 30 + 20 + 65 + 55 = 290
        assertEquals(benutzer3.kalkuliereZeit(),290);
    }

    @Test
    public void kaluliereZeit() {
        creating();
        Sports f1 = new Fussball();
        Sports b1 = new Basketball();
        Sports h1 = new Hindernislauf();
        Sports hs1 = new Hochsprung();

        assertEquals(benutzer1.kalkuliereZeit(b1),55);
        assertEquals(benutzer1.kalkuliereZeit(f1),65);
        assertEquals(benutzer1.kalkuliereZeit(h1),30);
        assertEquals(benutzer1.kalkuliereZeit(hs1),20);
    }

    @Test
    public void kaluliereDurchsnittzeit() {
        creating();
        //benutzer1: 65 + 55 + 30 = 150/3 = 50
        assertEquals(benutzer1.kalkuliereDurchschnittzeit(),50);

        //benutzer2: 0
        assertEquals(benutzer2.kalkuliereDurchschnittzeit(),0);

        //benutzer3: 65 + 55 + 30 + 20 + 65 + 55 = 290/6 = 48,3
        assertEquals(benutzer3.kalkuliereDurchschnittzeit(),48.333333333333336);
    }

}