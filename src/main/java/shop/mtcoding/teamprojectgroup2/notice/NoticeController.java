package shop.mtcoding.teamprojectgroup2.notice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NoticeController {

    @Autowired
    private NoticeService noticeService;


    //완료
    @GetMapping("/bizRegistrationForm")
    public String bizRegistrationForm() {
        return "/bizBoard/bizRegistrationForm";
    }

    @PostMapping("/notice/bizRegistration")
    public String bizRegistration(NoticeRequestDTO.SaveDTO saveDTO){
     noticeService.공고등록(saveDTO,1);
     
        return "redirect:/";

      
        
       

    }
    
}
