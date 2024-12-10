package pairmatching.domain;

import java.util.ArrayList;
import java.util.HashMap;

public class Level {
    private PairHistory pairHistory;
    private HashMap<String, ArrayList<Pair>> pairList;

    public Level() {
        pairHistory = new PairHistory();
    }
}
