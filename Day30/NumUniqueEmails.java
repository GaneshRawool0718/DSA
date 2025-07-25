package Day30;

import java.util.HashSet;
import java.util.Set;

public class NumUniqueEmails {
     public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();
        
        for (String email : emails) {
            // Split the email into local and domain parts
            String[] parts = email.split("@");
            String local = parts[0];
            String domain = parts[1];
            
            // Remove everything after the first '+' in the local part
            int plusIndex = local.indexOf('+');
            if (plusIndex != -1) {
                local = local.substring(0, plusIndex);
            }
            
            // Remove all periods '.' from the local part
            local = local.replace(".", "");
            
            // Reconstruct the normalized email and add it to the set
            String normalizedEmail = local + "@" + domain;
            uniqueEmails.add(normalizedEmail);
        }
        
        // Return the size of the set, which contains only unique email addresses
        return uniqueEmails.size();
    }
}
