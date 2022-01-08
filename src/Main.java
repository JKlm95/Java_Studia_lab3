import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        /* ćw 4 klasy */

        /* zad.1
            a) Stworzyć klasę Osoba z polami prywatnymi:
            - imie (String),
            - nazwisko (String),
            - indeks (Integer)

            b) stworzyc konstruktory, gettery i settery
            c) napisać metodę w klasie Osoba która zwróci informację o osobie,
         */

        /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */

        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
         */



        Student student1 = new Student(new Osoba("Ryszard", "Rysiowy", 1223),WydzialEnum.INFORMATYCZNY);
        Student student2 = new Student(new Osoba("Adam", "Adamski", 87654), WydzialEnum.BIOLOGICZNY);
        Student student3 = new Student(new Osoba("Katarzyna", "Kaska", 90864),WydzialEnum.EKONOMICZNY);
        Student student4 = new Student(new Osoba("Beata", "Becia", 42833),WydzialEnum.ZARZADZANIA);
        Student student5 = new Student(new Osoba("Piotr","Piotrowski",65789),WydzialEnum.BIOLOGICZNY);

        List listaStudentow = new ArrayList();
        
        listaStudentow.add(student1);
        listaStudentow.add(student2);
        listaStudentow.add(student3);
        listaStudentow.add(student4);
        listaStudentow.add(student5);

        for (Object s : listaStudentow)
        {
            System.out.println(s.toString());
        }


    }
}
