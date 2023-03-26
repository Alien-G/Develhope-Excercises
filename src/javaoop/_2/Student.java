package javaoop._2;

public class Student {
    public String name;
    public int age;
    public Student(String name, int age) {
        System.out.println("Constructing");
        this.name = name;
        this.age = age;
        System.out.println("Constructed");
    }
    public void createStudent() {
        System.out.println("Students: " +
                name + ", "+ age);
    }
    public Student(int age) {
        this.age = age;
    }
    public Student(String name) {
        this.name = name;
    }
    public Student(){
    }
}
