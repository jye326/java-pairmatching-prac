package pairmatching.domain;

public class Pair {
    private String first;
    private String second;

    public Pair(String first, String second) {
        this.first = first;
        this.second = second;
    }
    public String getFirst() {
        return first;
    }
    public String getSecond() {
        return second;
    }
    @Override
    public boolean equals(Object o) {
        boolean equals = false;
        if (o instanceof Pair) {
            equals = first.equals(((Pair) o).first) && second.equals(((Pair) o).second) || first.equals(((Pair) o).second) && second.equals(((Pair) o).first);
        }
        return equals;
    }
}
