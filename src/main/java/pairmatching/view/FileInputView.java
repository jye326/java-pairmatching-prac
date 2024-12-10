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
    // Util의 File Path
    static final String filePath = FILE_CONSTANT.productFilePath.toString();

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

    // 첫 번째 줄을 제외하고
    // 버퍼를 한줄씩 읽어서 문자열로 반환
    // 이때, fileDelimiter 기준으로 구분하여 저장 -> Scanner의 nextLine()으로 불러올 수 있다.
    private static String fileToString(BufferedReader bufferedReader) {
        return bufferedReader.lines()
                .skip(NUMBER_CONSTANT.ONE.getLong())
                .collect(Collectors.joining(FILE_CONSTANT.fileDelimiter.toString()));
    }

}
