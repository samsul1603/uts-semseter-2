public class UmurManusia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nama dan umur
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan umur: ");
        int umur = scanner.nextInt();

        // Tentukan kategori umur
        String kategori;
        if (umur < 5) {
            kategori = "balita";
        } else if (umur >= 5 && umur < 12) {
            kategori = "anak";
        } else if (umur >= 12 && umur < 18) {
            kategori = "remaja";
        } else if (umur >= 18 && umur < 40) {
            kategori = "dewasa";
        } else if (umur >= 40 && umur < 60) {
            kategori = "paruhbaya";
        } else {
            kategori = "lanjut usia";
        }

        // Tampilkan hasil
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Kategori: " + kategori);
    }
}
