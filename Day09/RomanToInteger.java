package Day09;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    // This class contains a method to convert a Roman numeral string to an integer.
    public static int romanToInt(String s) {
        // This method converts a Roman numeral string to an integer.
        // It uses a HashMap to store the values of Roman characters and iterates through the   
        // string to calculate the total value based on the rules of Roman numeral representation.
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        // Traverse the string from end to start
        for (int i = s.length() - 1; i >= 0; i--) {
            int current = romanMap.get(s.charAt(i));

            if (current < prevValue) {
                total -= current;
            } else {
                total += current;
                prevValue = current;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));      
        System.out.println(romanToInt("LVIII"));    
        System.out.println(romanToInt("MCMXCIV"));  
    }
}


