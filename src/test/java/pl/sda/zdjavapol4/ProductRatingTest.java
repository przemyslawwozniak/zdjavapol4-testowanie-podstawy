package pl.sda.zdjavapol4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*
    JUnit dziala w ten sposob, ze przed kazdym uruchomieniem metody testowej tworzy nowa instancje klasy testowej:

        ProductRatingTest prt = new ProductRatingTest();
        prt.create_product_rating();

    Dzieki temu metody testowe nie wplywaja na siebie nawzajem i sa izolowane.
 */
public class ProductRatingTest {

    //pole klasy testowej - klasa testowana
    ProductRating pr = new ProductRating();

    /*
    1. Happy path: uzytkownik podaje poprawna ocene i ta ocena jest zachowana w polu
    2. Nie-happy path:
	    2a. Ocena powyzej zakresu max (>5) -> score = 5
	    2b. Ocena ponizej zakresu min (<1) -> score = 1
     */

    //inicjalizacja obiektu testowanej klasy zawsze powinna znalezc sie w zestawie testow
    @Test
    public void create_product_rating() {
        assertEquals("ProductRating's score should be initialized to 3.",  3, pr.getScore());
    }

    //1
    @Test
    public void user_provides_5_and_rating_is_set_to_5() {

    }
    //1
    @Test
    public void user_provides_1_and_rating_is_set_to_1() {

    }
    //2a
    @Test
    public void user_provides_6_and_rating_is_set_to_5() {

    }
    //2b
    @Test
    public void should_set_rating_to_1_when_user_provides_0() {

    }

}
