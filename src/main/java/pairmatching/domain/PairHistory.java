package pairmatching.domain;

import java.util.HashSet;
import java.util.List;

public class PairHistory {
    private HashSet<Pair> pairHistory;

    public PairHistory() {
        pairHistory = new HashSet<>();
    }

    public boolean addPair(Pair pair) {
        if (pair.getPairSize() == 3) {
            List<Pair> pairs = pair.getThreePairs();
            if (!(pairHistory.contains(pairs.get(0)) || pairHistory.contains(pairs.get(1)) || pairHistory.contains(
                    pairs.get(2)))) {
                return pairHistory.add(pair);
            }
            return false;
        }
        return pairHistory.add(pair);
    }

    public void printLevelHistory() {
        for (Pair pair : pairHistory) {
            System.out.println(pair);
        }
    }
}
