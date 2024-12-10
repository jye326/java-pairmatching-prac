package pairmatching.util;


public enum FILE_CONSTANT {
    BACKEND_FILE_PATH("src/main/resources/backend-crew.md"),
    FRONTEND_FILE_PATH("src/main/resources/frontend-crew.md"),
    fileDelimiter("\n"),
    dateFormat_yyyyMMdd("yyyy-MM-dd");

    private final String path;

    FILE_CONSTANT(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return path;
    }
}