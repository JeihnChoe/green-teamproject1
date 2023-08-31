package shop.mtcoding.teamprojectgroup2.resume;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.mtcoding.teamprojectgroup2.resume.ResumeRequestDTO.SaveDTO;
import shop.mtcoding.teamprojectgroup2.user.User;

@Service
public class ResumeService {

    @Autowired
    private ResumeRepository resumeRepository;

    @Transactional
    public void 이력서작성(SaveDTO saveDTO, Integer sessionId) {
        User user = User.builder().id(sessionId).build();
        Resume resume = Resume.builder()
                .title(saveDTO.getTitle())
                .content(saveDTO.getContent())
                .user(user)
                .open(false)
                .build();
        resumeRepository.save(resume);
    }

}
