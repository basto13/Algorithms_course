package sem_3_tasks;

public class LinkedList {
    private Node head;
    private Node tail;

    class Node{
        private int value;
        private Node next;
        private Node previous;
    }

    public void addFirstNode(int value){
        Node node = new Node();
        node.value = value;
        if (head != null){
            node.next = head;
        }
        else {
            head = node;
        }
        node.previous = null;
        head = node;
    }

    private Node findNode(int value){
        Node node = head;
        while(node.next != null){
            node = node.next;
            if(node.value == value){
                return node;
            }
        }
        return null;
    }

    public void addLastNode(int value){
        Node node = new Node();
        node.value = value;

        tail.next = node;
        node.previous = tail;
        tail = node;
    }

    public void deleteFirstNode(int value){
        if (head != null){
            head = head.next;
        }
        head.previous = null;
    }


}
