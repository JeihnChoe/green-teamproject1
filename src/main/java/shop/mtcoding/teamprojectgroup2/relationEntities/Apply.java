package shop.mtcoding.teamprojectgroup2.relationEntities;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Table(name = "apply_tb")
public class Apply {

    Integer id;
    Integer resumeId;
    Integer noticeId;
    String pass;

    @Builder
    public Apply(Integer id, Integer resumeId, Integer noticeId, String pass) {
        this.id = id;
        this.resumeId = resumeId;
        this.noticeId = noticeId;
        this.pass = pass;
    }

}
