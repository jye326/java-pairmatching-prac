package pairmatching.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PairMap {
    private HashMap<String, HashMap<String, HashMap<String, List<Pair>>>> pairMap;

    public PairMap() {
        HashMap<String, List<Pair>> missionMap = new HashMap<>();
        missionMap.put("자동차경주", new ArrayList<Pair>());
        missionMap.put("로또", new ArrayList<Pair>());
        missionMap.put("숫자야구게임", new ArrayList<Pair>());

        HashMap<String, HashMap<String, List<Pair>>> courseMap = new HashMap<>();
        courseMap.put("레벨1", missionMap);
    }

    // 해당 페어 매칭 존재 여부
    public boolean isEmpty(String course, String level, String mission) {
        return pairMap.get(course)==null;
    }

    // pairs에 삽입
    public void addPair(String course, String level, String mission, List<Pair> pairList) {
        pairMap.get(course).get(level).put(mission, pairList);
    }



}
