class Solution:
    def mergeTwoLists(self, list1: ListNode, list2: ListNode) -> ListNode:
        if list1 == None:
            return list2
        if list2 == None:
            return list1
        
        head, otherNode = (list1, list2) if list1.val < list2.val else (list2, list1)
        
        currNode = head
        
        while currNode.next:
            if currNode.next.val > otherNode.val:
                temp = currNode.next
                currNode.next = otherNode
                otherNode = temp
            currNode = currNode.next
            
        currNode.next = otherNode
        return head
