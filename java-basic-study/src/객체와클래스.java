// 메인 함수 실행메서드
public class 객체와클래스 {
    // 프로그램 시작 시 가장 먼저 실행되는 메인메서드
    public static void main(String[] args) {
        // Student 클래스로 student1객체 만들기
        Student student1 = new Student();
        student1.name = "김하늘";
        student1.score = 90;

        // Student 클래스로 student2객체 만들기
        Student student2 = new Student();
        student2.name = "이철수";
        student2.score = 85;

        // 객체의 클래스안에 출력메서드 호출
        student1.printInfo();
        student2.printInfo();

        // 객체의 클래스안에 등급계산메서드 호출
        System.out.println(student1.name+"의 등급 : "+student1.getGrade());
        System.out.println(student2.name+"의 등급 : "+student2.getGrade());
    }
}

// 학생의 이름과 점수를 저장하는 클래스(설계도)
class Student {
    String name; // 학생의 이름
    int score; // 학생의 점수

    // 클래스안에 출력메서드
    void printInfo(){
        System.out.println(name+"의 점수:"+score);
    }

    // 클래스안에 등급계산메서드
    String getGrade(){
        if (score>=90){
            return "A";
        }
        else if (score>=80){
            return "B";
        }
        else {
            return "C";
        }
    }
}