import java.util.Arrays;

public class Rotate {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int d = 1;
        int[] rotatedArr = rotLeft(array, d);
        System.out.println(Arrays.toString(rotatedArr).replaceAll("[\\\\[\\\\],]", ","));
    }
    public static int[] rotLeft(int[] a, int d) {
        int n = a.length;
        d = d % n;
        int[] rotatedArr = new int[n];
        System.arraycopy(a, d, rotatedArr, 0, n - d);
        System.arraycopy(a, 0, rotatedArr, n - d, d);
        return rotatedArr;
    }
}