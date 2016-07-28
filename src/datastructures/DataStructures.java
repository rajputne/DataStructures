/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import LinkList.LinkList;
import LinkList.MyLinkList;

/**
 *
 * @author User
 */
public class DataStructures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkList myList = new LinkList();
        myList.add("1");
        myList.add("3");
        myList.addAtIndex("2", 2);
        System.out.println(myList);
        myList.remove(2);
        System.out.println(myList);
        System.out.println(myList.get(1));

        System.out.println("===========My Test==================");
        MyLinkList myList1 = new MyLinkList();
        myList1.add("1");
        myList1.add("3");
        myList1.addAtIndex("2", 2);
        System.out.println(myList1);
        myList1.remove(2);
        System.out.println(myList1);
        System.out.println(myList1.get(1));

    }

}
