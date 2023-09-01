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
    boolean open;

    @Column(nullable = false, length = 10000)
    String semiTitle;

    @Column(nullable = false, length = 10000)
    String semiContent;

    @Column(nullable = false, length = 10000)
    String bizImg;

    @Column(nullable = false, length = 10000)
    String mainTitle;

    @Column(length = 10000)
    String bizInfo;

    @Column(nullable = false, length = 10000)
    String bizName;

    @Column(nullable = false, length = 10000)
    String bizAddress;

    @Column(length = 10000)
    String career;

    @Column(length = 10000)
    String deadLine;

    @Builder
    public Notice(Integer id, boolean open, String semiTitle, String semiContent, String bizImg, String mainTitle,
            String bizInfo, String bizName, String bizAddress, String career, String deadLine) {
        this.id = id;
        this.open = open;
        this.semiTitle = semiTitle;
        this.semiContent = semiContent;
        this.bizImg = bizImg;
        this.mainTitle = mainTitle;
        this.bizInfo = bizInfo;
        this.bizName = bizName;
        this.bizAddress = bizAddress;
        this.career = career;
        this.deadLine = deadLine;
    }

}
