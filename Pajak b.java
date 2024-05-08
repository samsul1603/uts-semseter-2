import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama vendor: ");
        String vendor = scanner.nextLine();

        System.out.print("Masukkan tipe smartphone: ");
        String type = scanner.nextLine();

        System.out.print("Masukkan harga smartphone: ");
        double harga = scanner.nextDouble();

        Pajak pajak = new Pajak(vendor, type, harga);
        double hargaSetelahPPN = pajak.getHarga() + (pajak.getHarga() * pajak.getPPN());

        System.out.printf("Harga setelah ditambah PPN: Rp %.2f%n", hargaSetelahPPN);
    }
}