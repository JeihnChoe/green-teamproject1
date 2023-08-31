package shop.mtcoding.teamprojectgroup2.biz;


import org.springframework.data.jpa.repository.JpaRepository;

/*
 * save(), findById(), findAll(), count(), deleteById()
 */
// 스프링이 실행될 때, BoardRepository의 구현체가 IoC 컨테이너에 생성된다
public interface BizRepository extends JpaRepository<Biz,Integer>{




}
