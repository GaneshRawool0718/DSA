package Day32;

public class CheckRecord {
    public boolean checkRecord(String s) {
        int absents = 0;
        int consecutiveLates = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Check for absents
            if (ch == 'A') {
                absents++;
                if (absents >= 2) return false;
            }

            // Check for consecutive lates
            if (ch == 'L') {
                consecutiveLates++;
                if (consecutiveLates >= 3) return false;
            } else {
                consecutiveLates = 0;
            }
        }

        return true;
    }
}