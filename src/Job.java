
public class Job {

    private String company;
    private String role;
    private double minimumPercentage;
    private int maximumBacklogs;
    private int requiredGraduationYear;

    // Constructor
    public Job(String company, String role, double minimumPercentage,int maximumBacklogs, int requiredGraduationYear) {
        this.company = company;
        this.role = role;
        this.minimumPercentage = minimumPercentage;
        this.maximumBacklogs = maximumBacklogs;
        this.requiredGraduationYear = requiredGraduationYear;
    }

    // Getter for company
    public String getCompany() {
        return company;
    }

    // Getter for role
    public String getRole() {
        return role;
    }

    // Getter for minimum percentage
    public double getMinimumPercentage() {
        return minimumPercentage;
    }

    // Getter for maximum backlogs
    public int getMaximumBacklogs() {
        return maximumBacklogs;
    }

    // Getter for required graduation year
    public int getRequiredGraduationYear() {
        return requiredGraduationYear;
    }
}
