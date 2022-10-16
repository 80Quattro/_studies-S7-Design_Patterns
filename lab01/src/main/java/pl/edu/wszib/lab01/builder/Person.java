package pl.edu.wszib.lab01.builder;

public class Person {

    private String name;
    private String familyName;
    private String gender;
    private Address address;
    private Integer age;

    private Person() {
        
    }

    public static class Builder {

        private String name;
        private String familyName;
        private String gender;
        private Address address;
        private Integer age;
        private String city;
        private String street;
        private Integer no;
        private String postCode;

        public void setName(String name) {
            this.name = name;
        }

        public void setFamilyName(String familyName) {
            this.familyName = familyName;
        }

        public void setgender(String gender) {
            this.gender = gender;
        }

        public void setAddress(Address address) {
            this.address = address;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public void setNo(Integer no) {
            this.no = no;
        }

        public void setPostCode(String postCode) {
            this.postCode = postCode;
        }
    }

    public Person build() {
        Person person = new Person();
        person.familyName = this.familyName;
        person.gender = this.gender;
        Address address1 = new Address.Builder;
        person.address = this.address;
        person.age = this.age;
        return person;
    }

}
