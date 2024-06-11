import java.util.Arrays;

public class RotLeft {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int d = 1;
        int[] rotatedArray = rotLeft(array, d);
        System.out.println(Arrays.toString(rotatedArray).replaceAll("[\\\\[\\\\],]", ""));
    }
    public static int[] rotLeft(int[] a, int d) {
        int n = a.length;
        d = d % n;
        int[] rotatedArray = new int[n];
        System.arraycopy(a, d, rotatedArray, 0, n - d);
        System.arraycopy(a, 0, rotatedArray, n - d, d);
        return rotatedArray;
    }
}
