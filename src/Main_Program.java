import com.rizkykhapidsyah.Method_Generic;

public class Main_Program {
    public static void main(String[] args) {
        Integer[] Angka = {5, 8, 7, 11, 20};
        String[] Mobil = {"Mobil_1", "Mobil_2", "Mobil_3"};

        System.out.println("Menampilkan Data Angka");
        Method_Generic.TampilkanData(Angka);

        System.out.println("\nMenampilkan Data Mobil");
        Method_Generic.TampilkanData(Mobil);
    }
}
