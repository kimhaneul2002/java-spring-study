package com.example.hello_spring;

import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository라는 기존에 만들어진 기능세트를 상속받는다
// Student타입의 데이터를 다루고, Id는 Long타입이다
public interface StudentRepository extends JpaRepository<Student, Long> {

}


// => 기존에 있는 JpaReposiotry 기능세트를 상속받는 인터페이스 틀을 사용
//    여기에 조회,검색,삭제 등 기능이 다 있으니까 내용은 없어도됨