package com.example.hello_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

// 학생 관련 실제 로직을 처리하는 서비스 클래스
@Service
public class StudentService {

    @Autowired // 이 변수에 들어갈 객체를 Spring이 자동으로 만들어서 연결해줘
    private StudentRepository studentRepository; // StudentRepository타입의 변수를 선언
    // => StudentRepository타입 변수를 선언해서 AutoWired로 객체 생성해서 Repository에 연결

    // 학생 추가하는 메서드
    public void addStudent(Student student){
        studentRepository.save(student); // Repository에 저장 요청
    }

    // 전체 학생 목록 가져오는 메서드
    public List<Student> getAllStudents(){
        return studentRepository.findAll(); // Repository에 전체 조회 요청
    }

    // 이름으로 검색하는 메서드
    public Student findByName(String name) {
        List<Student> allStudents = studentRepository.findAll(); // 일단 전체 가져오기
        for (Student s : allStudents) { // allStudents안에 있는 것들을 Student타입의 s로 하나씩 꺼내어 반복
            if (s.getName().equals(name)) { // 문자열을 비교해서 같은 내용인지 비교
                return s;
            }
        }
        return null; // 없으면 null
    }

    // 점수 수정하기
    public String updateScore(String name, int newScore) {
        Student student = findByName(name); // 점수를 수정할 학생 객체 찾기
        if (student != null) {
            student.setScore(newScore); // 점수를 newScore로 바꾸기
            studentRepository.save(student);
            return "수정 완료";
        }
        return "학생을 찾을 수 없습니다.";
    }

    // 학생 삭제하기
    public String deleteStudent(String name) {
        Student student = findByName(name); // 삭제할 객체 찾기
        if (student != null) {
            studentRepository.delete(student); // Repository한테 삭제 요청
            return "삭제 완료";
        }
        return "학생을 찾을 수 없습니다.";
    }
}

// => 실제 로직 처리하는곳