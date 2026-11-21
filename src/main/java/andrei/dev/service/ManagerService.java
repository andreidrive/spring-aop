package andrei.dev.service;

import andrei.dev.aspect.NotNullArgs;
import org.springframework.stereotype.Component;

@Component
public class ManagerService {

    private final UserService userService;
    private final EmailService emailService;

    public ManagerService(UserService userService, EmailService emailService) {
        this.userService = userService;
        this.emailService = emailService;
    }

    @NotNullArgs
    public void sendEmail(String from, String to, String text) {
        emailService.send(from, to, text);
    }

    @NotNullArgs
    public void updateUser(Long userId, String name) {
        userService.updateName(userId, name);
    }
}
