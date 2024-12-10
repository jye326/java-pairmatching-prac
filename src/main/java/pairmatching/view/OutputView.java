package pairmatching.view;

import java.text.NumberFormat;
import pairmatching.util.OUTPUT_MESSAGE;

public class OutputView {
    // 일반 출력
    public static void askMembership() {
        System.out.println(OUTPUT_MESSAGE.openingComment);
    }

    // 숫자를 세 자리마다 쉼표 찍어서 String 으로 반환
    private String formatNumber(Long number) {
        return NumberFormat.getInstance().format(number);
    }
}
