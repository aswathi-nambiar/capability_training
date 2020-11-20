
public class Solution {
    public ListNode addTwoNumbers(ListNode list1, ListNode list2) {
        return calculate(list1, list2, 0); 
    }
    
        ListNode calculate(ListNode list1, ListNode list2, int carry)
       {
        if(list1==null&&list2==null&&carry==0) return null; 
            
        if(list1==null&&list2==null&&carry!=0) return new ListNode(1); 
            
	int temp=(list1==null? 0: list1.val)+ (list2==null? 0: list2.val)+ carry; 
            
	ListNode result=new ListNode(temp%10); 
	result.next=calculate(list1==null? null: list1.next, list2==null? null: list2.next, temp/10); 
        return result;
	 }
}