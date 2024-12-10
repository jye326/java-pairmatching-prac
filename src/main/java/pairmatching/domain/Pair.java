package pairmatching.domain;

import java.util.ArrayList;
import java.util.List;

public class Pair {
    private List<String> pair = new ArrayList<String>();

    public Pair(String first, String second) {
        pair.add(first);
        pair.add(second);
    }

    public int getPairSize() {
        return pair.size();
    }

    public void addThirdPair(String third) {
        pair.add(third);
    }

    public List<Pair> getThreePairs() {
        List<Pair> threePairs = new ArrayList<>();
        threePairs.add(new Pair(pair.get(0), pair.get(1)));
        threePairs.add(new Pair(pair.get(1), pair.get(2)));
        threePairs.add(new Pair(pair.get(0), pair.get(2)));
        return threePairs;
    }

    @Override
    public String toString() {
        return String.join(" : ", pair);
    }

    // 3명일때 같은 페어 된적 있는지 찾기

    @Override
    public boolean equals(Object o) {
        boolean equals = true;
        if (o instanceof Pair) {
            for (String name : pair) {
                Pair p = ((Pair) o);
                if (!pair.contains(name)) {
                    equals = false;
                }
            }
        }
        return equals;
    }

    // 이거 그냥 합으로 가도 되나? 일단 해시코드가 다른데
    @Override
    public int hashCode() {
        int hash = 0;
        for (String name : pair) {
            hash += name.hashCode();
        }
        return hash;
    }
}
