package pairmatching.util;


public enum LEVEL_CONSTANT {
    LEVEL1("레벨1",0),
    LEVEL2("레벨2",1),
    LEVEL3("레벨3",2),
    LEVEL4("레벨4",3),
    LEVEL5("레벨5",4);

    private String name;
    private int index;

    LEVEL_CONSTANT(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public int indexOf(String lv) {
        if (lv.equals(name)) {
            return index;
        }
        return -1;
    }
}
