package pl.edu.wszib.lab01.builder;

public class Person {

    private final String name;
    private final String familyName;
    private final Gender gender;
    private final Address address;
    private final Integer age;

    private Person(final String name,
                   final String familyName,
                   final Gender gender,
                   final Address address,
                   final Integer age) {
        this.name = name;
        this.familyName = familyName;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }

    public static Person.Builder builder() {
        return new Person.Builder();
    }

    public static class Builder {

        private String name;
        private String familyName;
        private Gender gender;
        private Address address;
        private Integer age;

        public Person build() {
            return new Person(name, familyName, gender, address, age);
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setFamilyName(String familyName) {
            this.familyName = familyName;
            return this;
        }

        public Builder setGender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public Builder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public Builder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public Address.Builder addressBuilder() {
            return Address.builder();
        }

    }

}
