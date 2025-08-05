package Day37;

public class CountAndSay {
    /*
     * This method generates the nth term of the "Count and Say" sequence.
     * The sequence starts with "1", and each subsequent term describes the previous term.
     * For example, the first few terms are:
     * 1. "1"
     * 2. "11" (one 1)
     * 3. "21" (two 1s)
     * 4. "1211" (one 2, then one 1)
     */
    public String countAndSay(int n) {
        // Base case for n = 1
        String result = "1"; // base case


        for (int i = 2; i <= n; i++) {
            StringBuilder next = new StringBuilder();
            int count = 1;
            char prev = result.charAt(0);

            for (int j = 1; j < result.length(); j++) {
                char current = result.charAt(j);
                if (current == prev) {
                    count++;
                } else {
                    next.append(count).append(prev);
                    prev = current;
                    count = 1;
                }
            }

            next.append(count).append(prev); // append last group
            result = next.toString();
        }

        return result;
    }
}