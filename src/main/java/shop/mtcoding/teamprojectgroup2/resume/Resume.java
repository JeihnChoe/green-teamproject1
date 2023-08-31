package shop.mtcoding.teamprojectgroup2.resume;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

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

    @Column(nullable = false, length = 10000)
    Integer user_id;

    @Column(nullable = false)
    boolean open;

}
