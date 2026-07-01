public class 생성자 {
    public static void main(String[] args) {
        // 생성자로 한 줄에 객체 생성 + 값 입력
        Student2 student1 = new Student2("김하늘", 90);
        Student2 student2 = new Student2("이철수", 85);

        student1.printInfo();
        student2.printInfo();
    }
}

class Student2 {
    String name;
    int score;

    // 생성자 : 객체가 new로 만들어질때 자동으로 실행되는 특별한 메서드 => 객체 처음 만들때 필요한 초기값을 자동설정해주는느낌
    // 1. 클래스 이름과 동일
    // 2. 반환타입X
    // 3. 객체가 new로 만들어질때 자동실행
    Student2(String name, int score) {
        this.name = name; // this로 자기참조
        this.score = score;
    }

    void printInfo() {
        System.out.println(name + "의 점수: " + score);
    }
}