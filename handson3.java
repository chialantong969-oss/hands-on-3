
class Cell<T> {

    private T data;

    // Menyimpan nilai
    public void setValue(T data) {
        this.data = data;
    }

    // Mengambil nilai
    public T getValue() {
        return data;
    }

    // Menampilkan tipe data
    public void displayType() {
        if (data != null) {
            System.out.println(
                "Tipe Data: " + data.getClass().getSimpleName()
            );
            System.out.println("Nilai: " + data);
        }
    }
}

// Program utama
public class handson3 {
    public static void main(String[] args) {

        // Cell dengan tipe Integer
        Cell<Integer> angka = new Cell<>();
        angka.setValue(100);

        // Cell dengan tipe String
        Cell<String> teks = new Cell<>();
        teks.setValue("Belajar Java Generic");

        System.out.println("=== CELL INTEGER ===");
        angka.displayType();

        System.out.println("\n=== CELL STRING ===");
        teks.displayType();
    }
}

