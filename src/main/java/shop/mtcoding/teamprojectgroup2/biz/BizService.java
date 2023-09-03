package shop.mtcoding.teamprojectgroup2.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BizService {
    @Autowired
    BizRepository bizRepository;

    @Transactional
    public Biz 기업유저로그인(BizRequestDTO.LoginDTO loginDTO) {
        Biz biz = bizRepository.findByUsername(loginDTO.getLoginId());

        // // 1. 유저네임 검증
        // if (user == null) {
        // throw new MyException("유저네임이 없습니다");
        // }

        // // 2. 패스워드 검증
        // if (!user.getPassword().equals(loginDTO.getPassword())) {
        // throw new MyException("패스워드가 잘못되었습니다");
        // }

        // 3. 로그인 성공
        return biz;
    }

    @Transactional
    public void 기업유저회원가입(BizRequestDTO.JoinDTO joinDTO) {
        Biz biz = Biz.builder()
                .loginId(joinDTO.getLoginId())
                .password(joinDTO.getPassword())
                .managerEmail(joinDTO.getEmail())
                .build();
        bizRepository.save(biz);
    }

}
