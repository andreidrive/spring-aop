package andrei.dev.service;

import org.springframework.stereotype.Component;

@Component
public class UserService {

    public void updateName(Long userId, String name) {
        System.out.println("Обновление пользователя: " + name + " с id: " + userId);
    }
}
