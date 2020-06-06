package pl.sda.zdjavapol4;

import org.junit.Test;

public class MailServiceTest {

    //Test are living Documentation
    @Test
    public void create_and_initialize_mail_service() {  //Python (C++ 1000 -> Java 300 -> Python 30)
        MailService ms = new MailService(8081, "smtp", "pkobp.pl", 10000);
        ms.initHost();
        ms.initPort();
        ms.initProtocol();
        ms.initBuffer(5000);    //5000ms -> 5s
    }

    //createAndInitializeMailService

}
