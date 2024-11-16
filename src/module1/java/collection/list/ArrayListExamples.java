package module1.java.collection.list;
import java.util.ArrayList;
import java.util.Arrays;
// ArrayList Class Examples
 class ArrayListExamples {
    public static void runExamples() {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("A");
        arrayList1.add("B");
        arrayList1.add("C");
        System.out.println("ArrayList1: " + arrayList1);

        arrayList1.add(1, "D");
        System.out.println("ArrayList1 after adding 'D' at index 1: " + arrayList1);

        arrayList1.remove("B");
        System.out.println("ArrayList1 after removing 'B': " + arrayList1);

        arrayList1.remove(2);
        System.out.println("ArrayList1 after removing element at index 2: " + arrayList1);

        arrayList1.set(0, "Z");
        System.out.println("ArrayList1 after setting 'Z' at index 0: " + arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>(Arrays.asList("X", "Y", "Z"));
        arrayList1.addAll(arrayList2);
        System.out.println("ArrayList1 after adding all elements from ArrayList2: " + arrayList1);

        arrayList1.clear();
        System.out.println("ArrayList1 after clearing: " + arrayList1);

        arrayList1.add("A");
        arrayList1.add("B");
        arrayList1.add("C");
        arrayList1.trimToSize();
        System.out.println("ArrayList1 after trimToSize: " + arrayList1);

        ArrayList<Integer> arrayList3 = new ArrayList<>();
        arrayList3.add(10);
        arrayList3.add(20);
        arrayList3.add(30);
        System.out.println("ArrayList3: " + arrayList3);

        arrayList3.ensureCapacity(100);
        System.out.println("ArrayList3 after ensureCapacity(100): " + arrayList3);
    }
    
 
}
 
 
