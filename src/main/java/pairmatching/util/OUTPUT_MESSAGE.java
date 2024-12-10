package pairmatching.util;

public enum OUTPUT_MESSAGE {
    // 일반 정적 출력 문구 예시
    MENU("기능을 선택하세요.\n"
            + "1. 페어 매칭\n"
            + "2. 페어 조회\n"
            + "3. 페어 초기화\n"
            + "Q. 종료"),
    openingComment("안녕하세요. W편의점입니다.\n현재 보유하고 있는 상품입니다.\n"),
    COURSEMISSION("#############################################\n"
            + "과정: 백엔드 | 프론트엔드\n"
            + "미션:\n"
            + "  - 레벨1: 자동차경주 | 로또 | 숫자야구게임\n"
            + "  - 레벨2: 장바구니 | 결제 | 지하철노선도\n"
            + "  - 레벨3:\n"
            + "  - 레벨4: 성능개선 | 배포\n"
            + "  - 레벨5:\n"
            + "############################################\n"
            + "과정, 레벨, 미션을 선택하세요.\n"
            + "ex) 백엔드, 레벨1, 자동차경주"),
    divider("===================================="),
    doubleTab("\t\t"),
    // format 사용한 가변 출력 문구 예시
    PAY_AMOUNT("내실돈\t\t\t %s")

    ;
    private final String message;

    OUTPUT_MESSAGE(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }

    // 주어진 인자를 순서대로 해당 포멧에 채워 넣음
    public String format(Object... args) {
        return String.format(message, args);
    }
}
