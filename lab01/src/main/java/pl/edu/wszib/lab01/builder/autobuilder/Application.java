package pl.edu.wszib.lab01.builder.autobuilder;

public class Application {

    public static void main(String[] args) {
        Address address = Address.builder()
                .street("Street")
                .city("Krakow")
                .number("1")
                .postCode("44-440")
                .build();
        Person person = Person.builder()
                .firstName("Rafal")
                .lastName("Jania")
                .age(24)
                .gender(Gender.MALE)
                .address(address)
                .build();
//        Person.create()
//        Person.male()
//        Person.female()
        System.out.println(person);
    }

}
