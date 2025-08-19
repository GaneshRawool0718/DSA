package Day45;

public class Maximum69Number {
    /**
     * Given a positive integer num consisting only of digits 6 and 9, 
     * you can flip exactly one digit 6 to a 9 to maximize the number.
     * Return the maximum number you can get.
     *
     * @param num the input number
     * @return the maximum number after flipping one digit
     */
    public int maximum69Number(int num){
        char[] chars = String.valueOf(num).toCharArray();

        for(int i=0; i<chars.length; i++){
            if(chars[i] == '6'){
                chars[i] = '9';
                break;
            }
        }
        String maxValue = new String(chars);
        return Integer.parseInt(maxValue);
    }
}

        
