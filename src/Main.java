import java.util.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */
        Student student_1 = new Student();
        student_1.rokStudiow = 1;
        student_1.Imie = "Jacek";
        student_1.Nazwisko = "Jackowski";
        student_1.pelnoletni = false;
        Student student_2 = new Student();
        student_2.rokStudiow = 2;
        student_2.Imie = "Piotr";
        student_2.Nazwisko = "Piotrowski";
        student_2.pelnoletni = true;
        Student student_3 = new Student();
        student_3.rokStudiow = 3;
        student_3.Imie = "Adam";
        student_3.Nazwisko = "Adamowski";
        student_3.pelnoletni = true;



        String [] tablica = new String[3];

        tablica[0] = String.valueOf(student_1);
        tablica[1] = String.valueOf(student_2);
        tablica[2] = String.valueOf(student_3);

        for (String s : tablica)
        {
            System.out.println(s);
        }

    }


}
