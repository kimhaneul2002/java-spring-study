// 파일주소경로
package com.example.hello_spring;

// 스프링 기능 가져오기
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

// 이 클래스는 API요청을 처리하는 곳임을 알려주는 애너테이션
@RestController
public class HelloController {

    // "/hello"라는 주소를 만들어두고, 누군가 GET방식으로 요청을 보내면 이 메서드를 실행해라 애너테이션
    @GetMapping("/hello")
    public String hello() {
        return "Hello, Spring Boot!";
    }

    // 주소 뒤에 {값}에 어떤 값이든 올수있음
    @GetMapping("/hello/{name}")
    public String helloName(@PathVariable String name) { // 주소 뒤 {name}자리에 들어온 값을, name이라는 변수에 담기
        return name + "님 안녕하세요!";
    }
    // => url 경로에 전달된 값을 @PathVariable로 변수에 값을 담아서 이용

    // 주소 뒤에 '?keyword=값' 형태
    @GetMapping("/search")
    public String search(@RequestParam String keyword){ // 주소 뒤 '?keyword=값' 형태로 들어온 데이터를 keyword변수에 담기
        return "검색어 : " + keyword;
    }
    // => URL 경로 뒤에 쿼리 스트링(?key=value) 형식으로 전달된 값을 @RequestParam으로 변수에 담아서 이용

    // HTTP POST 메서드로 `/join` 주소에 요청이 왔을 때 실행 (데이터를 서버로 보낼 때 사용)
    @PostMapping("/join")
    public String join(){
        return "회원가입완료";
    }
    // => 데이터 조회(GET)가 아닌, 새로운 데이터 등록 및 생성(POST) 요청을 처리하는 매핑 구조

    // "/student"라는 주소를 만들어두고, 누군가 GET방식으로 요청을 보내면 이 메서드를 실행해라 애너테이션
    @GetMapping("/student")
    public Student getStudent(){ // getStudent메서드의 반환타입은 Student클래스타입
        Student student = new Student("김하늘" , 90); // Student클래스 객체 생성
        return student;
    }
    // => url 경로로 GET요청이 오면, 새 Student객체를 만들고 값을 줘서 JSON형식으로 자동변환해서 응답

    // HTTP POST 메서드로 `/student` 주소에 요청이 왔을 때 실행 (데이터를 서버로 보낼 때 사용)
    @PostMapping("/student")
    public String addStudent(@RequestBody Student student){ // Student객체타입의 student를 주는데 Requestbody로 JSON형식으로 자동변환
        return student.getName() + " 님이 등록되었습니다. 점수: " + student.getScore();
    }
    // => url 경로로 POST요청이 오면, 사용자가 보낸 JSON을 Student객체로 변환받아서 응답
}

// => Get, Post 연습 파일