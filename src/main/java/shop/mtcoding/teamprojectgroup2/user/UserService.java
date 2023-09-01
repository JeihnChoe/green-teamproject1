package shop.mtcoding.teamprojectgroup2.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import shop.mtcoding.teamprojectgroup2.user.UserRequestDTO.JoinDTO;
import shop.mtcoding.teamprojectgroup2.user.UserRequestDTO.LoginDTO;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    @Transactional
    public User 유저로그인(LoginDTO loginDTO) {
        User user = userRepository.findByUsername(loginDTO.getLoginId());

        // // 1. 유저네임 검증
        // if (user == null) {
        // throw new MyException("유저네임이 없습니다");
        // }

        // // 2. 패스워드 검증
        // if (!user.getPassword().equals(loginDTO.getPassword())) {
        // throw new MyException("패스워드가 잘못되었습니다");
        // }

        // 3. 로그인 성공
        return user;
    }

    @Transactional
    public void 유저회원가입(UserRequestDTO.JoinDTO joinDTO) {
        User user = User.builder()
                .loginId(joinDTO.getLoginId())
                .password(joinDTO.getPassword())
                .email(joinDTO.getEmail())
                .build();
        userRepository.save(user);
    }

}
