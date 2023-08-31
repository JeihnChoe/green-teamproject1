package shop.mtcoding.teamprojectgroup2.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    // DI(의존성주입)
    @Autowired
    private UserService userService;

    // 완료
    @GetMapping("/joinForm")
    public String joinForm() {
        return "/userBoard/joinForm";
    }

    @PostMapping("/join")
    public void join() {
        userService.회원가입();
    }

    // 완료
    @GetMapping("/loginForm")
    public String loginForm() {
        return "/userBoard/loginForm";
    }

    @PostMapping("/login")
    public void login() {
        userService.로그인();
    }

    // 완료
    @GetMapping("/resumeForm")
    public String resumeForm() {
        return "/userBoard/resumeForm";
    }

    // 완료
    @GetMapping("/searchJob")
    public String searchJob() {

        return "/userBoard/searchJob";
    }

    // 완료
    @GetMapping("/writeResume")
    public String writeResume() {
        return "/userBoard/writeResume";
    }

    // 완료
    @GetMapping("/manageResume")
    public String manageResume() {
        return "/userBoard/manageResume";
    }

    // 완료

    @GetMapping("/matchUp")
    public String matchUp() {
        return "/biz";

    }

}
