package shop.mtcoding.teamprojectgroup2.notice;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
public class NoticeRequestDTO {
    
    @Getter@Setter
    public static class SaveDTO{
        private String title;
        private String content;
        private String managerEmail;
        private String managerName;
        private String managerTel;
        private String jobGroup;
        private String map;
        private String career;
        private String deadLine;


        

    }
    
    

}
