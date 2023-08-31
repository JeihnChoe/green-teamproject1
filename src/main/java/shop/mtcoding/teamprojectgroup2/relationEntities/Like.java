package shop.mtcoding.teamprojectgroup2.relationEntities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Data
@Table(name = "like_tb")
@Entity
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column
    Integer userId;

    @Column
    Integer noticeId;

    @Builder
    public Like(Integer id, Integer userId, Integer noticeId) {
        this.id = id;
        this.userId = userId;
        this.noticeId = noticeId;
    }

}
