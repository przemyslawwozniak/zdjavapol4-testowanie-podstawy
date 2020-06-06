package pl.sda.zdjavapol4;

import org.junit.Test;
import pl.sda.zdjavapol4.exception.ProductRatingAboveLimitException;
import pl.sda.zdjavapol4.exception.ProductRatingBelowLimitException;

import static org.junit.Assert.assertEquals;

public class ProductRatingWithExceptionsTest {

    ProductRatingWithExceptions pr = new ProductRatingWithExceptions();

    @Test
    public void create_product_rating() {
        assertEquals("ProductRating's score should be initialized to 3.",  3, pr.getScore());
    }

    //dziedziczenie: Exception jest klasa bazowa ('extends') dla naszych klas wyjatkow
    //wiec nie musimy wypisywac ich wszystkich po przecinku
    //wystarczy podac klase bazowa
    //wyjatek wyrzucamy w gore stosu
    @Test //given-when-then
    public void user_provides_5_and_rating_is_set_to_5() throws Exception {
        //when
        pr.setScore(5); //skoro uzywasz tej metody to musisz obsluzyc wyjatek ktory moze wyrzucic

        //then:
        assertEquals("ProductRating's score should be set to 5 on user input: 5.",  5, pr.getScore());
    }

    @Test
    public void user_provides_1_and_rating_is_set_to_1() throws Exception {
        //given:

        //when:
        pr.setScore(1);

        //then:
        assertEquals("ProductRating's score should be set to 1 on user input: 1.",  1, pr.getScore());
    }

    @Test(expected = ProductRatingAboveLimitException.class)
    public void user_provides_6_and_ProductRatingAboveLimitException_is_thrown() throws Exception {
        //when:
        pr.setScore(6);

        //then:
        assertEquals("ProductRating's score should be set to 5 on user input: 6.",  5, pr.getScore());
    }

    @Test(expected = ProductRatingBelowLimitException.class)
    public void should_throw_ProductRatingBelowLimitException_when_user_provides_0() throws Exception {
        //when:
        pr.setScore(0);

        //then:
        assertEquals("ProductRating's score should be set to 1 on user input: 0.",  1, pr.getScore());
    }

}
