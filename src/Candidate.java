
public class Candidate {

    private String name;
    private double percentage;
    private int backlogs;
    private int graduationYear;

    // Constructor
    public Candidate(String name, double percentage, int backlogs, int graduationYear) {
        this.name = name;
        this.percentage = percentage;
        this.backlogs = backlogs;
        this.graduationYear = graduationYear;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for percentage
    public double getPercentage() {
        return percentage;
    }

    // Getter for backlogs
    public int getBacklogs() {
        return backlogs;
    }

    // Getter for graduation year
    public int getGraduationYear() {
        return graduationYear;
    }
}
