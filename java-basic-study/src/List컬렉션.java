// 패키지기능 가져오기
import java.util.ArrayList;
import java.util.List;

public class List컬렉션 {
    public static void main(String[] args) {
        // 1. names는 순서가 있는 리스트 형태의 자료구조를 다루는 변수다. 문자열만 저장가능
        // 2. 그 List를 실제로 ArrayList 방식으로 구현한 객체를 만들겠다.
        List<String> names = new ArrayList<>();
        names.add("김하늘");
        names.add("이철수");
        names.add("박영희");

        // 전체 출력
        System.out.println(names);

        // 하나씩 출력 (반복문)
        for (String name : names) {
            System.out.println(name);
        }

        // 특정 위치 가져오기
        System.out.println("첫번째: " + names.get(0));
    }
}