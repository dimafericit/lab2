package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Sports f1 = new Fussball();
        Sports b1 = new Basketball();
        Sports h1 = new Hindernislauf();
        Sports hs1 = new Hochsprung();
        Sports f2 = new Fussball();
        Sports b2 = new Basketball();
	    Benutzer obj = new Benutzer("Dima", "Burlac", Arrays.asList(f1, b1, h1, hs1));
        System.out.println(obj.kalkuliereZeit());

        System.out.println(obj);
    }
}

