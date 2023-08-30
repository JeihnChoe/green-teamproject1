package shop.mtcoding.teamprojectgroup2.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class User {
    Integer id;
    String loginId;
    String password;
    String email;
    String username;
    String address;
    String school;
    String career;
    String tel;
    String birth;
    String tech;
}
