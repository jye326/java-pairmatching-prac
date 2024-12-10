package pairmatching.util;


public enum FILE_CONSTANT {
    productFilePath("src/main/resources/products.md"),
    promotionFilePath("src/main/resources/promotions.md"),
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