package pl.sda.zdjavapol4;

public class ProductRating {

    private int score;//short: -32k do 32k

    public ProductRating() {
        //throw new RuntimeException();
        this.score = 3;
    }

    public int getScore() {
        return score;
    }

    //1. przebudowac ify
    //2. przeniesc this.score na gore (najprostsze == najlepsze)
    //3. return z if-a
    public void setScore(int score) {
        if(score < 1) {
            this.score = 1;
            return; //wyjdz z metody w tym miejscu
        }

        if(score > 5) {
            this.score = 5;
            return;
        }

        this.score = score;
    }

}
