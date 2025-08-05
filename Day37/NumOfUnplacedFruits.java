package Day37;

public class NumOfUnplacedFruits {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int unplaced = 0;
        boolean[] used = new boolean[baskets.length];

        for (int i = 0; i < fruits.length; i++) {
            boolean placed = false;
            for (int j = 0; j < baskets.length; j++) {
                if (!used[j] && baskets[j] >= fruits[i]) {
                    used[j] = true;
                    placed = true;
                    break;
                }
            }
            if (!placed) {
                unplaced++;
            }
        }

        return unplaced;
    }
}



class Client {
    public static void main(String[] args) {
        NumOfUnplacedFruits solution = new NumOfUnplacedFruits();
        int[] fruits = {2, 3, 5, 7};
        int[] baskets = {3, 5, 6};

        int result = solution.numOfUnplacedFruits(fruits, baskets);
        System.out.println("Number of unplaced fruits: " + result); // Output: 1
    }
}