package pairmatching.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import pairmatching.util.FILE_CONSTANT;
import pairmatching.view.FileInputView;

public enum Course {
    BACKEND("백엔드"),
    FRONTEND("프론트엔드");

    private String name;
    private List<String> crewNameList = new ArrayList<>();

    Course(String name) {
        this.name = name;
        updateCrewList();
    }

    private void updateCrewList() {
        String crewListString = new FileInputView(name).fileToString();
        Scanner scanner = new Scanner(crewListString);
        scanner.useDelimiter(FILE_CONSTANT.fileDelimiter.toString());
        while (scanner.hasNextLine()) {
            String crewName = scanner.nextLine();
            crewNameList.add(crewName);
        }
        scanner.close();
    }
    // 페어 리스트 반환
    public List<Pair> getPairList() {
        List<Pair> pairList = new ArrayList<>();
        // 랜덤하게 일단 섞기
        crewNameList = Randoms.shuffle(crewNameList);
        // 2명씩 페어하기
        for (int i = 0; i < (crewNameList.size() / 2);i++) {
            pairList.add(new Pair(crewNameList.get(2*i), crewNameList.get((2*i)+1)));
        }
        // 홀수면 한명이 남는다.
        if (crewNameList.size() % 2 == 1) {
            // 맨 뒤 페어에 한명 추가
            pairList.get(pairList.size()-1).addThirdPair(crewNameList.get(crewNameList.size()-1));
        }

        return pairList;
    }

    public String getName() {
        return name;
    }

    public void printCrewNameList() {
        for (String crewName : crewNameList) {
            System.out.println(crewName);
        }
    }

}
