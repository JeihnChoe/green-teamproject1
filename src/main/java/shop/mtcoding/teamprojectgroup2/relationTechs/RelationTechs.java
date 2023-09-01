package shop.mtcoding.teamprojectgroup2.relationTechs;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;
import shop.mtcoding.teamprojectgroup2.biz.Biz;
import shop.mtcoding.teamprojectgroup2.notice.Notice;
import shop.mtcoding.teamprojectgroup2.resume.Resume;
import shop.mtcoding.teamprojectgroup2.tech.Tech;
import shop.mtcoding.teamprojectgroup2.user.User;

@Data
@Entity
@Table(name = "relation_techs_tb")
public class RelationTechs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    User user;

    @ManyToOne(fetch = FetchType.LAZY)
    Resume resume;

    @ManyToOne(fetch = FetchType.LAZY)
    Biz biz;

    // @JsonIgnoreProperties({ "title", "content", "bizId" })
    @ManyToOne(fetch = FetchType.LAZY)
    Notice notice;

    @ManyToOne(fetch = FetchType.LAZY)
    Tech tech;

    @Builder
    public RelationTechs(Integer id, User user, Resume resume, Biz biz, Notice notice, Tech tech) {
        this.id = id;
        this.user = user;
        this.resume = resume;
        this.biz = biz;
        this.notice = notice;
        this.tech = tech;
    }
}
