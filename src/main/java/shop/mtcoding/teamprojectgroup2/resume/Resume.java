package shop.mtcoding.teamprojectgroup2.resume;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
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

    @Column(nullable = false)
    boolean open;

    @Builder
    public Resume(Integer id, String title, String content, String career, User user, Boolean open) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.user = user;
        this.open = open;
    }

}
