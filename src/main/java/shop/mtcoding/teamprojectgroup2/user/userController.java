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

    @GetMapping("/customerBoard")
    public String customerBoard() {
        return "/customerBoard/customerBoard";
    }

    @GetMapping("/manageNotice")
    public String manageNotice() {
        return "/bizBoard/manageNotice";
    }

    @GetMapping("/writeResume")
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

    @GetMapping("/bizTrueMain")
    public String bizTrueMain() {
        return "/bizBoard/bizTrueMain";
    }


    @GetMapping("/searchUser")
    public String searchUser() {
        return "/bizBoard/searchUser";

    }
    @GetMapping("/manageResume")
    public String manageResume() {
        return "/userBoard/manageResume";
    }

    @GetMapping("/customersubmitquestion")
    public String question() {
        return "/customerBoard/customersubmitQuestion";
    }

    @GetMapping("/userRevise")
    public String userRevise() {
        return "/userBoard/userRevise";
    }


    @GetMapping("/machup")
    public String machup() {
        return "/userBoard/machup";
      
    @GetMapping("/searchresult")
    public String searchResult() {
        return "/customerBoard/searchResult";

    }

}
