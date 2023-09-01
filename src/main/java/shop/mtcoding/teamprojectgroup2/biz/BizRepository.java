package shop.mtcoding.teamprojectgroup2.biz;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BizRepository extends JpaRepository<Biz, Integer> {
    @Query(value = "select * from biz_tb where login_id = :login_id", nativeQuery = true)
    Biz findByUsername(@Param("login_id") String loginId);
}
