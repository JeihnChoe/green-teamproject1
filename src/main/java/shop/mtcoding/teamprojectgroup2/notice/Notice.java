package shop.mtcoding.teamprojectgroup2.notice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import shop.mtcoding.teamprojectgroup2.biz.Biz;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "notice_tb")
@Entity
public class Notice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(nullable = false, length = 10000)
    String title;

    @Column(nullable = false, length = 10000)
    String content;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    Biz biz;



    @Column(nullable = false, length = 10000)
    String jobgroup;

    @Column(nullable = false, length = 10000)
    Integer career;

    @Column(nullable = false, length = 10000)
    String map;

    @Builder
    public Notice(Integer id, String title, String content, Biz biz, String jobgroup, Integer career, String map) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.biz = biz;
        this.jobgroup = jobgroup;
        this.career = career;
        this.map = map;
    }

  


    
    
}
