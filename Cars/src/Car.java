import java.sql.SQLOutput;

public class Car {

    private int price;
    private String brand;
    private String model;
    private String country;


    public Car(int price, String brand, String model, String country) {
        this.price = price;
        this.brand = brand;
        this.model = model;
        this.country = country;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public void outPut(int price, String brand, String model, String country) {
        System.out.printf("The price of the %s %s is %d, from %s%n", brand, model, price, country);
    }


}
