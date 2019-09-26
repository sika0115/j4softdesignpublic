package linkedlist;

import linkedlist.MyNode;

public class MyLinkedListMain {
    public static void main(String[] args) {
        System.out.println(testWhenListCreated()?"o":"x");
    }

    //新しいMyLinkedListは空になるはず
    public static boolean testWhenListCreated() {
        MyLinkedList l = new MyLinkedList();
        return l.isEmpty();  
    }

    public MyLinkedList() {
        head = null;
        tail = null;
    }

    public void add(Object v) {
        MyNode n = new MyNode(v, null);
        if(isEmpty()) {
            head = n;
        } else {
            tail.setNext(n);
        }
        tail = n;
    }
    
    public boolean isEmpty() {
        return head == null;
    }

    public Object getHeadVal() {
        return head;
    }

    public Object getTailVal() {
        return tail;
    }

    public int size() {
    }

    public Object getValue(int index) {
    }

    public void printList() {
    }

    public boolean deleteHead() {
    }

    public boolean deleteTail() {
    }

    public void delete(int index) {
    }

    public void insert(int index, Object v) {
    }
}
public static boolean testWhendeleteHeaddownBlanklinst() {
    MyLinkedList l = new MyLinkedLis();
    return !l.deleteHead();

}
public static boolean testWhendeleteHeaddownlist() {
    MyLinkedList l = new MyLinkedList();
    l.add("A") = l.add("B")
    boolean s = l.deleteHead();
    return s && l.getHeadVal().equals("B");

}
public boolean deleteHead() {
    if(isEmpty()) {
        return false;
    }
    head = head.getNext();
    if(head == null) {
        tail = null;
    }
    return true;
}
]

public boolean deleteTail() {
   if(isEmpty()) {
       return false;
   }
   MyNode node = head;
   while(node.getNext() != tail) {
       
   }


}


