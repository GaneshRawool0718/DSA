package Day29;

import java.util.HashMap;
import java.util.Map;

public class ReformatDate {
    public String reformatDate(String date) {
        // Map of month abbreviations to their corresponding numbers
        Map<String, String> monthMap = new HashMap<>();
        monthMap.put("Jan", "01");
        monthMap.put("Feb", "02");
        monthMap.put("Mar", "03");
        monthMap.put("Apr", "04");
        monthMap.put("May", "05");
        monthMap.put("Jun", "06");
        monthMap.put("Jul", "07");
        monthMap.put("Aug", "08");
        monthMap.put("Sep", "09");
        monthMap.put("Oct", "10");
        monthMap.put("Nov", "11");
        monthMap.put("Dec", "12");

        // Split input string
        String[] parts = date.split(" ");
        String day = parts[0].substring(0, parts[0].length() - 2); // remove "st", "nd", etc.
        String month = parts[1];
        String year = parts[2];

        // Format day with leading zero if necessary
        if (day.length() == 1) {
            day = "0" + day;
        }

        // Construct the final formatted date
        return year + "-" + monthMap.get(month) + "-" + day;
    }
}
