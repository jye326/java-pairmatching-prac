package pairmatching;

import pairmatching.controller.PairMatchingController;
import pairmatching.domain.Pair;
import pairmatching.domain.PairHistory;
import pairmatching.util.OUTPUT_MESSAGE;

public class Application {
    public static void main(String[] args) {
        // TODO 구현 진행
        PairMatchingController p = new PairMatchingController();
        p.start();
    }
}
