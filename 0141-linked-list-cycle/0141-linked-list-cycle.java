public class Solution {
    public boolean hasCycle(ListNode head) {
        
        // ListNode slow = head;
        // ListNode fast = head;
        // HashSet<Node> set = new HashSet<>();

        // while(fast != null && fast.next != null){

        //     slow = slow.next;
        //     fast = fast.next.next;

        //     if(slow==fast) return true;

        // }

        // return false;

        ListNode temp = head;
        Set<ListNode> set = new HashSet<>();

        while(temp != null){

            if(set.contains(temp)){
                return true;
            }

            set.add(temp);
            temp=temp.next;
        }
        return false;
    }
}