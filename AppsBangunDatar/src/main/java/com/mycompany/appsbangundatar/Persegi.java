package com.mycompany.appsbangundatar;

public class Persegi extends BangunDatar{
    private double sisi;

    public Persegi(double sisi, String namaBangunDatar) {
        super(namaBangunDatar);
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
   
    @Override
    double luas() {
        return sisi*sisi;
    }

    @Override
    double keliling() {
        return 4*sisi;
    }
    
}
