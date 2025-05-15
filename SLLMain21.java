import java.util.Scanner;
public class SLLMain21 {
    public static void main(String[] args) {
        SingleLinkedList21 sll = new SingleLinkedList21();
        // Mahasiswa21 mhs1 = new Mahasiswa21("24212200", "Alvaro", "1A", 4.0);
        // Mahasiswa21 mhs2 = new Mahasiswa21("23212201", "Bimon", "2B", 3.8);
        // Mahasiswa21 mhs3 = new Mahasiswa21("24212202", "Cintia", "3C", 3.5);
        // Mahasiswa21 mhs4 = new Mahasiswa21("23212203", "Dirga", "4D", 3.6);

        // sll.print();
        // sll.addFirst(mhs4);
        // sll.print();
        // sll.addLast(mhs1);
        // sll.print();
        // sll.insertAfter("Dirga", mhs3);
        // sll.insertAt(2, mhs2);
        // sll.print();
        Scanner input = new Scanner(System.in);
        int pilih;
        do {
            System.out.println("\n=====================================");
            System.out.println("\t\tMenu");
            System.out.println("=====================================");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-3): ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("\nInput Data Mahasiswa:");
                    System.out.print("NIM\t: ");
                    String nim = input.nextLine();
                    System.out.print("Nama\t: ");
                    String nama = input.nextLine();
                    System.out.print("Kelas\t: ");
                    String kelas = input.nextLine();
                    System.out.print("IPK\t: ");
                    double ipk = input.nextDouble();
                    input.nextLine();

                    Mahasiswa21 mhs = new Mahasiswa21(nim, nama, kelas, ipk);
                    System.out.println("\nTambah ke:");
                    System.out.println("1. Awal");
                    System.out.println("2. Akhir");
                    System.out.println("3. Setelah Nama Tertentu");
                    System.out.println("4. Pada Index Tertentu");
                    System.out.print("pilih: ");
                    int posisi = input.nextInt();
                    input.nextLine();

                    switch (posisi) {
                        case 1:
                            sll.addFirst(mhs);
                            break;
                        case 2:
                            sll.addLast(mhs);
                            break;
                        case 3:
                            System.out.print("Masukkan nama: ");
                            String keyNama = input.nextLine();
                            sll.insertAfter(keyNama, mhs);
                            break;
                        case 4:
                            System.out.print("Masukkan index: ");
                            int index = input.nextInt();
                            input.nextLine();
                            sll.insertAt(index, mhs);
                            break;
                        default:
                            System.out.println("Pilihan posisi tidak valid.");
                    }
                    break;
                case 2:
                    System.out.println("\nData Mahasiswa dalam Linked List:");
                    sll.print();
                    break;
                case 3:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 3);
    }
}