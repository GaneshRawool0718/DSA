package Day27;

public class ToLowerCase {
    public String toLowerCase(String s) {
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                result.append((char)(c + 32));  // Convert to lowercase
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
