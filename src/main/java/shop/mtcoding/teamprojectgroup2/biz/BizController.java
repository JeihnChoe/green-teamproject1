package shop.mtcoding.teamprojectgroup2.biz;

import org.springframework.web.bind.annotation.GetMapping;

public class BizController {

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

}
