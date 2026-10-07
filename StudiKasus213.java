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

        if (jenis.equals("BELMAWA") || jenis.equals("BAKORMA") || jenis.equals("MANDIRI")) {
            // Lomba: butuh jumlah dokumen dan peringkat juara
            System.out.print("Jumlah dokumen (0-4) : ");
            dokumen = input.nextInt();
            System.out.print("Peringkat juara (1/2/3, isi 0 jika bukan juara) : ");
            peringkat = input.nextInt();

            if (dokumen < 4) {
                status = "Dokumen tidak lengkap (kurang " + (4 - dokumen)
                        + " dokumen). Dana penghargaan tidak diberikan.";
            } else {
                if (peringkat >= 1 && peringkat <= 3) {
                    status = "Dokumen lengkap. Dana penghargaan diberikan.";
                } else {
                    status = "Dokumen lengkap, tetapi bukan juara 1, 2, atau 3. "
                            + "Dana penghargaan tidak diberikan.";
                }
            }

        } else if (jenis.equals("PKM")) {
            // PKM: butuh jumlah dokumen dan status pendanaan
            System.out.print("Jumlah dokumen (0-4) : ");
            dokumen = input.nextInt();
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
            pendanaan = input.nextInt();

            if (dokumen < 4) {
                status = "Dokumen tidak lengkap (kurang " + (4 - dokumen)
                        + " dokumen). Dana penghargaan tidak diberikan.";
            } else {
                if (pendanaan == 1) {
                    status = "Dokumen lengkap. Dana penghargaan diberikan.";
                } else {
                    status = "Dokumen lengkap, tetapi tidak lolos pendanaan PKM. "
                            + "Dana penghargaan tidak diberikan.";
                }
            }

        } else if (jenis.equals("LAINNYA")) {
            // Lainnya: tidak perlu data tambahan
            status = "Kegiatan Lainnya tidak memperoleh dana penghargaan.";

        } else {
            status = "Jenis kegiatan tidak valid.";
        }

        System.out.println("Status : " + status);
        input.close();

    }
}
