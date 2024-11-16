package module1.java.collection.list;

import java.util.Arrays;
import java.util.Vector;

class VectorExamples {
    public  static void runExamples() {
        Vector<Integer> vector1 = new Vector<>();
        vector1.add(10);
        vector1.add(20);
        vector1.add(30);
        System.out.println("Vector1: " + vector1);

        vector1.add(1, 15);
        System.out.println("Vector1 after adding 15 at index 1: " + vector1);

        vector1.remove(2);
        System.out.println("Vector1 after removing element at index 2: " + vector1);

        vector1.set(0, 5);
        System.out.println("Vector1 after setting 5 at index 0: " + vector1);

        vector1.addAll(Arrays.asList(40, 50, 60));
        System.out.println("Vector1 after adding a list of elements: " + vector1);

        vector1.clear();
        System.out.println("Vector1 after clearing: " + vector1);

        vector1.add(100);
        vector1.add(200);
        vector1.add(300);
        System.out.println("Vector1 after adding elements again: " + vector1);

        int firstElement = vector1.firstElement();
        System.out.println("First element in Vector1: " + firstElement);

        int lastElement = vector1.lastElement();
        System.out.println("Last element in Vector1: " + lastElement);

        vector1.trimToSize();
        System.out.println("Vector1 after trimToSize: " + vector1);
    }
}
