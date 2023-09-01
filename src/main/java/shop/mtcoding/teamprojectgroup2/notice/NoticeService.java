package shop.mtcoding.teamprojectgroup2.notice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import shop.mtcoding.teamprojectgroup2.biz.Biz;

@Service
public class NoticeService {
    

    @Autowired
    private NoticeRepository noticeRepository;


    @Transactional
    public void 공고등록(NoticeRequestDTO.SaveDTO saveDTO, int sessionBizId) {
        
        Biz biz = Biz.builder()
        .id(1)
        .managerEmail(saveDTO.getManagerEmail())
        .managerName(saveDTO.getManagerName())
        .managerTel(saveDTO.getManagerTel())
        .build();

        Notice notice =  Notice.builder()
        .title(saveDTO.getTitle())
        .content(saveDTO.getContent())
        .career(saveDTO.getCareer())
        .jobGroup(saveDTO.getJobGroup())
        .map(saveDTO.getMap())
        .deadLine(saveDTO.getDeadLine())
        .biz(biz)
        .build();

        noticeRepository.save(notice);
    }

    
    // public Page<Notice> 공고목록보기(Integer page) {
    //     Pageable pageable = PageRequest.of(page, 10, Sort.Direction.DESC, "id");
    //     return noticeRepository.findAll(pageable);
    // }


}
