/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkList;

/**
 *
 * @author User
 */
public class MyLinkList {
    
    Node head;
    int listCount;
    
    public MyLinkList() {
        head = new Node(null);
        listCount = 0;
    }
    
    public void add(Object data) {
        Node temp = new Node(data);
        Node current = head;
        
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(temp);
        listCount++;
    }
    
    public void addAtIndex(Object data, int index) {
        Node temp = new Node(data);
        Node current = head;
        
        for (int i = 1; i < index && current.getNext() != null; i++) {
            current = current.getNext();
        }
        temp.setNext(current.getNext());
        current.setNext(temp);
        listCount++;
        
    }
    
    public Object get(int index) {
        Node current = head;
        if (index <= 0) {
            return null;
        }
        
        for (int i = 1; i <=index; i++) {
            if (current == null) {
                return null;
            }
            current = current.getNext();
        }
        return current.getData().toString();
        
    }
    
    public boolean remove(int index) {
        Node current = head;
        if (index <= 0) {
            return false;
        }
        
        for (int i = 1; i < index; i++) {
            if (current == null) {
                return false;
            }
            current = current.getNext();
        }
        current.setNext(current.getNext().getNext());
        return true;
    }
    
    @Override
    public String toString() {
        Node current = head.getNext();
        String output = "";
        while (current != null) {
            output += "[" + current.getData().toString() + "]";
            current = current.getNext();
        }
        return output;
    }
    
    private class Node {
        
        Object data;
        Node next;
        
        public Node(Object data) {
            this.data = data;
        }
        
        public Object getData() {
            return data;
        }
        
        public void setData(Object data) {
            this.data = data;
        }
        
        public Node getNext() {
            return next;
        }
        
        public void setNext(Node next) {
            this.next = next;
        }
        
        public Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }
        
    }
    
}
