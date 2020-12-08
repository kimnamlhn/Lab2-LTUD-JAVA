package vn.edu.hcmus.fit.lab02;

import java.util.LinkedList;

public class Exercise22 {
    public static void Function22()
    {
        LinkedList<Integer> linkedli = new LinkedList<Integer>();

        linkedli.add(new Integer(20));
        linkedli.add(new Integer(40));
        linkedli.add(new Integer(60));
        linkedli.add(new Integer(80));

        linkedli = reverseLinkedList(linkedli);
        System.out.print("Exercise22 - " + linkedli);
    }

    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> llist)
    {
        for (int i = 0; i < llist.size() / 2; i++) {
            Integer temp = llist.get(i);
            llist.set(i, llist.get(llist.size() - i - 1));
            llist.set(llist.size() - i - 1, temp);
        }

        return llist;
    }
}


