public class Student
{
public int rokStudiow;
public String Imie;
public String Nazwisko;
public boolean pelnoletni;

    @Override
    public String toString()
    {
        return "Student{" +
                "rokStudiow=" + rokStudiow +
                ", Imie='" + Imie + '\'' +
                ", Nazwisko='" + Nazwisko + '\'' +
                ", pelnoletni=" + pelnoletni +
                '}';

    }
}
