import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 3 klasy */

        /*  zad.1 - Najpierw należy uzupełnić kod w klasie Punkt.java,
            a) stworzyć objekt punktA typu Punkt,
            w konstruktorze zainicjować zmienną pX --> np. new Punkt(7), wykonać metodę punktA.toString();
            b) następnie ponownie wywopać konstruktor inicjalizujący wszystkie pola z klasy
            --> np. punkt = new Punkt(1, 2, 3);, wykonać metodę punktA.toString();
            c) nadpisać wartości pól z objektu punktA za pomocą setterów i
            ponownie wywołać metodę toString();
            d) wypisać wartości pól (za pomocą getterów),
            e) wywołać metody suma i róznica (obie wersje) z klasy punkt
        */

        Punkt punktA = new Punkt(7);
        punktA.toString();

        Punkt punktB = new Punkt(5, 6, 7);
        punktB.toString();



        punktB.setpX(7);
        punktB.setpY(2);
        punktB.setpZ(5);

        punktB.toString();

        System.out.println(punktB.getpX() + " " + punktB.getpY() + " " + punktB.getpZ()); // pZ wyświetla 50, ponieważ getpZ zwraca pZ * 10

        int result = punktB.Suma();
        System.out.println(result);

        int result1 = punktB.Roznica1();
        System.out.println(result1);

        int result2 = punktB.Roznica2(3, 2, 1);
        System.out.println(result2);


    }

}
