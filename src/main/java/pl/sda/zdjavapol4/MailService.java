package pl.sda.zdjavapol4;

public class MailService {

    int sentMailCounter;

    /**
     * MailService is used to send mail.
     * After initializing new instance, please remember to call those methods:
     * initHost(), initPort(), initProtocol()
     * @param port - port on which mail service is operating...
     * @param protocol
     * @param host
     * @param buffer
     */
    public MailService(int port, String protocol, String host, int buffer) {
        //...
    }

    public void initPort() {};
    public void initProtocol() {};
    public void initHost() {};
    public void initBuffer(int timeout) {};

    public void sendMail() {
        //send mail...
        sentMailCounter++;
    }

}
