package model;

public class Issue implements Comparable<Issue> {

    private String description;
    private int urgencyLevel;

    public Issue(String description, int urgencyLevel) {
        this.description = description;
        this.urgencyLevel = urgencyLevel;
    }

    @Override
    public int compareTo(Issue other) {
        return Integer.compare(this.urgencyLevel, other.urgencyLevel);
    }

    @Override
    public String toString() {
        return String.format("[%d] %s", urgencyLevel, description);
    }
}