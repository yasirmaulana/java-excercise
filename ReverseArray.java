/**
 * ReverseArray
 */
public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        balik(arr);

        for (int i : arr) {
            // System.out.println(i + ", ");
        }

        String[] arrString = { "y", "a", "s", "i", "r" };
        balikString(arrString);
        for (String word : arrString) {
            // System.out.println(word);
        }
    }

    private static void balik(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    private static void balikString(String[] arrString) {
        int left = 0;
        int right = arrString.length - 1;

        while (left < right) {
            String temp = arrString[left];
            arrString[left] = arrString[right];
            arrString[right] = temp;

            left++;
            right--;
        }
    }

}