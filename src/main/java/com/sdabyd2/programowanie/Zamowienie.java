package com.sdabyd2.programowanie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Zamowienie {

    int ileDodanych;
    int maksRozmiar;
    List<Pozycja> pozycja = new ArrayList<>();

//    public List<Pozycja> getPozycja() {
//        return pozycja;
//    }
//
//    public void setPozycja(List<Pozycja> pozycja) {
//        this.pozycja = pozycja;
//    }

    public Zamowienie() {
        this.maksRozmiar = 10;

    }

    public Zamowienie(int ileDodanych) {
        this.ileDodanych = ileDodanych;
    }


    public void dodajPozycje(Pozycja p) {

        
        Pozycja poz = pozycja.stream().filter(o -> o.getNazwaTowaru().equals(p.nazwaTowaru)).collect(Collectors.toList());

        if(pozycja.contains(p.nazwaTowaru)){
            pozycja
        }else{
            pozycja.add(p);
        }
    }


    public double obliczWartoscCala() {


        double calkowitaWartoscZamowienia = 0;

        for (int i = 0; i < pozycja.size(); i++) {
            calkowitaWartoscZamowienia += pozycja.get(i).obliczWartosc();
        }
        return calkowitaWartoscZamowienia;
    }

    @Override
    public String toString() {
        return "Zamowienie :\n" + pozycja + "\n" + " Razem: " + obliczWartoscCala() + " zł";
    }


    public void usunPozycje(int indeks) {
        pozycja.remove(indeks);
    }



    void edytujPozycje(int indeks,double cena,int sztuk,String nazwa ) {

        pozycja.get(indeks).cena=cena;
        pozycja.get(indeks).ileSztuk=sztuk;
        pozycja.get(indeks).nazwaTowaru=nazwa;
    }


}
