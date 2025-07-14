package Day21;

import java.util.Arrays;

public class MatchPlayersAndTrainers {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
    // Step 1: Sort both arrays in ascending order
    // This helps us try to match the weakest player with the weakest suitable trainer
    Arrays.sort(players);   
    Arrays.sort(trainers);
    
    // i: pointer for players
    // j: pointer for trainers
    int i = 0, j = 0;
    
    // Variable to count successful matches
    int matches = 0;

    // Step 2: Try to find the best match for each player
    // Loop until we reach the end of either array
    while (i < players.length && j < trainers.length) {

        // If the current trainer can train the current player
        if (players[i] <= trainers[j]) {
            matches++;  // We found a match
            i++;        // Move to the next player
            j++;        // Move to the next trainer (used up)
        } else {
            // Current trainer is too weak, try the next trainer
            j++;
        }
    }
    
    // Return the total number of matches found
    return matches;
}

}

// class MatchPlayersAndTrainersTest {
//     public static void main(String[] args) {
//         MatchPlayersAndTrainers matcher = new MatchPlayersAndTrainers();
        
//         // Example test case
//         int[] players = {4, 5, 6};
//         int[] trainers = {3, 4, 5};
        
//         int result = matcher.matchPlayersAndTrainers(players, trainers);
//         System.out.println("Number of matches: " + result); // Expected output: 2
//     }
// }
