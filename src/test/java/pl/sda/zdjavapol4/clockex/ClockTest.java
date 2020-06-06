package pl.sda.zdjavapol4.clockex;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClockTest {

    Clock c = new Clock(0, 0);

    @Test
    public void create_clock_with_correct_initial_time() {
        //then:
        assertEquals(0, c.getHours());
        assertEquals(0, c.getMinutes());
    }

    @Test(expected = IllegalArgumentException.class)    //sygnalizuje nieprawidlowy argument przekazany do metody
    public void create_clock_with_negative_hours_should_throw() {
        //given:
        c = new Clock(-1, 0);

        //when:


        //then:


    }

    @Test(expected = IllegalArgumentException.class)
    public void create_clock_with_hours_above_limit_should_throw() {
        //given:
        c = new Clock(24, 9);

        //when:


        //then:


    }

    @Test(expected = IllegalArgumentException.class)
    public void create_clock_with_negative_minutes_should_throw() {
        //given:
        c = new Clock(0, -1);

        //when:


        //then:


    }

    @Test(expected = IllegalArgumentException.class)
    public void create_clock_with_minutes_above_limit_should_throw() {
        //given:
        c = new Clock(0, 60);

        //when:


        //then:


    }

    @Test
    public void add_minutes_without_exceeding_full_hour() {
        //given:


        //when:
        c.addMinutes(59);

        //then:
        assertEquals(59, c.getMinutes());

    }

    @Test
    public void adding_minutes_exceed_hour() {
        //given:
        //00:00

        //when:
        c.addMinutes(69);

        //then:
        assertEquals(1, c.getHours());
        assertEquals(9, c.getMinutes());

    }

    @Test
    public void add_minutes_with_exceeding_day() {
        //given:
        c = new Clock(22, 22);

        //when:
        c.addMinutes(333);  //5h 33min

        //then:
        assertEquals(4, c.getHours());
        assertEquals(55, c.getMinutes());

    }

    @Test(expected = IllegalArgumentException.class)
    public void add_negative_number_of_minutes() {
        //given:


        //when:
        c.addMinutes(-100);

        //then:


    }

    @Test(expected = NullPointerException.class)
    public void add_null_clock() {
        //given:

        //when:
        c.addClock(null);

        //then:

    }

    @Test
    public void add_clock() {
        //given:
        Clock anotherClock = new Clock(10, 0);

        //when:
        c.addClock(anotherClock);

        //then:
        assertEquals(10, c.getHours());
        assertEquals(0, c.getMinutes());
    }

    @Test
    public void add_clock_increase_hour() {
        //given:
        c = new Clock(10, 30);
        Clock anotherClock = new Clock(0, 30);

        //when:
        c.addClock(anotherClock);

        //then:
        assertEquals(11, c.getHours());
        assertEquals(0, c.getMinutes());
    }

    @Test
    public void add_clock_proceed_next_day() {
        //given:
        c = new Clock(10, 30);
        Clock anotherClock = new Clock(15, 21);

        //when:
        c.addClock(anotherClock);

        //then:
        assertEquals(2, c.getHours());
        assertEquals(51, c.getMinutes());
    }

}
