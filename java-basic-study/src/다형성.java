public class 다형성 {
    public static void main(String[] args) {

        // 부모클래스 타입으로 자식 객체 생성 - 여러 종류를 한번에 묶어서 처리하고싶을때 ( EX)eat()사용처럼 )
        Animals animal1 = new Dogs("멍멍이");
        Animals animal2 = new Cats("야옹이");

        // 자식클래스에 없으니 부모클래스에 메서드 호출
        animal1.eat();
        animal2.eat();

        // 오버라이딩된 자식클래스에 메서드 호출
        animal1.sound();
        animal2.sound();
    }
}

class Animals{
    String name;

    // 생성자 자기이름참조
    Animals(String name) {
        this.name = name;
    }

    void eat(){
        System.out.println(name+"가 먹습니다.");
    }

    void sound(){
        System.out.println("동물 소리");
    }
}

class Dogs extends Animals{
    // 생성자 자기이름참조
    Dogs(String name){
        super(name); // 부모클래스 생성자 호출
    }

    // 부모클래스의 함수를 자식클래스에서 오버라이딩
    @Override
    void sound(){
        System.out.println(name+"가 멍멍 짖습니다.");
    }
}

class Cats extends Animals{
    // 생성자 자기이름참조
    Cats(String name){
        super(name); // 부모클래스 생성자 호출
    }

    // 부모클래스의 함수를 자식클래스에서 오버라이딩
    @Override
    void sound(){
        System.out.println(name+"가 야옹합니다.");
    }
}