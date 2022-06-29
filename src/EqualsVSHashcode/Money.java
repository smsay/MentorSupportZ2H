package EqualsVSHashcode;

import java.util.Objects;

public class Money {

    private String currency;
    private int value;


    public Money(String currency, int value) {
        this.currency = currency;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public String getCurrency() {
        return currency;
    }

    // The method does override or implement a method declared in a supertype.
    @Override
    public boolean equals(Object o) {

        // null check
        if (o == null) {
            return false;
        }

        // this instance check
        if (this == o) {
            return true;
        }

        // instanceof Check and actual value check
        if ((o instanceof Money) && (((Money) o).getValue() == this.value) && ((Money) o).getCurrency() == this.currency) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(currency, value);
    }
}
