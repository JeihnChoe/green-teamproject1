package shop.mtcoding.teamprojectgroup2.biz;

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
@Table(name = "biz_tb")
@Entity
public class Biz {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Integer id;

  @Column(nullable = false, length = 10000)
  String loginId;

  @Column(nullable = false, length = 10000)
  String password;

  @Column(nullable = false, length = 10000)
  String bizname;

  @Column(nullable = false, length = 10000)
  String managerName;

  @Column(nullable = false, length = 10000)
  String managerTel;

  @Column(nullable = false, length = 10000)
  String managerEmail;

  @Column(nullable = true, length = 10000)
  String address;

  @Column(nullable = true, length = 10000)
  String bizInfo;

  Timestamp createdAt;

  RelationTechs relationTechs;
}
