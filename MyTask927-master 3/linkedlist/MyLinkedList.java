package linkedlist;

public class MyLinkedList {
    private MyNode head;
    private MyNode tail;

    //空のリストを作成
    public MyLinkedList() {
        head = null;
        tail = null;
    }

    private void add(Object v) {
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
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("リストが空です");
        }
        return head.getValue();
    }
    private Object getTailVal() {
        if(isEmpty()) {
            throw new IndexOutOfBoundsException("リストがからです");
        }
        return tail.getValue();
    }
    public int size() {
        MyNode cur = head;
        int s = 0;
        while (cur != null) {
            cur = cur.getNext();
            s++;
        }
        return s;
    }
    public Object getValue(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Indexが0未満");
        }
        int count = 0;
        MyNode node = head;
        while (count != index) {
            node = node.getNext();
            if (node == null) {
                throw new IndexOutOfBoundsException("Indexが要素数以上");
            }
            count++;
        }
        return node.getValue();
    }
    public void printList() {
        MyNode node = head;
        while (node != null) {
            System.out.println(node.getValue() + " -> ");
            node = node.getNext();
        }
        System.out.println();
    }
    public boolean deleteHead() {
        if (isEmpty()) {
            return false;
        }
        head = head.getNext();
        if (head == null) {
            tail =null;
        }
        return true;
    }
    public boolean deleteTail() {
        if (isEmpty()) {
            return false;
        }
        MyNode node = head;
        while (node.getNext() != tail) {
            node = node.getNext();
        }
        node.setNext(null);
        tail = node;
        return true;
    }
    public void delete(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("indexが要素数未満");
        }
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("リストが空");
        }
        if (index == 0) {
            deleteHead();
            return;
        }
        MyNode node = head;
        int count = 0;
        while (count < index - 1) {
            if (node == tail) {
                throw new IndexOutOfBoundsException("indexが要素数以上");
            }
            node = node.getNext();
            count++;
        }
        if (node == tail) {
            throw new IndexOutOfBoundsException("Indexが要素数以上");
        }
        node.setNext(node.getNext().getNext());
        if (node.getNext() == null) {
            tail = node;
        }
    }
    public void insert(int index, Object v) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("indexが0未満");
        }
        if (index == 0) {
            MyNode node = new MyNode(v, head);
            head = node;
            if (node.getNext() == null) {
                tail = node;
            } 
            return;
        }
        MyNode node = head;
        int count = 0;
        while (count < index - 1) {
            if (node == null) {
                throw new IndexOutOfBoundsException("indexが要素数より大きい");
            }
            node = node.getNext();
            count++;
        }
        if (node == null) {
            throw new IndexOutOfBoundsException("indexが要素数より大きい");
        }
        MyNode C = new MyNode(v, node.getNext());
        node.setNext();
        if (C.getNext() == null) {
            tail = C;
        }
    }
}





