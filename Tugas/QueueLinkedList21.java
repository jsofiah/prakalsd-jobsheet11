public class QueueLinkedList21 {
    NodeMahasiswa21 head;
    NodeMahasiswa21 tail;
    int size;

    public QueueLinkedList21() {
        head = tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean isFull(){
        return false;
    }

    public void clear(){
        if (!isEmpty()){
            head = tail = null;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan.");
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void addLast(Mahasiswa21 input){
        NodeMahasiswa21 data = new NodeMahasiswa21(input, null);
        if(isEmpty()){
            head = data;
            tail = data;
        } else {
            tail.next = data;
            tail = data;
        }
        size++;
        System.out.println("Data berhasil ditambahkan ke antrian.");
    }

    public void removeFirst(){
        if (isEmpty()){
            System.out.println("Antrian kosong, tidak dapat memanggil!");
        } else if (head == tail){
            head = tail = null;
        } else {
            System.out.println("Memanggil: ");
            head.data.tampilInformasi();
            head = head.next;
            size--;
        }
    }

    public void printFirst(){
        if(!isEmpty()){
            System.out.println("Antrian Terdepan\t: ");
            head.data.tampilInformasi();
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void printLast(){
        if(!isEmpty()){
            System.out.println("Antrian Terbelakang\t: ");
            tail.data.tampilInformasi();
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void print(){
        if(!isEmpty()){
            NodeMahasiswa21 tmp = head;
            System.out.println("Isi Linked List\t: ");
            while (tmp != null){
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void sizeAntrian(){
        System.out.println("Jumlah mahasiswa yang masih mengantri: " + size);
    }

}
