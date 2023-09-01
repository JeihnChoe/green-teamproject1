package shop.mtcoding.teamprojectgroup2.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import shop.mtcoding.teamprojectgroup2.resume.Resume;
import shop.mtcoding.teamprojectgroup2.resume.ResumeRequestDTO;
import shop.mtcoding.teamprojectgroup2.resume.ResumeService;

@Controller
public class UserController {

    // DI(의존성주입)
    @Autowired
    private UserService userService;

    @Autowired
    private HttpSession session;

    @Autowired
    private ResumeService resumeService;

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
    public String manageResumeForm(HttpServletRequest request) {
        User sessionUser = (User) session.getAttribute("sessionUser");
        Resume resume = resumeService.이력서목록보기(sessionUser.getId());
        request.setAttribute("resume", resume);
        return "/userBoard/manageResumeForm";
    }

    // 완료
    @GetMapping("/matchUp")
    public String matchUp() {
        return "/biz";

    }

}
