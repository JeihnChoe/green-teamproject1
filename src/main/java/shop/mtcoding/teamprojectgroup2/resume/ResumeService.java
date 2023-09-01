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
    public void 이력서작성(ResumeRequestDTO.SaveDTO saveDTO, Integer sessionId) {
        User user = User.builder().id(1).build();
        Resume resume = Resume.builder()
                .title(saveDTO.getTitle())
                .content(saveDTO.getContent())
                .user(user)
                .career(saveDTO.getCareer())
                .education(saveDTO.getEducation())
                .school(saveDTO.getSchool())
                .etc(saveDTO.getEtc())
                .link1(saveDTO.getLink1())
                .link2(saveDTO.getLink2())
                .link3(saveDTO.getLink3())
                .open(false)
                .build();
        resumeRepository.save(resume);
    }

    public static Resume 이력서목록보기(Integer id) {
        return resumeRepository.findById(id).get();
    }

}
