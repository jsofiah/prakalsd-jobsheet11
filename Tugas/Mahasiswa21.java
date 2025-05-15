public class Mahasiswa21 {
    String nim;
    String nama;
    String kelas;

    public Mahasiswa21() {
    }

    public Mahasiswa21(String nm, String name, String kls) {
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
    }

    public void tampilInformasi(){
        System.out.println(nama + "\t\t" + nim + "\t\t" + kelas);
    }
}