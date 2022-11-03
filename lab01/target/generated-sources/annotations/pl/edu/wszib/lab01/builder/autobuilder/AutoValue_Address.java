package pl.edu.wszib.lab01.builder.autobuilder;

import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Address extends Address {

  private final String city;

  private final String street;

  private final String number;

  private final String postCode;

  private AutoValue_Address(
      String city,
      String street,
      String number,
      String postCode) {
    this.city = city;
    this.street = street;
    this.number = number;
    this.postCode = postCode;
  }

  @Override
  String city() {
    return city;
  }

  @Override
  String street() {
    return street;
  }

  @Override
  String number() {
    return number;
  }

  @Override
  String postCode() {
    return postCode;
  }

  @Override
  public String toString() {
    return "Address{"
        + "city=" + city + ", "
        + "street=" + street + ", "
        + "number=" + number + ", "
        + "postCode=" + postCode
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Address) {
      Address that = (Address) o;
      return this.city.equals(that.city())
          && this.street.equals(that.street())
          && this.number.equals(that.number())
          && this.postCode.equals(that.postCode());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= city.hashCode();
    h$ *= 1000003;
    h$ ^= street.hashCode();
    h$ *= 1000003;
    h$ ^= number.hashCode();
    h$ *= 1000003;
    h$ ^= postCode.hashCode();
    return h$;
  }

  static final class Builder extends Address.Builder {
    private String city;
    private String street;
    private String number;
    private String postCode;
    Builder() {
    }
    @Override
    Address.Builder city(String city) {
      if (city == null) {
        throw new NullPointerException("Null city");
      }
      this.city = city;
      return this;
    }
    @Override
    Address.Builder street(String street) {
      if (street == null) {
        throw new NullPointerException("Null street");
      }
      this.street = street;
      return this;
    }
    @Override
    Address.Builder number(String number) {
      if (number == null) {
        throw new NullPointerException("Null number");
      }
      this.number = number;
      return this;
    }
    @Override
    Address.Builder postCode(String postCode) {
      if (postCode == null) {
        throw new NullPointerException("Null postCode");
      }
      this.postCode = postCode;
      return this;
    }
    @Override
    Address build() {
      if (this.city == null
          || this.street == null
          || this.number == null
          || this.postCode == null) {
        StringBuilder missing = new StringBuilder();
        if (this.city == null) {
          missing.append(" city");
        }
        if (this.street == null) {
          missing.append(" street");
        }
        if (this.number == null) {
          missing.append(" number");
        }
        if (this.postCode == null) {
          missing.append(" postCode");
        }
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_Address(
          this.city,
          this.street,
          this.number,
          this.postCode);
    }
  }

}
