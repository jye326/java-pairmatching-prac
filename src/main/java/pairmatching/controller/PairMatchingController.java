package pairmatching.controller;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import pairmatching.domain.Course;
import pairmatching.domain.Level;
import pairmatching.domain.Pair;
import pairmatching.domain.PairHistory;
import pairmatching.domain.PairMap;
import pairmatching.service.createPairList;
import pairmatching.util.LEVEL_CONSTANT;
import pairmatching.util.OUTPUT_MESSAGE;
import pairmatching.view.OutputView;

public class PairMatchingController {
    public void start() {
        // Course.FRONTEND.printCrewNameList();
        System.out.println(OUTPUT_MESSAGE.MENU);
        PairHistory history = new PairHistory();
        String option = Console.readLine();
        PairMap pairMap = new PairMap();

        if (option.equals("1")) {
            createPairList(pairMap);
        }

//        System.out.println(history.addPair(new Pair("a", "b")));
//        Pair pair = new Pair("a", "b");
//        pair.addThirdPair("c");
//        System.out.println(history.addPair(pair));
//        history.printLevelHistory();
    }

    public void createPairList(PairMap pairMap) {
        OutputView.printCourseMission();
        String option = Console.readLine();
        List<String> orders = Arrays.asList(option.split(","));
        for (String order : orders) {
            order.trim();
        }
        if(orders.get(0).equals("백엔드")) {
            List<Pair> pairList = Course.BACKEND.getPairList();
            if (pairMap.isEmpty(orders.get(0), orders.get(1),orders.get(2))) {
                pairMap.addPair(orders.get(0),orders.get(1),orders.get(2),pairList);
            }
        }

        if (orders.get(0).equals("프론트엔드")) {
            List<Pair> pairList = Course.FRONTEND.getPairList();
            if (pairMap.isEmpty(orders.get(0), orders.get(1),orders.get(2))) {
                pairMap.addPair(orders.get(0),orders.get(1),orders.get(2),pairList);
            }
        }
        // pairhistory가 존재하는지 확인
        // 존재하면

    }
}
