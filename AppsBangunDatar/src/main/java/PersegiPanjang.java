public class PersegiPanjang extends BangunDatar {
    private double panjang,lebar;

    public PersegiPanjang(double panjang, double lebar, String namaBangunDatar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    
    @Override
    double luas() {
        return panjang * lebar;
    }

    @Override
    double keliling() {
        return (2 * panjang) + (2 * lebar);
    }
    
    
}
