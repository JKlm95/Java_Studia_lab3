import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* ćw 5 Dziedziczenie */

        /* zad.1 Proszę wybrać dowolny temat budowania struktur klas np. samochody, dom, biblioteka, nauka, zabawki, kosmetyki, biuro podróży ... .
                 Będziemy budować podobną strukturę kodu jak w przykładzie 5,
            a) Proszę stworzyć układ klas dziedziczących po sobie,
            b) proszę użyć pól i metod protected jak i private,
            c) proszę stworzyć konstruktory, metody: toString(), settery i gettery,
            d) proszę używać super do wywołania konstruktorów i metod z klas nadrzędnych
            (można wygenerować je --> prawy przycisk myszki --> generate --> settery, gettery, ...),
            e) w klasie Main proszę stworzyć objekty podobnie jak w przykładzie 5,
            oraz stworzyć listę typu najbardziej generycznego np. List<Budynek>
         */


        Motocykle motocykl1 = new Motocykle("Suzuki", "GSX-R 1300", 89000);
        Samochody samochod1 = new Samochody("Audi", "A8", 870000);
        Samochody samochod2 = new Samochody("BMW", "Seria 7", 869000);
        Samochody samochod3 = new Samochody("Skoda", "Superb", 230000);
        Samochody samochod4 = new Samochody("Volvo", "S80", 476000);
        Samochody samochod5 = new Samochody("Mercedes", "Klasa S", 885000);




        List<Pojazdy> pojazdy = new ArrayList();
        pojazdy.add(motocykl1);
        pojazdy.add(samochod1);
        pojazdy.add(samochod2);
        pojazdy.add(samochod3);
        pojazdy.add(samochod4);
        pojazdy.add(samochod5);


        for (Object s : pojazdy)
        {
            System.out.println(s);
        }

    }
}
