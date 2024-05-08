public class Pajak {
    private String vendor;
    private String type;
    private double harga;
    private double ppn;

    public Pajak(String vendor, String type, double harga) {
        this.vendor = vendor;
        this.type = type;
        this.harga = harga;
        this.calculatePPN();
    }

    public void calculatePPN() {
        if (harga > 4000000) {
            ppn = 0.05;
        } else if (harga > 4200000 && harga <= 4500000) {
            ppn = 0.02;
        } else if (harga > 4000000) {
            ppn = 0.01;
        } else {
            ppn = 0.005;
        }
    }

    public double calculatePriceWithPPN() {
        return harga + (harga * ppn);
    }

    public String getVendor() {
        return vendor;