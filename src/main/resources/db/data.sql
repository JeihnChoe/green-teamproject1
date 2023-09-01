-- user_tb 더미데이터------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------>

insert into user_tb(login_id, password, email, username, address, tel, birth) values('ssar', '1234', 'ssar@nate.com', '김쌀', '부산광역시 부산진구 부전동', '010-1234-5677', 1997);
insert into user_tb(login_id, password, email, username, address, tel, birth) values('cos', 'qwer', 'cos@nate.com', '김코스', '서울특별시 강남구', '010-1111-2222', 1995);
insert into user_tb(login_id, password, email, username, address, tel, birth) values('love', '1234', 'ssar@nate.com', '김러브', '부산광역시 해운대구', '010-1234-5677', 1999);

-- resume_tb 더미데이터------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
insert into resume_tb(title, content, user_id, school, education, career, open, etc, link1) values('내일부터 당장 일할 수 있습니다!', '안녕하십니까, 저는 동의대학교를 졸업하였고, 경력은 없으며 나이는 28세 입니다. 비록 비전공자이지만 동영상 강의로 이론을 배우고, 인터넷으로 스터디를 모집하여서 프로젝트를 통해 직접 코딩을 해볼 수 있었습니다. 저는 정말 착하고 순하며, 하라는 일은 모두 다 할수있습니다. 저를 뽑아주세요ㅎㅎ', 1, '대학교 졸업','동의대학교 컴퓨터공학과', '신입', false, '기타 없음', 'http://www.naver.com');
insert into resume_tb(title, content, user_id, school, education, career, open, etc, link1) values('저는 학점이 4.5인 만점자입니다!', '안녕하십니까, 저는 동의대학교 광고홍보학과를 졸업하여 광고를 제작하고 싶습니다. 이론은 물론이거와 독특한 생각들과 창의적인 아이디어로 이제껏 낸 프로젝트들이 수없이 많습니다. 제 git주소로 들어가보시면 많은 결과물을 보실 수 있을 것입니다.', 1, '대학교 졸업','동의대학교 광고홍보학과', '신입', false, '기타 없음', 'http://www.naver.com');
insert into resume_tb(title, content, user_id, school, education, career, open, etc, link1) values('저는 서울대학교 재학중인 학생입니다.', '안녕하십니까, 저는 제목으로만 말하겠습니다. 이상입니다.', 2, '대학교 졸업','서울대학교 컴퓨터공학과', '신입', true, '기타 없음', 'http://www.naver.com');
insert into resume_tb(title, content, user_id, school, education, career, open, etc, link1, link2, link3) values('경력자로 부딪히자!', '안녕하십니까, 저는 대학교를 다니진 않았지만, 실무 경험이 있는 사람입니다. 대학 졸업생들보다 3년이나 실무로 회사에서 경험한 제가 낫지 않을까요?', 3, '대학교 졸업','동의대학교 컴퓨터공학과', '신입', true, '어쨌든 일했음', '네이버블로그.com', 'github.com', '노션.com');


-- biz_tb 더미데이터------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

insert into biz_tb(login_id, password, bizname, address, biz_info, manager_name, manager_tel, manager_email) 
values('samsung', '1234',  '삼성', '경기 수원시 영통구 삼성로 129', '우리는 즐겁고 열정이 넘치는 근무환경 속에서 임직원들의 성장과 자기계발을 통해 새로운 가치를 만들어 내고 있습니다.
이 곳에서 많은 사람들의 삶을 바꿀 수 있는 새로운 혁신의 기회를 찾아보세요.','진성훈','010-1234-5678','ss@naver.com');
insert into biz_tb(login_id, password, bizname, address, biz_info, manager_name, manager_tel, manager_email) 
values('apple', '1234',  '애플', '서울특별시 영등포구 영중로 15 타임스퀘어 지하1층', 
'Apple Shops는 엄선된 Apple 대리점 및 기타 Apple Retail Stores 내에 위치한 Apple이 디자인한 아울렛입니다. 대부분의 Apple 매장에는 고객님을 위한 최적의 솔루션을 찾을 수 있도록 도와 드리기 위해 교육을 받은 Apple 솔루션 컨설턴트가 배치되어 있습니다.',
'조소현','010-5678-1234','apple@naver.com');
insert into biz_tb(login_id, password, bizname, address, biz_info, manager_name, manager_tel, manager_email) 
values('tesla', '1234',  '테슬라', '캘리포니아 팔로 알토 94304 3500 Deer Creek Rd', 
'테슬라(영어: Tesla)는 미국의 전기자동차 회사이다. 2003년, 마틴 에버하드(CEO)와 마크 타페닝(CFO)가 창업했다. 2004년 페이팔의 최고경영자이던 일론 머스크가 투자자로 참여했다. 회사 이름은 물리학자이자 전기공학자인 니콜라 테슬라의 이름을 따서 지었다. 2010년 6월 나스닥에 상장되었다.',
'김하율','010-1278-3456','tesla@naver.com');


-- notice_tb 더미데이터------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

-- insert into notice_tb(title, content, biz_id, jobGroup, career,map) 
-- values('오프라인 Md','[지금 바로 지원하세요!]• 제출 서류: 경력 중심의 이력서 (필수), 포트폴리오 (선택)',
-- 1,
-- '프론트엔드',
-- '1', 
-- '경기 수원시 영통구 삼성로 129');

-- insert into notice_tb(title, content, biz_id, jobGroup, career,map) 
-- values('온라인 MD','베이컨의 온라인 세일즈 채널을 함께 꾸려 나갈 담당자를 찾습니다.',
-- 2,
-- '프론트엔드',
-- '1', 
-- '경기 수원시 영통구 삼성로 129');


-- insert into notice_tb(title, content, biz_id, jobGroup, career,map) 
-- values('라이브커머스 PD','주요업무
-- •라이브커머스 방송 기획 및 연출 
-- •외주업체 관리 및 커뮤니케이션
-- •LC팀 매니지먼트',
-- 3,
-- '프론트',
-- '1', 
-- '경기 수원시 영통구 삼성로 129');


-- apply_tb 더미데이터------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
insert into apply_tb(resume_id, notice_id, pass) values(1, 1, '대기중');
insert into apply_tb(resume_id, notice_id, pass) values(2, 2, '대기중');
insert into apply_tb(resume_id, notice_id, pass) values(3, 1, '불합격');
insert into apply_tb(resume_id, notice_id, pass) values(4, 1, '합격');

-- bookmark_tb 더미데이터 ---------------------------------------------------------------------------------------------------------------------------------------------------------------------

insert into bookmark_tb(biz_id, resume_id) values(1,2);
insert into bookmark_tb(biz_id, resume_id) values(2,3);
insert into bookmark_tb(biz_id, resume_id) values(3,1);

-- like_tb 더미데이터------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
insert into like_tb(user_id, notice_id) values(1, 1);
insert into like_tb(user_id, notice_id) values(1, 3);
insert into like_tb(user_id, notice_id) values(2, 2);
insert into like_tb(user_id, notice_id) values(3, 1);
insert into like_tb(user_id, notice_id) values(3, 3);

--tech_tb 더미데이터 ---------------------------------------------------------------------------------------------------------------------------------------------------------------------

insert into tech_tb(techname) values ('자바');


 