package buoi5;

public class Animal {
    private String name;
    private int age;
    private String fetherColor;
    private double height;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFetherColor() {
        return fetherColor;
    }

    public void setFetherColor(String fetherColor) {
        this.fetherColor = fetherColor;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void eat() {
        System.out.println(this.name + " is eating");
    }

    public void eat(String name) { // Nap chong ham

    }
}
