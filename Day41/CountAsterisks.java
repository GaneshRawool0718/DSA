package Day41;

public class CountAsterisks {
    /*
     * This class counts the number of asterisks in a string that are not enclosed
     * by pairs of vertical bars '|'. The asterisks outside these pairs are counted.
     */
    public int countAsterisks(String s) {
        int count = 0;
        boolean inPair = false;

        for (char ch : s.toCharArray()) {
            if (ch == '|') {
                inPair = !inPair; // Toggle between inside and outside
            } else if (ch == '*' && !inPair) {
                count++;
            }
        }

        return count;
    }
}

