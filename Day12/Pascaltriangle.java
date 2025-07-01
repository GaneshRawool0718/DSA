package Day12;

public class Pascaltriangle {
    //Pascal's Triangle is a triangular array of the binomial coefficients.
    //Each number is the sum of the two numbers directly above it.  
    public static int[][] generate(int numRows) {
        int[][] triangle = new int[numRows][];
        for (int i = 0; i < numRows; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1; // First element is always 1
            triangle[i][i] = 1; // Last element is always 1
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j]; // Sum of the two elements above
            }
        }
        return triangle;
    }
}

class Client {
    public static void main(String[] args) {
        int numRows = 5; // Example input
        int[][] pascalTriangle = Pascaltriangle.generate(numRows);
        
        // Print the generated Pascal's Triangle
        for (int i = 0; i < pascalTriangle.length; i++) {
            for (int j = 0; j < pascalTriangle[i].length; j++) {
                System.out.print(pascalTriangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
