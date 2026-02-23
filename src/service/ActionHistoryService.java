package service;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ActionHistoryService {

    private ArrayDeque<String> actions = new ArrayDeque<>();

    public void initializeActions() {
        actions.addLast("Submitted Assignment");
        actions.addLast("Dropped Course");
        actions.addLast("Registered Course");
        actions.addLast("Updated Profile");
    }

    public void undoLastAction() {
        if (!actions.isEmpty()) {
            actions.removeLast();
        }
    }

    public void addRequestedTranscript() {
        actions.addLast("Requested Transcript");
    }

    public void showFirstAndLast() {
        System.out.println("First: " + actions.getFirst());
        System.out.println("Last: " + actions.getLast());
    }

    public void printHistory() {
        for (Iterator<String> it = actions.iterator(); it.hasNext(); ) {
            System.out.println("  • " + it.next());
        }
    }

    public ArrayDeque<String> getActions() {
        return actions;
    }
}
