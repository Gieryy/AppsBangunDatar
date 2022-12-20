public class Lingkaran extends BangunDatar {
    private double PHI = 3.14;
    private double r;
    
    @Override
    double luas() {
        return PHI * r * r;
    }

    @Override
    double keliling() {
        return PHI * (r + r);
    }
    
}
