package shop.mtcoding.teamprojectgroup2.user;

import org.springframework.transaction.annotation.Transactional;

import lombok.Getter;
import lombok.Setter;

public class UserRequestDTO {
    @Getter
    @Setter
    public static class JoinDTO {
        private String loginId;
        private String password;
        private String email;

    }

    @Getter
    @Setter
    public static class LoginDTO {
        private String loginId;
        private String password;

    }

}
