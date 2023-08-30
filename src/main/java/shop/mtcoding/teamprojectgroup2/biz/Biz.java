package shop.mtcoding.teamprojectgroup2.biz;

import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "biz_tb")
@Entity
public class Biz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(nullable = false, length = 100)
    String loginid;

    @Column(nullable = false, length = 100)
    String password;

    @Column(nullable = false, length = 100)
    String email;

    @Column(nullable = false, length = 100)
    String bizname;

    @Column(nullable = false, length = 100)
    String manager_name;

    @Column(nullable = false, length = 100)
    String manager_tel;

    @Column(nullable = false, length = 100)
    String manager_email;

    @Column(nullable = true, length = 100)
    String address;

    @Column(nullable = true, length = 100)
    String biz_info;

    @CreationTimestamp
    private Timestamp createdAt;

}
