
public class PercentageRule extends EligibilityRule {

    @Override
    public String getRuleName() {
        return "Percentage";
    }

    @Override
    public boolean check(Candidate candidate, Job job) {
        return candidate.getPercentage() >= job.getMinimumPercentage();
    }
}
