
public class EligibilityChecker {

    private EligibilityRule[] rules;

    public EligibilityChecker() {
        rules = new EligibilityRule[] {
            new PercentageRule(),
            new BacklogRule(),
            new GraduationYearRule()
        };
    }

    public boolean evaluate(Candidate candidate, Job job) {

        boolean eligible = true;

        for (int i = 0; i < rules.length; i++) {

            boolean passed = rules[i].check(candidate, job);

            if (passed) {
                System.out.println(rules[i].getRuleName() + " : PASS");
            } else {
                System.out.println(rules[i].getRuleName() + " : FAIL");
                eligible = false;
            }
        }

        return eligible;
    }
}
