public class linkedListTest {
    public static void main(String[] args) {
        linkedList li = new linkedList();

        System.out.println(li.size());

        li.addFirst("10");
        li.addFirst("20");
        li.addFirst("30");
        li.addFirst("40");

        li.printList();

        System.out.println(li.size());
        String r = li.removeFirst();
        System.out.println("r=" + r);

        r = li.removeLast();
        System.out.println("r_2=" + r);

        li.addLast("55");
        li.printList();

        linkedList li2 = new linkedList();
        li2.addLast("nn");
        li2.printList();

        // TEST on empty
        linkedList empty = new linkedList();
        empty.removeFirst();
        empty.removeLast();

        // Test on 1
        linkedList one = new linkedList();
        one.addLast("ONE");
        r = one.removeFirst();
        System.out.println("r" + r);
        one.addFirst("F");
        r = one.removeLast();
        System.out.println("r_3=" + r);

    }
}