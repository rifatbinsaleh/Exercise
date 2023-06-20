import java.io.*;
import java.util.*;
class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Numbers array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Emily");
        names.add("David");

        System.out.println("\nNames list:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
