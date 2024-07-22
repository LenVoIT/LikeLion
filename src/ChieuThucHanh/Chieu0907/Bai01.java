package ChieuThucHanh.Chieu0907;


import java.util.LinkedList;

public class Bai01 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    class Solution {
        public ListNode middleNode(ListNode head) {
            //khởi tạo biến size để đếm số lượng node
            int size = 0;
            //Khởi tạo biến node vị trí là head để lặp qua danh sách node
            ListNode node = head;

            while(node != null){
                //Trỏ đến null thì ngưng, không null thì cập nhật vị trí qua node tiếp theo
                size++;
                //Cập nhật node để trỏ tới nút tiếp theo.
                node = node.next;
            }

            int middleNode = size / 2;
            ListNode result = head;
            for(int i = 0; i < middleNode; i++){
                result = result.next;
            }
            return result;
        }

    }
    public static void main(String[] args) {
        LinkedList<Integer> linkedListInt = new LinkedList<>();
        linkedListInt.add(1);
        linkedListInt.add(2);
        linkedListInt.add(3);
        linkedListInt.add(4);
        linkedListInt.add(5);
        System.out.println(linkedListInt);



    }
}
/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }

class Solution {
    public ListNode middleNode(ListNode head) {
        //khởi tạo biến size để đếm số lượng node
        int size = 0;
        //Khởi tạo biến node vị trí là head để lặp qua danh sách node
        ListNode node = head;

        while(node != null){
            //Trỏ đến null thì ngưng, không null thì cập nhật vị trí qua node tiếp theo
            size++;
            //Cập nhật node để trỏ tới nút tiếp theo.
            node = node.next;

        }
        System.out.println(size);
        int middleNode = size / 2;
        ListNode result = head;
        for(int i = 0; i < middleNode; i++){
            result = result.next;
        }
        return result;
    }

}
 */