package Pekan5_2511533016;
import java.util.Scanner;

public class RumahSakit_2511533016 {
    Pasien_2511533016 head_3016;
    int counter_3016 = 0;

    // Insert (Daftar Pasien)
    public void daftarPasien_2511533016(String nama_3016, String penyakit_3016) {
        counter_3016++;
        Pasien_2511533016 baru_3016 = new Pasien_2511533016(nama_3016, penyakit_3016, counter_3016);

        if (head_3016 == null) {
            head_3016 = baru_3016;
        } else {
        	Pasien_2511533016 temp_3016 = head_3016;
            while (temp_3016.getNext_3016() != null) {
                temp_3016 = temp_3016.getNext_3016();
            }
            temp_3016.setNext_3016(baru_3016);
        }

        System.out.println("Pasien berhasil didaftarkan! Nomor Antrian: " + counter_3016);
    }

    // Delete Head (Panggil Pasien)
    public void panggilPasien_2511533016() {
        if (head_3016 == null) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Memanggil Pasien:");
            System.out.println("Nama: " + head_3016.getNama_3016());
            System.out.println("Keluhan: " + head_3016.getPenyakit_3016());
            head_3016 = head_3016.getNext_3016();
        }
    }

    // Display
    public void tampilkanAntrian_2511533016() {
        if (head_3016 == null) {
            System.out.println("Antrian kosong!");
        } else {
        	Pasien_2511533016 temp_3016 = head_3016;
            while (temp_3016 != null) {
                System.out.println("No: " + temp_3016.getNomor_3016() +
                        " | Nama: " + temp_3016.getNama_3016() +
                        " | Keluhan: " + temp_3016.getPenyakit_3016());
                temp_3016 = temp_3016.getNext_3016();
            }
        }
    }

    // Search
    public void cariPasien_2511533016(String nama) {
    	Pasien_2511533016 temp_3016 = head_3016;
        boolean ditemukan_3016 = false;

        while (temp_3016 != null) {
            if (temp_3016.getNama_3016().equalsIgnoreCase(nama)) {
                System.out.println("Pasien ditemukan!");
                System.out.println("No: " + temp_3016.getNomor_3016());
                System.out.println("Nama: " + temp_3016.getNama_3016());
                System.out.println("Keluhan: " + temp_3016.getPenyakit_3016());
                ditemukan_3016 = true;
                break;
            }
            temp_3016 = temp_3016.getNext_3016();
        }

        if (!ditemukan_3016) {
            System.out.println("Pasien tidak ditemukan.");
        }
    }

    // Status
    public void cekStatus_2511533016() {
        if (head_3016 == null) {
            System.out.println("Antrian kosong!");
        } else {
            int jumlah_3016 = 0;
            Pasien_2511533016 temp_3016 = head_3016;

            while (temp_3016 != null) {
                jumlah_3016++;
                temp_3016 = temp_3016.getNext_3016();
            }

            System.out.println("Jumlah Pasien: " + jumlah_3016);
            System.out.println("Pasien terdepan: " + head_3016.getNama_3016());
        }
    }

    // Main Menu
    public static void main(String[] args) {
        Scanner input_3016 = new Scanner(System.in);
        RumahSakit_2511533016 rs_3016 = new RumahSakit_2511533016();
        int pilihan_3016;

        do {
            System.out.println("\n=== Antrian Rumah Sakit NIM: 2511533016 ===");
            System.out.println("1. Daftarkan Pasien");
            System.out.println("2. Panggil Pasien");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Cari Pasien");
            System.out.println("5. Cek Status");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            pilihan_3016 = input_3016.nextInt();
            input_3016.nextLine();

            switch (pilihan_3016) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = input_3016.nextLine();
                    System.out.print("Keluhan: ");
                    String keluhan = input_3016.nextLine();
                    rs_3016.daftarPasien_2511533016(nama, keluhan);
                    break;

                case 2:
                	rs_3016.panggilPasien_2511533016();
                    break;

                case 3:
                	rs_3016.tampilkanAntrian_2511533016();
                    break;

                case 4:
                    System.out.print("Masukkan nama: ");
                    String cari = input_3016.nextLine();
                    rs_3016.cariPasien_2511533016(cari);
                    break;

                case 5:
                	rs_3016.cekStatus_2511533016();
                    break;

                case 6:
                    System.out.println("Keluar");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan_3016 != 6);

        input_3016.close();
    }
}