package Seminar3;

import java.util.Comparator;

public class LinkedList<T> {

    private Node head;
    
    class Node {

        public Node next;

        public T value;
    }

    public void addFirst(T first) {
        Node node = new Node();
        node.value = first;
        if (head != null){
            node.next = head;
        }
        head = node;
    }

    public void removeFirst(){
        if (head != null){
            head = head.next;
        }
    }

    public T contains(T value){
        Node node = head;
        while (node != null){
            if (node.value.equals(value))
                return node.value;
            node = node.next;
        }
        return null;
    }

    public void sort(Comparator<T> comparator){
        Node node = head;
        while (node != null) {
            Node minValueNode = node;

            Node node2 = node.next;
            while (node2 != null) {
                if (comparator.compare(minValueNode.value, node2.value) > 0) {
                    minValueNode = node2;
                }
                node2 = node2.next;
            }

        if (minValueNode != node) {
            T buf = node.value;
            node.value = minValueNode.value;
            minValueNode.value = buf;
        }
        node = node.next;
        }
    }

    public void addLast(T value){
        Node node = new Node();
        node.value = value;
        if (head == null){
            head = node;
        }
        else {
            Node lastNode = head;
            while(lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = node;
        }
    }

    public void removeLast() {
        if (head == null) 
            return;
        Node node = head;
        while (node.next != null) {
            if (node.next.next == null) {
                node.next = null;
                return;
            }
        }

        head = null;
    }

    public String print(SortDirect sortDirect){
        StringBuilder stringBuilder = new StringBuilder();
        Node node = head;
        while (node != null){
            stringBuilder = sortDirect == SortDirect.Descending ? stringBuilder.append(node.value + "\n"):
                stringBuilder.insert(0, node.value+"\n");
            node = node.next;
        }
        return stringBuilder.toString();
    }
}
