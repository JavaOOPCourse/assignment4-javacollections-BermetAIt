import service.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StudentService studentService = new StudentService();
        AppointmentService appointmentService = new AppointmentService();
        IssueService issueService = new IssueService();
        ActionHistoryService actionService = new ActionHistoryService();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===== 🎓 Smart University Service System =====");
            System.out.println("1. Show Students");
            System.out.println("2. Show Appointments");
            System.out.println("3. Show Emergency Issues");
            System.out.println("4. Show Action History");
            System.out.println("5. Add New Issue");
            System.out.println("6. Undo Action");
            System.out.println("7. Exit");
            System.out.print("Choose option: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    studentService.initializeStudents();
                    studentService.removeLowGPA();
                    studentService.findHighestGPA();
                    studentService.insertAtIndex();
                    studentService.printStudents();
                    break;
                case 2:
                    appointmentService.initializeAppointments();
                    appointmentService.cancelLast();
                    appointmentService.showFirstAndLast();
                    appointmentService.printAppointments();
                    break;
                case 3:
                    issueService.initializeIssues();
                    issueService.showMostUrgent();
                    issueService.resolveIssues();
                    issueService.printRemainingIssues();
                    break;
                case 4:
                    actionService.initializeActions();
                    actionService.undoLastAction();
                    actionService.addRequestedTranscript();
                    actionService.showFirstAndLast();
                    actionService.printHistory();
                    break;
                case 5:
                    System.out.print("Issue description: ");
                    String desc = scanner.nextLine();
                    System.out.print("Urgency level (1-5, 1 = most urgent): ");
                    int urgency = scanner.nextInt();
                    scanner.nextLine();
                    issueService.addNewIssue(desc, urgency);
                    System.out.println("Issue added successfully");
                    break;
                case 6:
                    actionService.undoLastAction();
                    System.out.println("Last action undone");
                    break;
                case 7:
                    System.out.println("Exiting... 👋");
                    break;
                default:
                    System.out.println("Invalid option ❌");
            }

        } while (choice != 7);

        scanner.close();
    }
}