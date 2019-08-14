package chapter10;


public class Cat {

    private String name;
    private String color;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Cat() {
        this.name = "Unnamed";
        this.color = "gray";
    }

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void sayMiau() {
        System.out.printf("Cat %s said: Miauuuuu!%n", name);
    }


}
