package pairmatching.view;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.util.stream.Collectors;
import pairmatching.util.ERROR_MESSAGE;
import pairmatching.util.FILE_CONSTANT;
import pairmatching.util.NUMBER_CONSTANT;


public class FileInputView {
    static String filePath = "";

    public FileInputView(String courseName) {
        if (courseName.equals("백엔드")) {
            filePath = FILE_CONSTANT.BACKEND_FILE_PATH.toString();
        } else {
            filePath = FILE_CONSTANT.FRONTEND_FILE_PATH.toString();
        }
    }
    // 파일을 읽어서 버퍼로 반환
    private static BufferedReader readFileToBuffer(String filePath) {
        File file = new File(filePath);
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println(ERROR_MESSAGE.FILE_NOT_FOUND);
        }
        return new BufferedReader(fileReader);
    }


    // 버퍼를 한줄씩 읽어서 문자열로 반환
    // 이때, fileDelimiter 기준으로 구분하여 저장 -> Scanner의 nextLine()으로 불러올 수 있다.
    public static String fileToString() {
        return readFileToBuffer(filePath).lines()
                .collect(Collectors.joining(FILE_CONSTANT.fileDelimiter.toString()));
    }

}
