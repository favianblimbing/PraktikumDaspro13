import java.util.Scanner;

public class StudiKasus213 {

    public static void main(String[] args) {

        // Membuat objek Scanner untuk input
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        String nama, jenis, status;
        int dokumen, peringkat, pendanaan;

        // Input nama 
        System.out.print("Nama mahasiswa : ");
        nama = input.nextLine();

        // Input jenis kegiatan
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenis = input.nextLine().trim().toUpperCase(); // huruf besar/kecil tidak berpengaruh

    }
}
