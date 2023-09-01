package shop.mtcoding.teamprojectgroup2.biz;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BizController {
//공고상세
    @GetMapping("/bizDetail")
    public String biz() {

        return "/bizBoard/bizDetail";
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
