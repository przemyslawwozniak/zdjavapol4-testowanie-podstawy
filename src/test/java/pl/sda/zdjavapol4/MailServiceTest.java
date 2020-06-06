package pl.sda.zdjavapol4;

import org.junit.Before;
import org.junit.Test;

public class MailServiceTest {

    MailService ms = new MailService(8081, "smtp", "pkobp.pl", 10000);

    //zapewnienie wspolnej konfiguracji MailService (poza konstruktorem) dla wszystkich metod
    @Before
    public void setup() {
        //ms.setBuffer(10);
        ms.initHost();
        ms.initPort();
        ms.initProtocol();
        ms.initBuffer(5000);
    }

    //Test are living Documentation
    @Test
    public void create_and_initialize_mail_service() {  //Python (C++ 1000 -> Java 300 -> Python 30)
        //MailService ms = new MailService(8081, "smtp", "pkobp.pl", 10000);
        ms.initHost();
        ms.initPort();
        ms.initProtocol();
        ms.initBuffer(5000);    //5000ms -> 5s
    }

    //createAndInitializeMailService

    @Test
    public void sends_mail_fine() {
        ms.sendMail();
    }

    @Test(expected = IllegalStateException.class)
    public void send_mail_failed() throws Exception { //throws Exception for caught exception class
        //given:
        ms.setBuffer(99);

        //when:
        ms.sendMail();

        //then:
        //exception is thrown
    }

}
