public class 예외처리 {
    public static void main(String[] args) {
        // scores배열 선언 및 초기값 할당
        int[] scores = {90, 85, 95};

        try { // 예외발생 가능코드
            System.out.println(scores[10]);
        } catch (ArrayIndexOutOfBoundsException e) { // 에러발생시 대응
            System.out.println("존재하지 않는 점수입니다.");
            System.out.println("에러 상세: " + e.getMessage());
        } finally { // 에러 나든 안나든 마지막에 한번 실행코드
            System.out.println("점수 확인 종료");
        }

        System.out.println("프로그램은 계속 실행됩니다.");
    }
}