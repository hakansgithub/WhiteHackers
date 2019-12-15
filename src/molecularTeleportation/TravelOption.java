package molecularTeleportation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TravelOption {

    public static Map<String, List<String>> destinations () {
        Map<String, List<String>> destinations1 = new HashMap<String, List<String>>();

        List<String> list1 = new ArrayList();
        list1.add("Central Park");
        list1.add("Manhattan");
        list1.add("Empire State");
        destinations1.put("NYC", list1);

        List<String> list2 = new ArrayList();
        list2.add("Louvre");
        list2.add("Eifel Tower");
        list2.add("Champs-Élysées");
        destinations1.put("Paris", list2);

        List<String> list3 = new ArrayList();
        list3.add("Topkapi Palace");
        list3.add("Bosphorus");
        list3.add("Istiklal Street");
        destinations1.put("Istanbul", list3);

        List<String> list4 = new ArrayList();
        list4.add("Philarmonia");
        list4.add("Faiza");
        list4.add("Bishkek Park");
        destinations1.put("Bishkek", list4);

        List<String> list5 = new ArrayList();
        list5.add("Independence Square");
        list5.add("Golden Gate");
        list5.add("Chernobyl");
        destinations1.put("Kiev", list5);

        return destinations1;
    }
}
