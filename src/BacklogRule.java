
public class BacklogRule extends EligibilityRule {

    @Override
    public String getRuleName() {
        return "Backlogs";
    }

    @Override
    public boolean check(Candidate candidate, Job job) {
        return candidate.getBacklogs() <= job.getMaximumBacklogs();
    }
}
