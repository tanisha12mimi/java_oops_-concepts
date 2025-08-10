package oops_java;

public class encapsulation {
    String name;
    int age;

    public String name() {
        return name;
    }

    public encapsulation setName(String name) {
        this.name = name;
        return this;
    }

    public int age() {
        return age;
    }

    public encapsulation setAge(int age) {
        this.age = age;
        return this;
    }
}


