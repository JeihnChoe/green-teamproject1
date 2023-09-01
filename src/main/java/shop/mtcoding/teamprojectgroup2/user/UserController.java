package shop.mtcoding.teamprojectgroup2.user;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import shop.mtcoding.teamprojectgroup2.user.UserRequestDTO.JoinDTO;

@Controller
public class UserController {

    // DI(의존성주입)
    @Autowired
    private UserService userService;
    @Autowired
    private HttpSession session;

    // 완료
    @GetMapping("/joinForm")
    public String joinForm() {
        return "/userBoard/joinForm";
    }

    // 완료
    @PostMapping("/userjoin")
    public String userJoin(UserRequestDTO.JoinDTO joinDTO) {
        userService.유저회원가입(joinDTO);

        return "/userBoard/loginForm";
    }

    // 완료
    @GetMapping("/loginForm")
    public String loginForm() {
        return "/userBoard/loginForm";
    }

    // 완료
    @PostMapping("/userlogin")
    public String userLogin(UserRequestDTO.LoginDTO loginDTO) {
        User sessionUser = userService.유저로그인(loginDTO);
        session.setAttribute("sessionUser", sessionUser);

        System.out.println("테스트: " + sessionUser.getLoginId());
        return "redirect:/";
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
        return "/userBoard/manageResume";

    }

}
