public class SLLMain21 {
    public static void main(String[] args) {
        SingleLinkedList21 sll = new SingleLinkedList21();
        Mahasiswa21 mhs1 = new Mahasiswa21("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa21 mhs2 = new Mahasiswa21("23212201", "Bimon", "2B", 3.8);
        Mahasiswa21 mhs3 = new Mahasiswa21("24212202", "Cintia", "3C", 3.5);
        Mahasiswa21 mhs4 = new Mahasiswa21("23212203", "Dirga", "4D", 3.6);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
    }
}