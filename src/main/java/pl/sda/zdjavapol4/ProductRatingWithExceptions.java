package pl.sda.zdjavapol4;

import pl.sda.zdjavapol4.exception.ProductRatingAboveLimitException;
import pl.sda.zdjavapol4.exception.ProductRatingBelowLimitException;

//Cw. 2
public class ProductRatingWithExceptions {

    private int score;

    public ProductRatingWithExceptions() {
        this.score = 3;
    }

    public int getScore() {
        return score;
    }

    //zmiana w stosunku do ProductRating: jesli podano nieprawidlowy score, rzuc wyjatkiem
    //"obsluga" wyjatku poprzez wyrzucenie w gore stosu
    public void setScore(int score) throws ProductRatingAboveLimitException, ProductRatingBelowLimitException {
        if(score < 1) {
            throw new ProductRatingBelowLimitException();
        }

        if(score > 5) {
            throw new ProductRatingAboveLimitException();
        }

        this.score = score;
    }

}
