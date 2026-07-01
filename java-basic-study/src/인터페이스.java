public class 인터페이스 {
    public static void main(String[] args) {
        Fish dog = new Fish("물고기");
        Bird bird = new Bird("짹짹이");

        dog.move();
        bird.move();
    }
}

// 1. 인터페이스 : "움직일 수 있다"는 약속만 정의
interface Movable {
    void move(); // 메서드 이름만 있고, 내용(구현)은 없음
}


// 2. 인터페이스 구현 클래스

class Fish implements Movable {
    String name;

    Fish(String name) {
        this.name = name;
    }

    // 인터페이스의 약속을 실제로 구현 (오버라이딩 필수)
    @Override
    public void move() {
        System.out.println(name + "가 헤엄쳐다닙니다.");
    }
}

class Bird implements Movable {
    String name;

    Bird(String name) {
        this.name = name;
    }

    // 인터페이스의 약속을 실제로 구현 (오버라이딩 필수)
    @Override
    public void move() {
        System.out.println(name + "가 날아다닙니다.");
    }
}