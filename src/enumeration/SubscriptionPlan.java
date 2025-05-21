package enumeration;

public enum SubscriptionPlan {
    FREE(0),
    BASIC(10),
    PREMIUM(20),
    ENTERPRISE(50);

    private final int monthlyCost;

    SubscriptionPlan(int monthlyCost) {
        this.monthlyCost = monthlyCost;
    }

    public int getMonthlyCost() {
        return monthlyCost;
    }


    public static void comparePlans(SubscriptionPlan plan1, SubscriptionPlan plan2) {
        if (plan1.getMonthlyCost() > plan2.getMonthlyCost()) {
            System.out.println(plan1 + " plan is a higher tier than " + plan2);
        } else if (plan1.getMonthlyCost() < plan2.getMonthlyCost()) {
            System.out.println(plan2 + " plan is a higher tier than " + plan1);
        } else {
            System.out.println(plan1 + " and " + plan2 + " are of the same tier.");
        }
    }

    public void printBenefits() {
        switch (this) {
            case FREE:
                System.out.println("Free Plan: Limited access to features. Great for testing.");
                break;
            case BASIC:
                System.out.println("Basic Plan: Access to basic features with a monthly cost of $10.");
                break;
            case PREMIUM:
                System.out.println("Premium Plan: Access to all features with a monthly cost of $20. Priority support.");
                break;
            case ENTERPRISE:
                System.out.println("Enterprise Plan: Tailored solutions for businesses with a monthly cost of $50. Dedicated support and custom features.");
                break;
            default:
                throw new IllegalArgumentException("Unknown plan: " + this);
        }
    }

    public static void main(String[] args) {

        SubscriptionPlan plan1 = SubscriptionPlan.BASIC;
        SubscriptionPlan plan2 = SubscriptionPlan.PREMIUM;

        comparePlans(plan1, plan2);


        plan1.printBenefits();
        plan2.printBenefits(); 
    }
}
