package service;

import java.util.LinkedList;
import java.util.Iterator;

public class AppointmentService {

    private LinkedList<String> appointments = new LinkedList<>();

    public void initializeAppointments() {
        appointments.add("Java Consultation");
        appointments.add("Coursework Discussion");
        appointments.add("Schedule Question");
        appointments.addFirst("URGENT: Deadline Problem");
    }

    public void cancelLast() {
        if (!appointments.isEmpty()) {
            appointments.removeLast();
        }
    }

    public void showFirstAndLast() {
        System.out.println("First: " + appointments.getFirst());
        System.out.println("Last: " + appointments.getLast());
    }

    public void printAppointments() {
        for (Iterator<String> it = appointments.iterator(); it.hasNext(); ) {
            System.out.println("  • " + it.next());
        }
    }

    public LinkedList<String> getAppointments() {
        return appointments;
    }
}