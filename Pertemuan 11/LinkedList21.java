// PRAKTIKUM 1
// public class LinkedList21 {
//     Node21 head;

//     public boolean isEmpty(){
//         return (head == null);
//     }

//     public void print(){
//         if(!isEmpty()){
//             System.out.println("Isi linked list");
//             Node21 currentNode = head;

//             while(currentNode != null){
//                 System.out.println(currentNode.data + "\t");
//                 currentNode = currentNode.next;
//             }
//             System.out.println("");
//         }else{
//             System.out.println("Linked list kosong");
//         }
//     }

//     public void addFirst(int input){
//         Node21 newNode = new Node21(input, null);

//         if (isEmpty()){
//             head = newNode;
//         }else{
//             newNode.next = head;
//             head = newNode;
//         }
//     }

//     public void addLast(int input){
//         Node21 newNode = new Node21(input, null);

//         if(isEmpty()){
//             head = newNode;
//         }else{
//             Node21 currentNode = head;

//             while (currentNode.next != null){
//                 currentNode = currentNode.next;
//             }
//             currentNode.next = newNode;
//         }
//     }

//     public void inserAfter(int key, int input){
//         Node21 newNode = new Node21(input, null);

//         if(!isEmpty()){
//             Node21 currentNode = head;

//             do{
//                 if(currentNode.data == key){
//                     newNode.next = currentNode.next;
//                     currentNode.next = newNode;
//                     break;
//                 }
//                 currentNode = currentNode.next;
//             }while (currentNode != null);
//         }else{
//             System.out.println("Linked list kosong");
//         }
//     }
// // METODE INSERT AT 
//     public void insertAt(int index, int input) {
//         if (index < 0) {
//             System.out.println("Indeks tidak valid");
//             return;
//         }
//         Node21 newNode = new Node21(input, null);
//         if (index == 0) {
//             newNode.next = head;
//             head = newNode;
//             return;
//         }
//         Node21 currentNode = head;
//         int currentIndex = 0;
//         while (currentNode != null && currentIndex < index - 1) {
//             currentNode = currentNode.next;
//             currentIndex++;
//         }
//         if (currentNode == null) {
//             System.out.println("Indeks di luar batas");
//         } else {
//             newNode.next = currentNode.next;
//             currentNode.next = newNode;
//         }
//     }
// }


// PRAKTIKUM 2
// public class LinkedList21 {
//     Node21 head;

//     public boolean isEmpty() {
//         return (head == null);
//     }

//     public void print() {
//         if (!isEmpty()) {
//             System.out.print("Isi linked list: ");
//             Node21 currentNode = head;
//             while (currentNode != null) {
//                 System.out.print(currentNode.data + "\t");
//                 currentNode = currentNode.next;
//             }
//             System.out.println("");
//         } else {
//             System.out.println("Linked list kosong");
//         }
//     }

//     public void addFirst(int input) {
//         Node21 newNode = new Node21(input, null);
//         if (isEmpty()) {
//             head = newNode;
//         } else {
//             newNode.next = head;
//             head = newNode;
//         }
//     }

//     public void addLast(int input) {
//         Node21 newNode = new Node21(input, null);
//         if (isEmpty()) {
//             head = newNode;
//         } else {
//             Node21 currentNode = head;
//             while (currentNode.next != null) {
//                 currentNode = currentNode.next;
//             }
//             currentNode.next = newNode;
//         }
//     }

//     public void insertAfter(int key, int input) {
//         Node21 newNode = new Node21(input, null);
//         if (!isEmpty()) {
//             Node21 currentNode = head;
//             do {
//                 if (currentNode.data == key) {
//                     newNode.next = currentNode.next;
//                     currentNode.next = newNode;
//                     break;
//                 }
//                 currentNode = currentNode.next;
//             } while (currentNode != null);
//         } else {
//             System.out.println("Linked list kosong");
//         }
//     }

//     public void insertAt(int index, int input) {
//         if (index < 0) {
//             System.out.println("Indeks tidak valid");
//             return;
//         }
//         Node21 newNode = new Node21(input, null);
//         if (index == 0) {
//             newNode.next = head;
//             head = newNode;
//             return;
//         }
//         Node21 currentNode = head;
//         int currentIndex = 0;
//         while (currentNode != null && currentIndex < index - 1) {
//             currentNode = currentNode.next;
//             currentIndex++;
//         }
//         if (currentNode == null) {
//             System.out.println("Indeks di luar batas");
//         } else {
//             newNode.next = currentNode.next;
//             currentNode.next = newNode;
//         }
//     }

//     public int getData(int index) {
//         if (index < 0 || isEmpty()) {
//             System.out.println("Indeks tidak valid atau Linked list kosong");
//             return -1; // Mengembalikan -1 untuk indeks tidak valid atau list kosong
//         }
//         Node21 currentNode = head;
//         int currentIndex = 0;
//         while (currentNode != null) {
//             if (currentIndex == index) {
//                 return currentNode.data;
//             }
//             currentNode = currentNode.next;
//             currentIndex++;
//         }
//         System.out.println("Indeks di luar batas");
//         return -1; // Mengembalikan -1 jika indeks di luar batas
//     }

//     public int indexOf(int key) {
//         Node21 currentNode = head;
//         int index = 0;
//         while (currentNode != null && currentNode.data != key) {
//             currentNode = currentNode.next;
//             index++;
//         }
//         if (currentNode == null) {
//             return -1;
//         } else {
//             return index;
//         }
//     }

//     public void removeFirst() {
//         if (!isEmpty()) {
//             head = head.next;
//         } else {
//             System.out.println("Linked list kosong");
//         }
//     }

//     public void removeLast() {
//         if (isEmpty()) {
//             System.out.println("Linked list kosong");
//         } else if (head.next == null) {
//             head = null;
//         } else {
//             Node21 currentNode = head;
//             while (currentNode.next != null) {
//                 if (currentNode.next.next == null) {
//                     currentNode.next = null;
//                     break;
//                 }
//                 currentNode = currentNode.next;
//             }
//         }
//     }

//     public void remove(int key) {
//         if (isEmpty()) {
//             System.out.println("Linked list kosong");
//         } else if (head.data == key) {
//             removeFirst();
//         } else {
//             Node21 currentNode = head;
//             while (currentNode.next != null) {
//                 if (currentNode.next.data == key) {
//                     currentNode.next = currentNode.next.next;
//                     break;
//                 }
//                 currentNode = currentNode.next;
//             }
//         }
//     }
// }

// TUGAS NO 1
public class LinkedList21 {
    Node21 head;

    public boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            System.out.println("Isi linked list:");
            Node21 currentNode = head;
            while (currentNode != null) {
                System.out.print(currentNode.data + "\t");
                currentNode = currentNode.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(int input) {
        Node21 newNode = new Node21(input, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int input) {
        Node21 newNode = new Node21(input, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node21 currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void insertAfter(int key, int input) {
        Node21 newNode = new Node21(input, null);
        if (!isEmpty()) {
            Node21 currentNode = head;
            while (currentNode != null) {
                if (currentNode.data == key) {
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    break;
                }
                currentNode = currentNode.next;
            }
        } else {
            System.out.println("Linked list kosong");
        }
    }

    // a. insertBefore()
    public void insertBefore(int key, int input) {
        Node21 newNode = new Node21(input, null);
        if (isEmpty()) {
            System.out.println("Linked list kosong");
            return;
        }

        if (head.data == key) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node21 currentNode = head;
        while (currentNode.next != null && currentNode.next.data != key) {
            currentNode = currentNode.next;
        }

        if (currentNode.next != null) {
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        } else {
            System.out.println("Key tidak ditemukan");
        }
    }

    // b. insertAt()
    public void insertAt(int index, int input) {
        if (index < 0) {
            System.out.println("Indeks tidak valid");
            return;
        }
        Node21 newNode = new Node21(input, null);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node21 currentNode = head;
        int currentIndex = 0;
        while (currentNode != null && currentIndex < index - 1) {
            currentNode = currentNode.next;
            currentIndex++;
        }
        if (currentNode == null) {
            System.out.println("Indeks di luar batas");
        } else {
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }
    }

    // c. removeAt()
    public void removeAt(int index) {
        if (index < 0) {
            System.out.println("Indeks tidak valid");
            return;
        }
        if (isEmpty()) {
            System.out.println("Linked list kosong");
            return;
        }
        if (index == 0) {
            head = head.next;
            return;
        }
        Node21 currentNode = head;
        int currentIndex = 0;
        while (currentNode != null && currentIndex < index - 1) {
            currentNode = currentNode.next;
            currentIndex++;
        }
        if (currentNode == null || currentNode.next == null) {
            System.out.println("Indeks di luar batas");
        } else {
            currentNode.next = currentNode.next.next;
        }
    }

    // Metode tambahan yang sebelumnya sudah ada
    public int getData(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index tidak valid: " + index);
        }
        Node21 currentNode = head;
        int currentIndex = 0;
        while (currentNode != null) {
            if (currentIndex == index) {
                return currentNode.data;
            }
            currentNode = currentNode.next;
            currentIndex++;
        }
        throw new IndexOutOfBoundsException("Index di luar batas: " + index);
    }

    public int indexOf(int key) {
        Node21 currentNode = head;
        int index = 0;
        while (currentNode != null) {
            if (currentNode.data == key) {
                return index;
            }
            currentNode = currentNode.next;
            index++;
        }
        return -1; // Jika key tidak ditemukan
    }

    public void removeFirst() {
        if (!isEmpty()) {
            head = head.next;
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else if (head.next == null) {
            head = null;
        } else {
            Node21 currentNode = head;
            while (currentNode.next.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = null;
        }
    }

    public void remove(int key) {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else if (head.data == key) {
            removeFirst();
        } else {
            Node21 currentNode = head;
            while (currentNode.next != null) {
                if (currentNode.next.data == key) {
                    currentNode.next = currentNode.next.next;
                    break;
                }
                currentNode = currentNode.next;
            }
        }
    }
}