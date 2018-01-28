package com.sdabyd2.programowanie;

public class Pozycja {

    String nazwaTowaru;
    int ileSztuk;
    double cena;


    public Pozycja(String nazwaTowaru, int ileSztuk, double cena) {
        this.nazwaTowaru = nazwaTowaru;
        this.ileSztuk = ileSztuk;
        this.cena = cena;
    }

    public String getNazwaTowaru() {
        return nazwaTowaru;
    }

    public void setNazwaTowaru(String nazwaTowaru) {
        this.nazwaTowaru = nazwaTowaru;
    }

    public int getIleSztuk() {
        return ileSztuk;
    }

    public void setIleSztuk(int ileSztuk) {
        this.ileSztuk = ileSztuk;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public double obliczWartosc(){

        double wartoscZamowienia;
        wartoscZamowienia=ileSztuk*cena;

        return wartoscZamowienia;
    }

    @Override
    public String toString() {
        return  String.format("%-20s%-10s%-4s%-10s",nazwaTowaru, cena+" zł", ileSztuk+" szt.",obliczWartosc()+" zł");
    }
}
