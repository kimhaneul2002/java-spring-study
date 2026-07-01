package com.example.hello_spring;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

// 학생 클래스 - DB 테이블과 연결되는 Entity
@Entity
public class Student{

    @Id // 이 필드가 고유 번호 역할을 한다 표시
    @GeneratedValue // 번호는 자동으로 1,2,3... 순서대로 매겨줘라는 뜻
    Long id; // 고유번호 (자동생성)

    String name;
    int score;

    // 생성자
    Student(String name, int score){
        this.name=name;
        this.score=score;
    }

    // JSON을 객체로 변환할때 값 없이 객체를 먼저 만들 수 있는 방법인 빈 생성자 필요
    Student() {
    }

    // Getter메서드 - 고유 번호 Id 가져오기
    public Long getId(){
        return id;
    }

    // Getter 메서드 - 점수 가져오기
    public String getName(){
        return name;
    }
    public int getScore(){
        return score;
    }

    // Setter 메서드 - 점수 바꾸기
    public void setScore(int score) {
        this.score = score;
    }
}

// => 전송할 데이터 타입 파일 (DTO)