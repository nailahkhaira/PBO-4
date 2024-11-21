// Main class

import java.util.Scanner;

public class ProgramFaktur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {  //try pada try-catch
            // Input data dari pengguna
            System.out.print("Masukkan No Faktur: ");
            String noFaktur = scanner.nextLine();

            System.out.print("Masukkan Kode Barang: ");
            String kodeBarang = scanner.nextLine();

            System.out.print("Masukkan Nama Barang: ");
            String namaBarang = scanner.nextLine();

            System.out.print("Masukkan Harga Barang: ");
            double hargaBarang = scanner.nextDouble();

            System.out.print("Masukkan Jumlah Beli: ");
            int jumlahBeli = scanner.nextInt();

            // Validasi input
            if (hargaBarang < 0 || jumlahBeli < 0) {
                throw new IllegalArgumentException("Harga atau jumlah tidak boleh negatif.");
            }  //throw exception

            // Membuat objek Transaksi
            Transaksi transaksi = new Transaksi(noFaktur, kodeBarang, namaBarang, hargaBarang, jumlahBeli);

            // Menampilkan detail transaksi
            transaksi.tampilkanDetail();

        } catch (IllegalArgumentException e) { //try-catch
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Input tidak valid.");
        } finally {  //finally
            scanner.close();
        }
    }
}