import org.w3c.dom.ls.LSOutput;

public class Osoba
{
    String imie;
    String nazwisko;
    int indeks;

    public Osoba(String imie, String nazwisko, int indeks)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.indeks = indeks;
    }

    public String getImie()
    {
        return imie;
    }

    public void setImie(String imie)
    {
        this.imie = imie;
    }

    public String getNazwisko()
    {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko)
    {
        this.nazwisko = nazwisko;
    }

    public int getIndeks()
    {
        return indeks;
    }

    public void setIndeks(int indeks)
    {
        this.indeks = indeks;
    }


    @Override
    public String toString()
    {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", indeks=" + indeks +
                '}';
    }

    String osoba(String imie, String nazwisko, int indeks)
    {
        return osoba("Ryszard", "Rysiowy", 1223253);
    }

}