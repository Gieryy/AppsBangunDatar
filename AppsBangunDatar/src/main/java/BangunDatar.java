abstract class BangunDatar {
    private String namaBangunDatar;
    abstract double luas();
    abstract double keliling();

    public BangunDatar(String namaBangunDatar) {
        this.namaBangunDatar = namaBangunDatar;
    }

    public String getNamaBangunDatar() {
        return namaBangunDatar;
    }

    public void setNamaBangunDatar(String namaBangunDatar) {
        this.namaBangunDatar = namaBangunDatar;
    }
    //Asli Bro
}
