package LinkedList;

public class DivideACircularLinkedList {

    public static void main(String[] args) {

    }
}
/*
 h      h2
 |      |
 1-> 2  3->4->(1)
 ||  |  |
 sf  s  f

 h                  h2
 |                   |
 1 -> 2 -> 3 -> 4    5 -> 6 -> 7 -> 8 -> (1)
 sf             s              f

 h                   h2
 |                   |
 1 -> 2 -> 3 -> 4    5 -> 6 -> 7 -> (1)
 sf             s              f

 while(f.next != head && f.next.next != head) {
    s = s.next;
    f = f.next.next;
 }
 h2 = s.next;
 s.next = null;
 if (f.next==head) f.next = null
 else f.next.next = null;
 */
