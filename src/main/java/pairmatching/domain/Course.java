package pairmatching.domain;

import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import pairmatching.util.FILE_CONSTANT;
import pairmatching.view.FileInputView;

public enum Course {
    BACKEND("백엔드", 0),
    FRONTEND("프론트엔드", 1);

    private String name;
    private int index;
    private ArrayList<String> crewNameList = new ArrayList<>();

    Course(String name, int index) {
        this.name = name;
        this.index = index;
        // 여기서 벡엔드 파일 읽어오는 함수 호출해서 crewList 채워넣기
        updateCrewList();
    }

    private void updateCrewList() {
        String crewListString = new FileInputView(index).fileToString();
        Scanner scanner = new Scanner(crewListString);
        scanner.useDelimiter(FILE_CONSTANT.fileDelimiter.toString());
        while (scanner.hasNextLine()) {
            String crewName = scanner.nextLine();
            crewNameList.add(crewName);
        }
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
