# 스프링부트
( Src / pom.xml / 여러 설정파일들 )

hello-spring
├── .mvn
├── src          ← 목록 덕분에 다운로드된 기능들을 실제로 사용하며 코드 작성
├── pom.xml      ← 어떤 기능을 쓸지 적어놓은 목록
├── HELP.md
└── 기타 설정 파일들

=> pom.xml에 기능들의 목록을 적어놓고 src에서 기능들을 사용해서 코드작성
( 실제 기능들이 pom.xml에 있는건 아니고 목록을 저장)


// 애너테이션
@SpringBootApplication - 이 클래스가 시작점임을 알려줌
@RestController - 이 클래스는 API요청을 처리하는 곳임을 알려줌
@GetMapping - 누군가 Get방식으로 요청을 보내면 메서드 실행
@PostMapping - 누군가 Post방식으로 요청을 보내면 메서드 실행
@PathVariable - 주소 자체에 박힌 값을 변수로 꺼내서 쓰게해줌
@RequestParam - 주소 뒤 ?key=값 형태로 전달된 값을 변수로 꺼내서 쓰게해줌
@RequestBody - JSON을 객체로 변환받기


// HTTP 메서드
Get = 가져오기 (데이터조회할때)
Post = 저장하기 (새 데이터등록할때)
Put = 수정
Delete = 삭제


// JSON
프로그램끼리 데이터를 주고받을대 쓰는 공통형식 { “키” : “값” } 형태
=> 객체를 응답으로 반환하면, 스프링부트가 자동으로 JSON형태로 변환해줌
+ 해당 클래스객체에 Getter메서드(반환해주는메서드)가 있어야함
1.Get응답 - 객체를 생성할때 값 주고 반환하면, 객체가 JSON형식으로 자동변환되어 응답
2. Post요청받기 - 사용자가 JSON을 보내면, @RequestBody가 그 JSON을 객체로 변환해서 매개변수로받음


// 전체구조
HelloSpringApplication.java   → 서버 시작 파일
Student.java                           → 전송할 데이터 타입 파일 (DTO)
StudentController.java            → 요청을 받는 파일 (Controller)
StudentService.java               → 실제 로직을 처리하는 파일 (Service)

1. HelloSpringApplication이 서버를 켬
2. 누군가 요청을 보냄 (예: POST /students)
3. StudentController가 그 요청을 받음
4. StudentController가 StudentService한테 일을 시킴
5. StudentService가 Student.java 형태의 데이터를 List에 저장/조회/검색
6. 결과가 다시 Controller를 거쳐 응답으로 나감

=> 정리
전원 스위치(Application) → 카운터 직원(Controller) → 주방장(Service) → 식재료 명세서(Student)



# DB연동
Controller  ->  Service  ->  Repository  ->  MySQL

1. Controller 요청 받는 파일

2. Service 실제 로직을 처리하는 파일

3. Repository DB와 직접 대화하는 파일 (저장/조회/삭제 실행)
Service가 저장,검색 시키면, Repository가 실제로 MySQL에 접근해서 작업수행

4. MySQL 실제 데이터베이스 (실제 데이터저장)
전송할 데이터타입파일 Student.java파일을 데이터베이스에 테이블로 생성


Ex) 실행예시
1. Postman으로 Post요청 (Controller가 받음)
2. Controller가 Service한테 추가해줘
3. Service가 Repository한테 저장해줘
4. Repository가 실제 MySQL에 데이터 저장


+ DB연동시 추가/수정한 부분
1. Pom.xml에 DB도구세트, Java와MySQL이 연결되게 해주는 케이블 라이브러리 추가
2. Application.properties에 DB연결 정보 입력
3. 데이터클래스(Student.java)를 DB테이블과 연결되는 형태의 Entity로 변경
4. Repository 인터페이스만들어 JpaRepostiroy상속받아 기능 사용하도록
5. Service에서 List대신 Repository사용하도록 Autowired사용
6. Controller도 Spring이 관리하게 Autowired사용
