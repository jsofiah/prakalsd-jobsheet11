import java.util.Scanner;
public class AntrianMain21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        QueueLinkedList21 antrian = new QueueLinkedList21();
        int pilih;

        do {
            System.out.println("\n=====================================");
            System.out.println("           Menu Antrian");
            System.out.println("=====================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Paling Akhir");
            System.out.println("5. Tampilkan Semua Antrian");
            System.out.println("6. Jumlah Mahasiswa yang Mengantre");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("8. Keluar");
            System.out.print("Pilih: ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM\t: ");
                    String nim = input.nextLine();
                    System.out.print("Nama\t: ");
                    String nama = input.nextLine();
                    System.out.print("Kelas\t: ");
                    String kelas = input.nextLine();

                    Mahasiswa21 mhs = new Mahasiswa21(nim, nama, kelas);
                    antrian.addLast(mhs);
                    break;
                case 2:
                    antrian.removeFirst();
                    break;
                case 3:
                    antrian.printFirst();
                    break;
                case 4:
                    antrian.printLast();
                    break;
                case 5:
                    antrian.print();
                    break;
                case 6:
                    antrian.sizeAntrian();
                    break;
                case 7:
                    antrian.clear();
                    break;
                case 8:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 8);
    }
}
