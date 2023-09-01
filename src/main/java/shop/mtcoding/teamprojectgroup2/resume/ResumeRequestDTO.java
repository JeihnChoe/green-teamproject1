package shop.mtcoding.teamprojectgroup2.resume;

import lombok.Getter;
import lombok.Setter;

public class ResumeRequestDTO {

    @Getter
    @Setter
    public static class SaveDTO {
        private String title;
        private String content;
        private String career;
        private String education;
        private String school;
        // private Tech tech;
        private String etc;
        private String link1;
        private String link2;
        private String link3;

    }
}
