public class Test {

    public static void main(String[] args) {
        int a = 20, b = 30, c = 10;
        try {
            int x = (a * b) / (a - b + c);
            System.out.println("Result: " + x);
        } catch (NegativeArraySizeException e) {
            System.out.println("Result: " + e);

        }
    }
}
