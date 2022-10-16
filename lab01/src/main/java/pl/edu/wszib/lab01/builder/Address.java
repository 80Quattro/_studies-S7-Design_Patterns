package pl.edu.wszib.lab01.builder;

public class Address {

    private String city;
    private String street;
    private Integer no;
    private String postCode;

    private Address(
            final String city,
            final String street,
            final Integer no,
            final String postCode ) {
        this.city = city;
        this.street = street;
        this.no = no;
        this.postCode = postCode;
    }

    public static final class Builder {

        private String city;
        private String street;
        private Integer no;
        private String postCode;

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

    public Address build() {
        return new Address(city, street, no, postCode);
    }

}
