public class Main2 {
    public static void main(String[] args) {
        Example3 ex3 = new Example3(22, "Rifat", new Example2(4846, "CSE"));
        System.out.println(ex3.age);
        System.out.println(ex3.name);
        System.out.println(ex3.ex2.id +ex3.ex2.course);
    }
}
