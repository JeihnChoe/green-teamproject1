package shop.mtcoding.teamprojectgroup2.user;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import shop.mtcoding.teamprojectgroup2.relationEntities.Tech;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.security.Timestamp;
import java.util.List;

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

    @Column(length = 10000)
    String username;

    @Column(length = 10000)
    String address;

    @Column(length = 10000)
    String tel;

    @Column(length = 10000)
    String birth;

    // @ManyToOne(fetch = FetchType.LAZY)
    // List<Tech> tech; // N:N

    @Builder
    public User(Integer id, String loginId, String password, String email, String username, String address,
            String school, String career, String tel, String birth, String tech, String link) {
        this.id = id;
        this.loginId = loginId;
        this.password = password;
        this.email = email;
        this.username = username;
        this.address = address;
        this.tel = tel;
        this.birth = birth;
    }
}
