package shop.mtcoding.teamprojectgroup2.resume;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import shop.mtcoding.teamprojectgroup2.user.User;

@Controller
public class ResumeController {

    @Autowired
    private ResumeService resumeService;

    @Autowired
    private HttpSession session;

    // 완료
    @PostMapping("/resume/writeResume")
    public String writeResume(ResumeRequestDTO.SaveDTO saveDTO) {
        User sessionUser = (User) session.getAttribute("sessionUser");
        resumeService.이력서작성(saveDTO, 1);
        return "/userBoard/manageResumeForm";
    }

}
