// 파일주소경로
package com.example.hello_spring;

// 스프링 기능 가져오기
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 이 클래스가 시작점임
@SpringBootApplication
public class HelloSpringApplication {

    // 프로그램 시작점
	public static void main(String[] args) {
        // 서버 실행 명령 메소드에 이 클래스정보를 인자로 줘서 실행
		SpringApplication.run(HelloSpringApplication.class, args);
	}

}

// 서버 실행 파일