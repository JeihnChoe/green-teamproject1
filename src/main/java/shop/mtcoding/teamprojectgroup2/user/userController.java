package shop.mtcoding.teamprojectgroup2.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class userController {

    @GetMapping("/resume")

    public String resume() {
        return "/userBoard/resume";
    }

    @GetMapping("/loginForm")
    public String login() {
        return "/userBoard/loginForm";
    }

    @GetMapping("/joinForm")
    public String join() {
        return "/userBoard/joinForm";
    }
}
