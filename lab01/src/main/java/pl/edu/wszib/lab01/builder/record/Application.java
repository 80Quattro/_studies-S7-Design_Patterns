package pl.edu.wszib.lab01.builder.record;

public class Application {

    public static void main(String[] args) {
        Person male1 = Person.male("Rafal", "Jania", 24, new Address("Krakow", "Krakowska", "1", "44-400"));
        Person felame1 = Person.female("Rafalina", "Jania", 26, new Address("Krakow", "Krakowska", "1", "44-400"));

        final PersonFactory personFactory = new PersonFactory();
        Person male2 = personFactory.male("Rafal", "Jania", 24, new Address("Krakow", "Krakowska", "1", "44-400"));
        Person female2 = personFactory.female("Rafalina", "Jania", 26, new Address("Krakow", "Krakowska", "1", "44-400"));
    }
}