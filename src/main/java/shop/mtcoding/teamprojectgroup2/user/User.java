package shop.mtcoding.teamprojectgroup2.user;

import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import shop.mtcoding.teamprojectgroup2.relationTechs.RelationTechs;

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
    String addressDetail;

    @Column(length = 10000)
    String tel;

    @Column(length = 10000)
    String birth;

    Timestamp createdAt;

    @Builder
    public User(Integer id, String loginId, String password, String email, String username, String address,
            String addressDetail,
            String tel, String birth, Timestamp createdAt, RelationTechs relationTechs) {
        this.id = id;
        this.loginId = loginId;
        this.password = password;
        this.email = email;
        this.username = username;
        this.address = address;
        this.addressDetail = addressDetail;
        this.tel = tel;
        this.birth = birth;
        this.createdAt = createdAt;

    }
}
