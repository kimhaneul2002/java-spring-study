import java.util.HashMap;
import java.util.Map;

public class Map컬렉션 {
    public static void main(String[] args) {
        // 1. scores는 이름표(key)와 값(value)을 한 쌍으로 저장하는 Map자료구조 다루는 변수다.
        // 2. 실제로 HashMap 클래스로 구현한 객체를 만들겠다.
        Map<String, Integer> scores = new HashMap<>();
        scores.put("김하늘", 90);
        scores.put("이철수", 85);

        // 특정 키로 값 가져오기
        System.out.println("김하늘의 점수: " + scores.get("김하늘"));

        // 전체 출력
        // name변수에 scores의 키값 꺼내오는 메서드로 키값 넣어서 반복문
        for (String name : scores.keySet()) {
            // 키값 반복 출력
            System.out.println(name + ": " + scores.get(name));
        }
    }
}