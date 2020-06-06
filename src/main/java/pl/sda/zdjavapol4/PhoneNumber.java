package pl.sda.zdjavapol4;

import java.util.Objects;

public class PhoneNumber {

    private int prefix; //48
    private int main;   //796 555 000

    public PhoneNumber(int prefix, int main) {
        this.prefix = prefix;
        this.main = main;
    }

    //najprosciej metode equals wygenerowac


    //Alt+Insert -> hashcode equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber that = (PhoneNumber) o;
        return prefix == that.prefix &&
                main == that.main;
    }

    @Override
    public int hashCode() {
        return Objects.hash(prefix, main);
    }

}
