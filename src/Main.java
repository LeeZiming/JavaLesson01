import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        int test = 0;
//        test = Calculation(1,2);
//        System.out.println("Calculation(1,2) = " + test);
        int[] m_array = {1,2,6,2,3,7,8,6,8};
        System.out.println("Old Array is " + Arrays.toString(m_array));

        Arrays.sort(m_array); //从小到大排序数组

//        for (int i =0; i< m_array.length;i++) {       //冒泡排序
//            for (int j = i+1; j < m_array.length; j++) {
//                if(m_array[i] > m_array[j]) {
//                    int tmp = m_array[j];
//                    m_array[j] = m_array[i];
//                    m_array[i] = tmp;
//                }
//            }
//        }

        System.out.println("New Array is " + Arrays.toString(m_array));
    }

    private static int Calculation(int a, int b) {
        int result = 0;
        result = a + b;
        System.out.println("result = " + result);
        return result;
    }

}
