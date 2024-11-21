// Child class
class Transaksi extends Barang { //inheritance
    private String noFaktur;
    private int jumlahBeli;

    // Constructor Transaksi
    public Transaksi(String noFaktur, String kodeBarang, String namaBarang, double hargaBarang, int jumlahBeli) {
        super(kodeBarang, namaBarang, hargaBarang); // Memanggil constructor dari parent class
        this.noFaktur = noFaktur;
        this.jumlahBeli = jumlahBeli;
    }

    // Method untuk menampilkan detail transaksi
    public void tampilkanDetail() {
        double total = hitungTotal(jumlahBeli); // Menggunakan metode dari parent class, inheritance juga
        System.out.println("\n--- Detail Transaksi ---");
        System.out.println("No Faktur    : " + noFaktur);
        System.out.println("Kode Barang  : " + kodeBarang);
        System.out.println("Nama Barang  : " + namaBarang);
        System.out.println("Harga Barang : Rp " + hargaBarang);
        System.out.println("Jumlah Beli  : " + jumlahBeli);
        System.out.println("Total Bayar  : Rp " + total);
    }
}
