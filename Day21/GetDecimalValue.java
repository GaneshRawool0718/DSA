package Day21;

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
public class GetDecimalValue {
    /*
     * This class implements a method to convert a binary number represented by a linked list into its decimal value.
     * The linked list is traversed from head to tail, and the binary digits are processed
     */
     public int getDecimalValue(ListNode head) {
        // Initialize result to 0
        // Traverse the linked list and compute the decimal value
        int result = 0;
        while(head != null){
            result = result * 2 + head.val;
            // Debugging output to trace the computation
            System.out.println("Current Node Value: " + head.val);
            System.out.println(head); 
            head = head.next; // Move to the next node
        }

        return result;
        
    }
}

// class Client {
//     public static void main(String[] args) {
//         // Example usage
//         ListNode node3 = new ListNode(1);
//         ListNode node2 = new ListNode(0, node3);
//         ListNode head = new ListNode(1, node2);

//         GetDecimalValue solution = new GetDecimalValue();
//         int decimalValue = solution.getDecimalValue(head);
//         System.out.println("Decimal Value: " + decimalValue); // Output: 5
//     }
// }