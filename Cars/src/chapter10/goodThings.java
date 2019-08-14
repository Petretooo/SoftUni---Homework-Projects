package chapter10;

public class goodThings {

    private String hvalebstvenaFraza;
    private String hvalebstvenaSluchka;
    private String name;
    private String secondName;
    private String city;

    public goodThings(String hFraza, String hSluchka, String name, String sName, String city) {
        this.hvalebstvenaFraza = hFraza;
        this.hvalebstvenaSluchka = hSluchka;
        this.name = name;
        this.secondName = sName;
        this.city = city;
    }

    public String getHvalebstvenaFraza() {
        return hvalebstvenaFraza;
    }

    public void setHvalebstvenaFraza(String hvalebstvenaFraza) {
        this.hvalebstvenaFraza = hvalebstvenaFraza;
    }

    public String getHvalebstvenaSluchka() {
        return hvalebstvenaSluchka;
    }

    public void setHvalebstvenaSluchka(String hvalebstvenaSluchka) {
        this.hvalebstvenaSluchka = hvalebstvenaSluchka;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public void output() {

        System.out.println(getHvalebstvenaFraza() + getHvalebstvenaSluchka() + getName() + getSecondName() + getCity());

    }
}
