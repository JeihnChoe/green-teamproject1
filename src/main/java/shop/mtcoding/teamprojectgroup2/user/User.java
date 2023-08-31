package shop.mtcoding.teamprojectgroup2.user;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.security.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "user_tb")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(nullable = false, length = 10000)
    String loginId;

    @Column(nullable = false, length = 10000)
    String password;

    @Column(nullable = false, length = 10000)
    String email;

    @Column(nullable = false, length = 10000)
    String username;

    @Column(nullable = false, length = 10000)
    String address;

    @Column(nullable = false, length = 10000)
    String school;

    @Column(nullable = false, length = 10000)
    String career;

    @Column(nullable = false, length = 10000)
    String tel;

    @Column(nullable = false, length = 10000)
    String birth;

    @Builder
    public User(Integer id, String loginId, String password, String email, String username, String address,
            String school, String career, String tel, String birth, String tech) {
        this.id = id;
        this.loginId = loginId;
        this.password = password;
        this.email = email;
        this.username = username;
        this.address = address;
        this.school = school;
        this.career = career;
        this.tel = tel;
        this.birth = birth;
    }
}
