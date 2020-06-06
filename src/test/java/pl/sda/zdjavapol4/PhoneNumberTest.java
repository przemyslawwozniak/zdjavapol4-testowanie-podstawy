package pl.sda.zdjavapol4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PhoneNumberTest {

    @Test
    public void same_numbers_are_equal() {
        PhoneNumber pn1 = new PhoneNumber(48, 796800500);
        PhoneNumber pn2 = new PhoneNumber(48, 796800500);

        assertEquals("Same phone numbers should be equal", pn1, pn2);   //porownanie poprzez metode equals dla obiektow
    }

    /*
    porownanie liczb zmiennoprzecinkowych w komputerze
    my chcemy zapisac 0.005
    komputer raz zapisze tak 0.00499999 99999999999999999998
    a raz tak 0.00499999 99999999999999899999
    a jak mu zdefiniujemy delta = +/-0.0000001
    to porowna tylko to co odciete powyzej
     */

}
