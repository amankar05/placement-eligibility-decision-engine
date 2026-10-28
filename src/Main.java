import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        double percentage = scanner.nextDouble();
        int backlogs = scanner.nextInt();
        int graduationYear = scanner.nextInt();

        Candidate candidate = new Candidate(
            name,
            percentage,
            backlogs,
            graduationYear
        );

        Job job = new Job(
            "Infosys",
            "Java Developer",
            65.0,
            0,
            2026
        );

        EligibilityChecker checker = new EligibilityChecker();

        System.out.println("==============================");
        System.out.println("PLACEMENT ELIGIBILITY RESULT");
        System.out.println("==============================");
        System.out.println();

        System.out.println("Candidate : " + candidate.getName());
        System.out.println("Company   : " + job.getCompany());
        System.out.println("Role      : " + job.getRole());

        System.out.println();

        boolean eligible = checker.evaluate(candidate, job);

        System.out.println();

        if (eligible) {
            System.out.println("Final Result : ELIGIBLE");
        } else {
            System.out.println("Final Result : NOT ELIGIBLE");
        }

        System.out.println("==============================");

        scanner.close();
    }
}