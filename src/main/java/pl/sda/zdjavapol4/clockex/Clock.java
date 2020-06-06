package pl.sda.zdjavapol4.clockex;

public class Clock {

    private int hours, minutes;

    public Clock(int hours, int minutes) {
        setHours(hours);
        setMinutes(minutes);
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }
    //private, poniewaz zakladam ze nie beda wykorzystywane publicznie, na zewnatrz klasy
    private void setHours(int hours) {
        if(hours < 0 || hours > 23)
            throw new IllegalArgumentException();

        this.hours = hours;
    }

    private void setMinutes(int minutes) {
        if(minutes < 0 || minutes > 59)
            throw new IllegalArgumentException();

        this.minutes = minutes;
    }

    //np minutes = 320
    //320 : 60 = 5,... -> 5 hours
    //320 - 5 * 60 = 320 - 300 = 20 -> 20 minutes
    public void addMinutes(int minutes) {   //10:30 +30
        if(minutes < 0)
            throw new IllegalArgumentException();

        minutes += this.minutes;  //60
        int hours = minutes / 60;   //int traci koncowke dziesietna, czyli 320/60 = 5
        minutes -= hours * 60;  //60 - 60 = 0

        addHours(hours);

        this.minutes = minutes; //30 + 0 = 30 ---> 0
    }

    public void addHours(int hours) {
        int summedHours = this.hours + hours;
        if(summedHours > 23) {
            this.hours = summedHours % 23;
            return;
        }

        this.hours += hours;
    }

    public void addClock(Clock another) {
        if(another == null)
            throw new NullPointerException();

        this.addHours(another.getHours());
        this.addMinutes(another.getMinutes());
    }
}
