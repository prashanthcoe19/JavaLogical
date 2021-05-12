import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class Quest1 {
    int studentID;
    String studentName;
    String startDate;
    String endDate;
    int resCost;

    public Quest1(int id, String name, String start, String end, int cost) {
        studentID = id;
        studentName = name;
        startDate = start;
        endDate = end;
        resCost = cost;

        // System.out.format("%10d%10%10s%10s", id, name, start, end);
    }

    public static void main(String[] args) {
        System.out.println("Add a reservation:");

        ArrayList<Quest1> res = new ArrayList<Quest1>();
        Scanner scan = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Enter Student ID");
            int id = scan.nextInt();
            scan.nextLine();
            System.out.println("Enter Student Name");
            String name = scan.nextLine();
            if (name.equalsIgnoreCase("quit")) {
                break;
            }
            System.out.println("Enter Start Date");
            String start = scan.nextLine();
            System.out.println("Enter End Date");
            String end = scan.nextLine();
            int cost = calculateCost(start, end);
            Quest1 q = new Quest1(id, name, start, end, cost);
            res.add(q);
            System.out.println("Do you need more reservation?");
            String exit = scan.nextLine();
            if (exit.equalsIgnoreCase("N")) {
                // print list objects in tabular format
                System.out.printf("%10s %20s %15s %15s %15s", "STUDENT ID", "NAME", "START DATE", "END DATE", "COST");
                System.out.println();
                System.out
                        .println("-----------------------------------------------------------------------------------");
                for (Quest1 i : res) {
                    System.out.format("%10d %20s %17s %17s %12d", i.studentID, i.studentName, i.startDate, i.endDate,
                            i.resCost);
                    System.out.println();
                }
                System.out.println(
                        "------------------------------------------------------------------------------------");
                break;
            }
            scan.close();
        }
    }

    // function to determine days between two dates and calculate the cost
    public static int calculateCost(String start, String end) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate date1 = LocalDate.parse(start, dtf);
        LocalDate date2 = LocalDate.parse(end, dtf);
        long daysBetween = ChronoUnit.DAYS.between(date1, date2);
        long lcost = daysBetween * 1;
        int cost = (int) lcost;
        return cost;
    }
}
