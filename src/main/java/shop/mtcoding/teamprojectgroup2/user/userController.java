package shop.mtcoding.teamprojectgroup2.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class userController {

    @GetMapping("/resume")
    public String resume() {
        return "/userBoard/resume";
    }

    @GetMapping("/searchJob")
    public String searchJob() {
        return "/userBoard/searchJob";
    }

    @GetMapping("/bizDetail")
    public String biz() {

        return "/bizBoard/bizDetail";
    }

    @GetMapping("/loginForm")
    public String login() {
        return "/userBoard/loginForm";
    }

    @GetMapping("/joinForm")
    public String join() {
        return "/userBoard/joinForm";
    }

    @GetMapping("/write/resume")
    public String writeResume() {
        return "/userBoard/writeResume";
    }

    @GetMapping("/bizRegistration")
    public String Registration() {
        return "/bizBoard/bizRegistration";

    }

    @GetMapping("/bizmain")
    public String bizMain() {
        return "/bizBoard/bizMain";
    }

}
