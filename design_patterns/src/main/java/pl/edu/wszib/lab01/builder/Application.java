package pl.edu.wszib.lab01.builder;

public class Application {

    public static void main(String[] args) {
        Person.Builder personBuilder = Person.builder()
                .setName("Rafal")
                .setFamilyName("Jania")
                .setAge(24)
                .setGender(Gender.MALE);
        Address address = personBuilder.addressBuilder()
                .setCity("Krakow")
                .setStreet("Krakowska")
                .setNo(1)
                .setPostCode("44-400")
                .build();
        personBuilder.setAddress(address);
    }

}
