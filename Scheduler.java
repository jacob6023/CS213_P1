import java.util.Scanner;
public class Scheduler {
    private List appointments = new List();

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scheduler is running.");
        String input;

        while (!(input = scanner.nextLine()).equals("Q")) {
            processCommand(input);
        }

        System.out.println("Scheduler terminated.");
        scanner.close();
    }

    private void processCommand(String input) {

    }
}
