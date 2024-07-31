import java.util.HashMap;
import java.util.Map;

public class IOU {
    private Map<String, Double> debts;

    public IOU() {
        debts = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        debts.put(toWhom, amount); // Store or update the amount owed to "toWhom"
    }

    public double howMuchDoIOweTo(String toWhom) {
        return debts.getOrDefault(toWhom, 0.0); // Return the amount owed, or 0 if no debt exists
    }

    public static void main(String[] args) {
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur")); // Should print 51.5
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael")); // Should print 30.0

        // Test updating the debt
        mattsIOU.setSum("Arthur", 10.5);
        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur")); // Should print 10.5
    }
}

