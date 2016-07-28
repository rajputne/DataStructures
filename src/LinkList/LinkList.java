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
public class LinkList {

    Node head;
    int listcount;

    public LinkList() {
        head = new Node(null);
        listcount = 0;
    }

    public Node add(Object data) {
        Node temp = new Node(data);
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(temp);
        listcount++;
        return temp;
    }

    public boolean remove(int index) {

        Node current = head;
        if (index < 1 || index > size()) {
            return false;
        }
        for (int i = 1; i < index; i++) {
            if (current.getNext() == null) {
                return false;
            }
            current = current.getNext();
        }
        current.setNext(current.getNext().getNext());

        listcount--;
        return true;
    }

    public int size() {
        return listcount;
    }

    public Object get(int index) {

        if (index <= 0) {
            return null;
        }

        Node current = head.getNext();
        for (int i = 1; i < index; i++) {
            if (current == null) {
                return null;
            }
            current = current.getNext();
        }
        listcount++;
        return current.getData();
    }

    public Node addAtIndex(Object data, int index) {
        Node temp = new Node(data);
        Node current = head;
        for (int i = 1; i < index && current.getNext() != null; i++) {
            current = current.getNext();
        }
        temp.setNext(current.getNext());
        current.setNext(temp);
        listcount++;
        return temp;
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

        Node(Object data) {
            this.data = data;
        }

        Node(Object data, Node next) {
            this.data = data;
            this.next = next;
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

    }

}
