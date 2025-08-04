package Day36;

public class AverageSalary {
    /*
     * This method calculates the average salary excluding the minimum and maximum salaries.
     * It sums all salaries, finds the minimum and maximum, and then computes the average
     * excluding those two values.
     */
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int s : salary) {
            min = Math.min(min, s);
            max = Math.max(max, s);
            sum += s;
        }

        // Subtract min and max, then divide by remaining count
        return (double)(sum - min - max) / (salary.length - 2);
    }
}
