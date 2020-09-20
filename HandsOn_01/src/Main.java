import java.sql.Timestamp;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int option;
        Scanner sc = new Scanner(System.in);
        Date date = new Date();
        Candidate candidate = new Candidate();
        System.out.println(new Timestamp(date.getTime())+" ----------------------------------------------------------------------------------------------");
        do {
            System.out.println("Welcome To Institution Software Administration");
            System.out.println("Main Menu");
            System.out.println("0 - Exit");
            System.out.println("1 - New Candidate");
            System.out.println("2 - View All Candidates");
            System.out.println("3 - Find Candidate");
            System.out.println("Please choose the option:");
            System.out.print("Option : ");
            option = sc.nextInt();
            switch (option) {
                case 0: {
                    System.out.println(new Timestamp(date.getTime())+" ----------------------------------------------------------------------------------------------");
                    System.out.println(new Timestamp(date.getTime())+" Exit");
                    System.out.println(new Timestamp(date.getTime())+" ----------------------------------------------------------------------------------------------");
                    System.exit(0);
                    break;
                }
                case 1: {
                    System.out.println(new Timestamp(date.getTime())+" ----------------------------------------------------------------------------------------------");
                    System.out.println("New Candidate");
                    candidate.newCandidate();
                    System.out.println(new Timestamp(date.getTime())+" New candidate added successfully");
                    System.out.println(new Timestamp(date.getTime())+" ----------------------------------------------------------------------------------------------");
                    break;
                }
                case 2: {
                    System.out.println(new Timestamp(date.getTime())+" ----------------------------------------------------------------------------------------------");
                    System.out.println("View All Candidates");
                    candidate.displayAllCandidates();
                    System.out.println(new Timestamp(date.getTime())+" ----------------------------------------------------------------------------------------------");
                    break;
                }
                case 3: {
                    System.out.println(new Timestamp(date.getTime())+" ----------------------------------------------------------------------------------------------");
                    System.out.println("Find Candidates");
                    System.out.println("Please enter the id of the candidate");
                    String id;
                    Scanner scanner = new Scanner(System.in);
                    id = scanner.nextLine();
                    candidate.getCandidate(id);
                    System.out.println(new Timestamp(date.getTime())+" ----------------------------------------------------------------------------------------------");
                    break;
                }
                default: {
                    System.out.println(new Timestamp(date.getTime())+" ----------------------------------------------------------------------------------------------");
                    System.out.println(option + " is not a valid option");
                    System.out.println("Please try again adding 1,2 or 3");
                    System.out.println(new Timestamp(date.getTime())+" ----------------------------------------------------------------------------------------------");
                    break;
                }
            }
        } while (option!=0);

    }
}
