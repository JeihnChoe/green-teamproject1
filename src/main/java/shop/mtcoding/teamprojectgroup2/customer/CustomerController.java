package shop.mtcoding.teamprojectgroup2.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {

    @Autowired


    @GetMapping("/searchResult")
    public String searchResult() {
        return "/customerBoard/searchResult";

    }

    @GetMapping("/customerBoard")
    public String customerBoard() {
        return "/customerBoard/customerBoard";
    }

    public String question() {
        return "/customerBoard/customersubmitQuestion";
    }

}
