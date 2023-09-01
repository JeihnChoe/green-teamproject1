package shop.mtcoding.teamprojectgroup2.resume;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;
import shop.mtcoding.teamprojectgroup2.relationEntities.Tech;
import shop.mtcoding.teamprojectgroup2.user.User;

@Data
@Table(name = "resume_tb")
@Entity
public class Resume {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(nullable = false, length = 10000)
    String title;

    @Column(nullable = false, length = 10000)
    String content;

    // @JsonIgnoreProperties({"password", "email", "createdAt"}) 나중에 필요하면 쓰기
    @ManyToOne(fetch = FetchType.LAZY)
    User user;

    @Column(length = 10000)
    String education; // 학력(택1)

    @Column(length = 10000)
    String school; // 학교

    @Column(length = 10000)
    String career; // 경력 연차(택1)

    boolean open = false;

    @Column(length = 10000)
    String etc;

    @Column(length = 10000)
    String link1; // 리스트중에 여러개 선택

    @Column(length = 10000)
    String link2; // 리스트중에 여러개 선택

    @Column(length = 10000)
    String link3; // 리스트중에 여러개 선택

    // @ManyToMany(fetch = FetchType.LAZY)
    // List<Tech> tech; // N:N

    @Builder
    public Resume(Integer id, String title, String content, String career, User user, String school, String education,
            boolean open, String etc, String link1, String link2, String link3) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.user = user;
        this.school = school;
        this.education = education;
        this.career = career;
        this.etc = etc;
        this.link1 = link1;
        this.link2 = link2;
        this.link3 = link3;
    }

}
