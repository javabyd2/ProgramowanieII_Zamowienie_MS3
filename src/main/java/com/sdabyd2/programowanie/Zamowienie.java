package com.sdabyd2.programowanie;

import java.util.Arrays;

public class Zamowienie {

    int ileDodanych;
    int maksRozmiar;
    Pozycja[]pozycje=new Pozycja[3];

    public Zamowienie() {
        this.maksRozmiar=10;

    }

    public Zamowienie(int ileDodanych) {
        this.ileDodanych=ileDodanych;
    }

    public void dodajPozycje(Pozycja p) {

        for (int i = 0; i < ileDodanych; i++) {
            if (pozycje[i] == null) {
                this.pozycje[i] = p;
            }
        }
    }

    public double obliczWartoscCala(){

        double calkowitaWartoscZamowienia=0;

        for(int i=0;i<pozycje.length;i++){
            calkowitaWartoscZamowienia=this.pozycje[i].obliczWartosc();
        }
        return calkowitaWartoscZamowienia;
    }

    @Override
    public String toString() {
        return  "Zamowienie :\n"+Arrays.asList(pozycje)+"\n"+" Razem: " + obliczWartoscCala();
    }
}
