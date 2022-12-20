package com.mycompany.appsbangundatar;

public class Segitiga extends BangunDatar{
    private double tinggi;
    private double alas;

    public Segitiga(double tinggi, double alas, String namaBangunDatar) {
        super(namaBangunDatar);
        this.tinggi = tinggi;
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }
    
    
    
    @Override
    double luas() {
        return 0.5 * tinggi * alas;
    }

    @Override
    double keliling() {
        return 3 * alas;
    }
    
}
