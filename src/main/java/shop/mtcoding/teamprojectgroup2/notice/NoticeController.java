package shop.mtcoding.teamprojectgroup2.notice;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    // 완료ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
    @GetMapping("/bizRegistrationForm")
    public String bizRegistrationForm() {
        return "/bizBoard/bizRegistrationForm";
    }

    @PostMapping("/notice/bizRegistration")
    public String bizRegistration(NoticeRequestDTO.SaveDTO saveDTO) {
        noticeService.공고등록(saveDTO, 1);

        return "redirect:/manageNotice";
    }

    // 공고관리ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
    @GetMapping("/manageNoticeForm")
    public String manageNoticeForm() {
        return "/bizBoard/manageNoticeForm";
    }

    // @PostMapping("/notice/manageNotice")
    // public String manageNotice(@RequestParam(defaultValue = "0" ) Integer page,HttpServletRequest request) {
    //     Page<Notice> noticePG = noticeService.공고목록보기(page);
    //     request.setAttribute("noticePG", noticePG);
    //     return "redirect:/manageNotice";
    // }




}
