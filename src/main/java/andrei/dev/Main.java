package andrei.dev;

import andrei.dev.config.AppConfig;
import andrei.dev.service.ManagerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ManagerService managerService = context.getBean(ManagerService.class);

        managerService.sendEmail("Valeriy", "Andrei", "Hello");
        managerService.updateUser(1L, "Pavel");

        managerService.sendEmail("Valeriy", null, null);
    }
}