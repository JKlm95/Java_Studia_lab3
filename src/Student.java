public class Student
{

    private Osoba osoba;
    private WydzialEnum wydzialEnum;

    public Student(Osoba osoba, WydzialEnum wydzialEnum)
    {
        this.osoba = osoba;
        this.wydzialEnum = wydzialEnum;
    }

    public Osoba getOsoba()
    {
        return osoba;
    }

    public void setOsoba(Osoba osoba)
    {
        this.osoba = osoba;
    }

    public WydzialEnum getWydzialEnum()
    {
        return wydzialEnum;
    }

    public void setWydzialEnum(WydzialEnum wydzialEnum)
    {
        this.wydzialEnum = wydzialEnum;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "osoba=" + osoba +
                ", wydzialEnum=" + wydzialEnum +
                '}';
    }
}
