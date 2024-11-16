package module1.java.collection.list;
import java.util.LinkedList;
import java.util.Arrays;
class LinkedListExamples {
    public static void runExamples() {
        LinkedList<String> linkedList1 = new LinkedList<>();
        linkedList1.add("One");
        linkedList1.add("Two");
        linkedList1.add("Three");
        System.out.println("LinkedList1: " + linkedList1);

        linkedList1.addFirst("Zero");
        System.out.println("LinkedList1 after adding 'Zero' at first position: " + linkedList1);

        linkedList1.addLast("Four");
        System.out.println("LinkedList1 after adding 'Four' at last position: " + linkedList1);

        linkedList1.removeFirst();
        System.out.println("LinkedList1 after removing first element: " + linkedList1);

        linkedList1.removeLast();
        System.out.println("LinkedList1 after removing last element: " + linkedList1);

        linkedList1.push("Negative One");
        System.out.println("LinkedList1 after pushing 'Negative One': " + linkedList1);

        linkedList1.pop();
        System.out.println("LinkedList1 after popping: " + linkedList1);

        LinkedList<Integer> linkedList2 = new LinkedList<>(Arrays.asList(1, 2, 3));
        linkedList2.add(4);
        System.out.println("LinkedList2: " + linkedList2);

        Integer firstElement = linkedList2.peek();
        System.out.println("First element in LinkedList2 (peek): " + firstElement);

        LinkedList<String> linkedList3 = new LinkedList<>();
        linkedList3.add("A");
        linkedList3.add("B");
        linkedList3.add("C");
        linkedList1.addAll(linkedList3);
        System.out.println("LinkedList1 after adding all elements from LinkedList3: " + linkedList1);
    }
}
