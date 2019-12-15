package molecularTeleportation;

import java.util.HashMap;
import java.util.Map;

public class PriceAndDiscount {
    static Map<String, Integer> fee = new HashMap<>();

    static {
        fee.put("NYC", 1000);
        fee.put("Paris", 3000);
        fee.put("Istanbul", 2000);
        fee.put("Bishkek", 5000);
        fee.put("Kiev", 4000);
    }

    public static int discount (int balance, int percentage) {
        return balance * percentage / 100;
    }
}
