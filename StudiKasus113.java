import java.util.Scanner;

public class StudiKasus113 {

    public static void main(String[] args) {
        // Membuat objek Scanner untuk input
        Scanner sc = new Scanner(System.in);

        // Deklarasi variabel
        int hargaPerCup = 18000, jumlahCup, uangBayar, totalHarga, diskon, totalBayar, kembalian, kurang;

        // Input
        System.out.print("Masukkan jumlah cup yang dibeli: ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan jumlah uang yang dibayarkan: ");
        uangBayar = sc.nextInt();

        // Perhitungan total harga
        totalHarga = hargaPerCup * jumlahCup;

        // Struktur if untuk menentukan diskon
        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        } else {
            diskon = 0;
        }

        // Perhitungan total bayar
        totalBayar = totalHarga - diskon;

        // Struktur if untuk menentukan kembalian atau uang kurang
        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            kurang = 0;
        } else {
            kembalian = 0;
            kurang = totalBayar - uangBayar;
        }

        // Output hasil
        System.out.println("Total Harga: " + totalHarga);
        System.out.println("Diskon: " + diskon);
        System.out.println("Total Bayar: " + totalBayar);
        System.out.println("Kembalian: " + kembalian);
        System.out.println("Uang tidak cukup, kurang Rp " + kurang);

        sc.close();
    }
}
