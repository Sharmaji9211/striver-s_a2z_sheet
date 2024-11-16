package module1.java.collection.list;

import java.util.Stack;

class StackExamples {
    public static void runExamples() {
        Stack<String> stack1 = new Stack<>();
        stack1.push("A");
        stack1.push("B");
        stack1.push("C");
        System.out.println("Stack1: " + stack1);

        String topElement = stack1.pop();
        System.out.println("Stack1 after popping: " + stack1 + ", Popped element: " + topElement);

        topElement = stack1.peek();
        System.out.println("Peek at Stack1: " + topElement);

        boolean isEmpty = stack1.isEmpty();
        System.out.println("Is Stack1 empty: " + isEmpty);

        int position = stack1.search("A");
        System.out.println("Position of 'A' in Stack1: " + position);

        stack1.push("D");
        System.out.println("Stack1 after pushing 'D': " + stack1);

        stack1.clear();
        System.out.println("Stack1 after clearing: " + stack1);

        Stack<Integer> stack2 = new Stack<>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        System.out.println("Stack2: " + stack2);

        int intElement = stack2.pop();
        System.out.println("Stack2 after popping: " + stack2 + ", Popped element: " + intElement);

        stack2.push(4);
        stack2.push(5);
        System.out.println("Stack2 after pushing 4 and 5: " + stack2);

        stack2.removeAllElements();
        System.out.println("Stack2 after removing all elements: " + stack2);
    }
}
