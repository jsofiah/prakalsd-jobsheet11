import java.util.Scanner;
public class SLLMain21 {
    public static void main(String[] args) {
        SingleLinkedList21 sll = new SingleLinkedList21();
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