package Pekan6_2511533016;
import java.util.Scanner;

public class Musik_2511533016 {
    private Lagu_2511533016 head_3016;
    private Lagu_2511533016 tail_3016;

    // 1. Tambah Lagu di Akhir
    public void tambahLagu_3016(String judul_3011, String penyanyi_3011) {
        Lagu_2511533016 baru_3016 = new Lagu_2511533016(judul_3011, penyanyi_3011);
        if (head_3016 == null) {
            head_3016 = tail_3016 = baru_3016;
        } else {
            tail_3016.next_3016 = baru_3016;
            baru_3016.prev_3016 = tail_3016;
            tail_3016 = baru_3016;
        }
        System.out.println("Lagu berhasil ditambahkan!");
    }

    // 2. Hapus Lagu Awal
    public void hapusLaguAwal_3016() {
        if (head_3016 == null) {
            System.out.println("Playlist kosong!");
        } else {
            head_3016 = head_3016.next_3016;
            if (head_3016 != null) head_3016.prev_3016 = null;
            else tail_3016 = null;
            System.out.println("Lagu pertama berhasil dihapus.");
        }
    }

    // 3. Tampil Maju
    public void tampilMaju_3016() {
        if (head_3016 == null) System.out.println("Playlist kosong.");
        Lagu_2511533016 curr = head_3016;
        while (curr != null) {
            System.out.println(curr.judul_3016 + " - " + curr.penyanyi_3016);
            curr = curr.next_3016;
        }
    }

    // 4. Tampil Mundur
    public void tampilMundur_3016() {
        if (tail_3016 == null) System.out.println("Playlist kosong.");
        Lagu_2511533016 curr = tail_3016;
        while (curr != null) {
            System.out.println(curr.judul_3016 + " - " + curr.penyanyi_3016);
            curr = curr.prev_3016;
        }
    }

    // 5. Cari Lagu
    public void cariLagu_3016(String judul_3011) {
        Lagu_2511533016 curr = head_3016;
        boolean found = false;
        while (curr != null) {
            if (curr.judul_3016.equalsIgnoreCase(judul_3011)) {
                System.out.println("Lagu ditemukan: " + curr.judul_3016 + " oleh " + curr.penyanyi_3016);
                found = true;
            }
            curr = curr.next_3016;
        }
        if (!found) System.out.println("Lagu tidak ditemukan.");
    }

    public static void main(String[] args) {
        Musik_2511533016 playlist = new Musik_2511533016();
        Scanner sc = new Scanner(System.in);
        int pilihan = 0;

        while (pilihan != 6) {
            System.out.println("\n=== Playlist Musik NIM: 2511533016 ===");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Hapus Lagu Pertama");
            System.out.println("3. Lihat Playlist (Maju)");
            System.out.println("4. Lihat Playlist (Mundur)");
            System.out.println("5. Cari Lagu");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Judul: ");
                    String j = sc.nextLine();
                    System.out.print("Penyanyi: ");
                    String p = sc.nextLine();
                    playlist.tambahLagu_3016(j, p);
                    break;
                case 2:
                    playlist.hapusLaguAwal_3016();
                    break;
                case 3:
                    playlist.tampilMaju_3016();
                    break;
                case 4:
                    playlist.tampilMundur_3016();
                    break;
                case 5:
                    System.out.print("Masukkan judul lagu: ");
                    String cari = sc.nextLine();
                    playlist.cariLagu_3016(cari);
                    break;
                case 6:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
        sc.close();
    }
}