package Pekan4_2511533016;

import java.util.Scanner;

public class AntrianLoketDriver_2511533016 {

	public static void main(String[] args) {
        Scanner sc_3016 = new Scanner(System.in);
        AntrianLoket_2511533016 queue_3016 = new AntrianLoket_2511533016(20);
        
        int pilihan_3016;
        
        do {
            System.out.println("\n=== PROGRAM ANTRIAN LOKET ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Hapus Antrian");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Reverse");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan_3016 = sc_3016.nextInt();
            sc_3016.nextLine(); // membersihkan buffer
            
            switch (pilihan_3016) {
                case 1:
                    if (queue_3016.isFull_3016(queue_3016)) {
                        System.out.println("Antrian sudah penuh!");
                    } else {
                        System.out.print("Masukkan nama pelanggan : ");
                        String nama_3016 = sc_3016.nextLine();
                        queue_3016.enqueue_3016(nama_3016);
                    }
                    break;
                    
                case 2:
                    String keluar_3016 = queue_3016.dequeue_3016();
                    if (keluar_3016 == null) {
                        System.out.println("Antrian kosong, tidak ada yang dihapus!");
                    } else {
                        System.out.println(keluar_3016 + " telah dilayani");
                    }
                    break;
                    
                case 3:
                    System.out.println("\nIsi Antrian : ");
                    queue_3016.display_3016();
                    break;
                    
                case 4:
                    if (queue_3016.isEmpty_3016(queue_3016)) {
                        System.out.println("Antrian kosong, tidak bisa di-reverse!");
                    } else {
                        queue_3016.reverse_3016();
                        System.out.println("(Antrian berhasil di-reverse!)");
                        queue_3016.display_3016();
                    }
                    break;
                    
                case 5:
                    System.out.println("Terima kasih, program selesai!");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
            
        } while (pilihan_3016 != 5);
        
        sc_3016.close();
    }
}