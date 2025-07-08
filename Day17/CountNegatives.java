package Day17;

public class CountNegatives {
// This class contains a method to count the number of negative numbers in a 2D grid.
// The grid is represented as a 2D array of integers.
    public int countNegatives(int[][] grid) {
        int count = 0;
        // Iterate through each element in the grid
        for(int i=0;i<grid.length;i++){
            for(int j=0;j <grid[i].length;j++){
                if(grid[i][j] < 0 ){
                    count++;
                }
            }
        }

        return count;
    }
}


