public class Main {

    public static void main(String[] args) {
        int test = 0;
        test = Calculation(1,2);
        System.out.println("Calculation(1,2) = " + test);
    }

    private static int Calculation(int a, int b) {
        int result = 0;
        result = a + b;
        System.out.println("result = " + result);
        return result;
    }

}
