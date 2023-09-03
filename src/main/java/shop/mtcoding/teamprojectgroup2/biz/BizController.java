package shop.mtcoding.teamprojectgroup2.biz;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BizController {
    @Autowired
    private BizService bizService;
    @Autowired
    private HttpSession session;

    @GetMapping("/manageNotice")
    public String manageNotice() {
        return "/bizBoard/manageNotice";
    }

    @GetMapping("/bizDetail")
    public String biz() {

        return "/bizBoard/bizDetail";
    }

    @GetMapping("/bizRegistration")
    public String Registration() {
        return "/bizBoard/bizRegistration";
    }

    @GetMapping("/bizMain")
    public String bizMain() {
        return "/bizBoard/bizMain";
    }

    @GetMapping("/bizTrueMain")
    public String bizTrueMain() {
        return "/bizBoard/bizTrueMain";
    }

    @GetMapping("/searchUser")
    public String searchUser() {
        return "/bizBoard/searchUser";

    }

    @GetMapping("/bizLoginForm")
    public String loginForm() {
        return "/bizBoard/bizLoginForm";

    }

    @GetMapping("/bizJoinForm")
    public String joinForm() {
        return "/bizBoard/bizJoinForm";

    }

    @PostMapping("/bizuserJoin")
    public String bizuserJoin(BizRequestDTO.JoinDTO joinDTO) {
        bizService.기업유저회원가입(joinDTO);

        return "/bizBoard/bizLoginForm";
    }

    @PostMapping("/bizuserLogin")
    public String bizLogin(BizRequestDTO.LoginDTO loginDTO) {
        Biz sessionUser = bizService.기업유저로그인(loginDTO);
        session.setAttribute("sessionUser", sessionUser);

        System.out.println("테스트: " + sessionUser.getLoginId());
        return "/bizBoard/bizMain";
    }

}
