package service;

import model.Issue;
import java.util.PriorityQueue;
import java.util.Iterator;

public class IssueService {

    private PriorityQueue<Issue> issues = new PriorityQueue<>();

    public void initializeIssues() {
        issues.offer(new Issue("Lab not submitted", 3));
        issues.offer(new Issue("LMS access lost", 1));
        issues.offer(new Issue("Scholarship question", 4));
        issues.offer(new Issue("Group conflict", 2));
        issues.offer(new Issue("Transcript error", 1));
    }

    public void showMostUrgent() {
        System.out.println("Most urgent: " + issues.peek());
    }

    public void resolveIssues() {
        if (!issues.isEmpty()) issues.poll();
        if (!issues.isEmpty()) issues.poll();
    }

    public void printRemainingIssues() {
        for (Iterator<Issue> it = issues.iterator(); it.hasNext(); ) {
            System.out.println("  • " + it.next());
        }
    }

    public void addNewIssue(String description, int urgency) {
        issues.offer(new Issue(description, urgency));
    }

    public PriorityQueue<Issue> getIssues() {
        return issues;
    }
}
