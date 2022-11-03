package pl.edu.wszib.lab01.builder.record;

public class Application {

    public static void main(String[] args) {
        Person.male("Rafal", "Jania", 24, new Address("", "", ""));
        Person.female();
    }
}