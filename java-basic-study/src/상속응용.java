public class 상속응용 {
    public static void main(String[] args) {

        // 자식클래스 타입으로 자식객체 생성 - 자식객체의 고유기능까지 다 써야할때 ( EX)bark()나meow()사용처럼 )
        Dog dog = new Dog("coco");
        Cat cat = new Cat("haru");

        // 부모 클래스 기능
        dog.eat();
        cat.eat();

        // 자식 클래스 기능
        dog.bark();
        cat.meow();
    }
}

class Animal {
    String name;

    // 생성자 자기이름참조
    Animal(String name){
        this.name = name;
    }

    void eat(){
        System.out.println(name+"가 먹습니다.");
    }
}

class Dog extends Animal {
    // 생성자 자기이름참조
    Dog(String name){
        super(name); // 부모클래스 생성자 호출
    }
    void bark(){
        System.out.println(name+"가 짖습니다.");
    }
}

class Cat extends Animal {
    // 생성자 자기이름참조
    Cat(String name){
        super(name); // 부모클래스 생성자 호출
    }
    void meow(){
        System.out.println(name+"가 야옹합니다.");
    }
}