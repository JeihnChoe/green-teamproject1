package shop.mtcoding.teamprojectgroup2.relationEntities;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tech_tb")
public class Tech {
    Integer id;
    String techname;
}
