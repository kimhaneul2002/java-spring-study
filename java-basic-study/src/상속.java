public class 상속 {
    public static void main(String[] args) {
        // 객체 생성
        Student3 student = new Student3("김하늘", 90);

        student.printName();   // 부모 클래스 기능
        student.printScore();  // 자식 클래스 기능
    }
}

// 부모 클래스 (모든 사람이 공통으로 가지는 것)
class Person {
    String name;

    // 생성자로 객체 자기이름참조
    Person(String name) {
        this.name = name;
    }

    void printName() {
        System.out.println("이름: " + name);
    }
}

// 자식 클래스 (Person을 상속받음 + 학생만의 특징 추가)
class Student3 extends Person {
    int score;

    // 생성자로 객체 자기 이름,점수 참조
    Student3(String name, int score) {
        super(name); // 부모 클래스의 생성자 호출
        this.score = score;
    }

    void printScore() {
        System.out.println("점수: " + score);
    }
}