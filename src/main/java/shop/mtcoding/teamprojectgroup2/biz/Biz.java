package shop.mtcoding.teamprojectgroup2.biz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

  @Column(length = 10000)
  String bizname;

  @Column(length = 10000)
  String managerName;

  @Column(length = 10000)
  String managerTel;

  @Column(length = 10000)
  String managerEmail;

  @Column(length = 10000)
  String address;

  @Column(length = 10000)
  String bizInfo;

  @Builder
  public Biz(Integer id, String loginId, String password, String bizname, String managerName, String managerTel,
      String managerEmail, String address, String bizInfo) {
    this.id = id;
    this.loginId = loginId;
    this.password = password;
    this.bizname = bizname;
    this.managerName = managerName;
    this.managerTel = managerTel;
    this.managerEmail = managerEmail;
    this.address = address;
    this.bizInfo = bizInfo;

  }
}
