package shop.mtcoding.teamprojectgroup2.relationEntities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name = "apply_tb")
public class Apply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column
    Integer resumeId;

    @Column
    Integer noticeId;

    @Column
    String pass;

    @Builder
    public Apply(Integer id, Integer resumeId, Integer noticeId, String pass) {
        this.id = id;
        this.resumeId = resumeId;
        this.noticeId = noticeId;
        this.pass = pass;
    }

}
