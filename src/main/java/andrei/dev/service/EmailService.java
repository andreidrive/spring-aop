package andrei.dev.service;

import org.springframework.stereotype.Component;

@Component
public class EmailService {

    public void send(String from, String to, String text) {
        System.out.println("Письмо от " + from + " с текстом: " + text + " отправлено: " + to);
    }
}
