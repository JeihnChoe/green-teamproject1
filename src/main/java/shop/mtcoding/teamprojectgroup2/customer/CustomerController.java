package shop.mtcoding.teamprojectgroup2.customer;

import org.springframework.web.bind.annotation.GetMapping;

public class CustomerController {
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
