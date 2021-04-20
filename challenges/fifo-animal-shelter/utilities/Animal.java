package utilities;

public class Animal {
    String name;
    int age;
    String color;
    String gender;
    public Animal(String name, int age, String color, String gender) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.gender = gender;
    }

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString(){
        return String.format("Name: %s , Gender: %s, Age: %s, Color: %s",this.getName(),this.getGender(),this.getAge(),this.getColor());
    }

}
