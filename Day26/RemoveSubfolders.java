package Day26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveSubfolders {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder); // Step 1: Sort folders
        List<String> result = new ArrayList<>();

        for (String f : folder) {
            // Step 2: Check if current folder is a sub-folder of the last one in result
            if (result.isEmpty() || !f.startsWith(result.get(result.size() - 1) + "/")) {
                result.add(f);
            }
        }

        return result;
    }
}

// class Client {
//     public static void main(String[] args) {
//         RemoveSubfolders rm = new RemoveSubfolders();

//         String[] folder = {"/a","/a/b","/c/d","/c/d/e","/c/f"};
//         List<String> data = rm.removeSubfolders(folder);

//         System.err.println(data);
//     }
// }
