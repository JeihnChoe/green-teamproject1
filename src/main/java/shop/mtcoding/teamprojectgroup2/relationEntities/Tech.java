package shop.mtcoding.teamprojectgroup2.relationEntities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;
import shop.mtcoding.teamprojectgroup2.user.User;

@Data
@Entity
@Table(name = "tech_tb")
public class Tech {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String techname;

    @ManyToOne(fetch = FetchType.LAZY)
    User user;

    @Builder
    public Tech(Integer id, String techname) {
        this.id = id;
        this.techname = techname;
    }
}
