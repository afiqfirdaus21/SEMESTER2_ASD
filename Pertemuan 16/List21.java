// import java.util.ArrayList;
// import java.util.List;
// class List21 {
//     private List<Object> list;
//     public List21() {
//         list = new ArrayList<>();
//     }

//     public void add(Object element) {
//         list.add(element);
//     }

//     public Object get(int index) {
//         return list.get(index);
//     }

//     public void remove(int index) {
//         list.remove(index);
//     }

//     public int size() {
//         return list.size();
//     }
// }

// Modifikasi soal nomor 2
import java.util.ArrayList;
import java.util.List;

class List21<T> {
    private List<T> list;

    public List21() {
        list = new ArrayList<>();
    }

    public void add(T element) {
        list.add(element);
    }

    public T get(int index) {
        return list.get(index);
    }

    public void remove(int index) {
        list.remove(index);
    }

    public int size() {
        return list.size();
    }
}
