package com.example.hello_spring;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
public class StudentController {

    @Autowired // 이 변수에 들어갈 객체를 Spring이 자동으로 만들어서 연결해줘
    private StudentService studentService; // StudentService타입의 변수를 선언
    // => StudentService타입 변수를 선언해서 AutoWired로 객체 생성해서 Repository에 연결

    // 학생 추가
    @PostMapping("/students")
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }

    // 전체 목록 조회
    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    // 이름 검색
    @GetMapping("/students/{name}")
    public Student findByName(@PathVariable String name){
        return studentService.findByName(name);
    }

    // 점수 수정
    @PutMapping("/students/{name}")
    // RequestParam이면 /students/김하늘?score=90 이런식으로 주소창에 요청된 값을 변수로 꺼내 쓸수있음
    // RequestBody면 body영역에 JSON형태로 요청된 값을 객체로 변환받아 꺼내 쓸수있음
    public String updateScore(@PathVariable String name, @RequestParam int score) {
        return studentService.updateScore(name, score);
    }

    // 학생 삭제
    @DeleteMapping("/students/{name}")
    public String deleteStudent(@PathVariable String name) { // 삭제완료 메시지 반환하기때매 문자열 반환
        return studentService.deleteStudent(name);
    }
}

// => 요청을 받는 Controller 파일