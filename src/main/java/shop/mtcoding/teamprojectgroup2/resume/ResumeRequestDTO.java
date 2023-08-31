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

    }
}
