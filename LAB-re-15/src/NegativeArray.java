public class NegativeArray {
    public static void main(String[] args) {

        try {
            int[] a = new int[-2];
            System.out.println("Array size is positive");
        } catch (NegativeArraySizeException e) {
            System.out.println("Array size is Negative!");
        } finally {
            System.out.println("Example of negative array size.");
        }
    }
}
