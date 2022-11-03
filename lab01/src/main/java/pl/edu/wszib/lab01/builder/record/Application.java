package pl.edu.wszib.lab01.builder.record;

public class Application {

    public static void main(String[] args) {
        Person male1 = Person.male("Rafal", "Jania", 24, new Address("", "", ""));
        Person felame1 = Person.female("Rafalina", "Jania", 26, new Address("", "", ""));

        final PersonFactory personFactory = new PersonFactory();
        personFactory.male2("Rafal", "Jania", 24, new Address("", "", ""));
        personFactory.female2("Rafalina", "Jania", 26, new Address("", "", ""));
    }
}