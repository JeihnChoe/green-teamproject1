package shop.mtcoding.teamprojectgroup2.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import shop.mtcoding.teamprojectgroup2.resume.ResumeRequestDTO;

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

    @PostMapping("/userjoin")
    public void userJoin() {
        userService.유저회원가입();
    }

    // 완료
    @GetMapping("/loginForm")
    public String loginForm() {
        return "/userBoard/loginForm";
    }

    @PostMapping("/userlogin")
    public void userLogin() {
        userService.유저로그인();
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
    @GetMapping("/writeResumeForm")
    public String writeResumeForm() {
        return "/userBoard/writeResumeForm";
    }

    // 완료
    @GetMapping("/manageResumeForm")
    public String manageResume() {
        return "/userBoard/manageResumeForm";
    }

    // 완료
    @GetMapping("/matchUp")
    public String matchUp() {
        return "/biz";

    }

}
