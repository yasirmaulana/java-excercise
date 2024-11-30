public class ReverseString {

    public static void main(String[] args) {
        String orangBaik = "sayaadalahorangbaik";

        String kata = balikKata(orangBaik);
        System.out.println(kata);

    }

    private static String balikKata(String str) {

        char[] charArray = str.toCharArray();

        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }
        return new String(charArray);
    }
}
