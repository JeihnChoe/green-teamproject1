package shop.mtcoding.teamprojectgroup2.biz;

import lombok.Getter;
import lombok.Setter;

public class BizRequestDTO {
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
