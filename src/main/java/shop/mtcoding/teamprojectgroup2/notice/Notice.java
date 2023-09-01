package shop.mtcoding.teamprojectgroup2.notice;

import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import shop.mtcoding.teamprojectgroup2.relationTechs.RelationTechs;

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

    @Column(nullable = false, length = 10000)
    Integer bizId;

    Timestamp createdAt;

    RelationTechs relationTechs;

}
