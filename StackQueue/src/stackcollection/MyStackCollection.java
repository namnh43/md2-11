package stackcollection;

import java.util.Arrays;
import java.util.Stack;

public class MyStackCollection {
    private Stack<Integer> myIntegerStack;
    private int [] array = {1,2,3,4,5,6,7};

    public MyStackCollection() {
        myIntegerStack = new Stack<>();
    }
    public void rotatedArray() {
        for(int i: array) {
            myIntegerStack.add(i);
        }
        for (int index = 0; index < array.length; index ++) {
            array[index] = myIntegerStack.pop();
        }
    }

    @Override
    public String toString() {
        return "MyStackCollection{" +
                "myIntegerStack=" + myIntegerStack +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
