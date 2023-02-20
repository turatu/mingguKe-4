import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;


public class MyList {

        public static void main(String[] args) {

            // a. List Nama makanan minimal 10 data

            List<String> foods = Arrays.asList("Mie", "Ayam goreng", "Bakwan", "Baso Tahu", "Nasi Goreng",
                    "Ice Cream", "Seblak", "Cilok", "Kentang Goreng", "Cakue");
            System.out.println("a. List Nama makanan");
            System.out.println(foods + "\n");

            // b. List Tahun Piala Dunia minimal 3 data

            List<Integer> worldCupYears = Arrays.asList(2006, 2010, 2014, 2018, 2022);
            System.out.println("b. List Tahun Piala Dunia");
            System.out.println(worldCupYears + "\n");

            //c. Implement sort pada list nama provinsi minimal 10 data secara descending

            List<String> provinces = Arrays.asList("Aceh", "Sumatera Utara", "Sumatera Barat", "Riau", "Jambi",
                    "Sumatera Selatan", "Bengkulu", "Lampung", "Bangka Belitung", "Banten");

            provinces.sort(Collections.reverseOrder());
            System.out.println("c. List nama provinsi secara descending");
            System.out.println(provinces + "\n");

            //d. Implement penghapusan data untuk 5 data yang berbeda dari list bahasa pemograman yang berisikan 12 data

            List<String> programmingLanguages = new ArrayList<>();
            programmingLanguages.add("Java");
            programmingLanguages.add("JavaScript");
            programmingLanguages.add("Go");
            programmingLanguages.add("PHP");
            programmingLanguages.add("C#");
            programmingLanguages.add("C");
            programmingLanguages.add("C++");
            programmingLanguages.add("Python");
            programmingLanguages.add("Kotlin");
            programmingLanguages.add("Perl");
            programmingLanguages.add("Rust");
            programmingLanguages.add("Swift");

            programmingLanguages.remove("Rust");
            programmingLanguages.remove("C");
            programmingLanguages.remove("C#");
            programmingLanguages.remove("Swift");
            programmingLanguages.remove("Perl");

            System.out.println("d. List bahasa pemograman");
            System.out.println(programmingLanguages + "\n");

        }
}
