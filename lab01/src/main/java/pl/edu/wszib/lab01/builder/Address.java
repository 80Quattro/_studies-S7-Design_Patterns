package pl.edu.wszib.lab01.builder;

public class Address {

    private final String city;
    private final String street;
    private final Integer no;
    private final String postCode;

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

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {

        private String city;
        private String street;
        private Integer no;
        private String postCode;

        public Address build() {
            return new Address(city, street, no, postCode);
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setStreet(String street) {
            this.street = street;
            return this;
        }

        public Builder setNo(Integer no) {
            this.no = no;
            return this;
        }

        public Builder setPostCode(String postCode) {
            this.postCode = postCode;
            return this;
        }

    }

}
