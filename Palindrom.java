public class Palindrom {

    public static void main(String[] args) {
        String text = "oto";
        System.out.println(text);

        text = text.toUpperCase();

        Boolean is_palindrom = isPalindrom(text);
        System.out.println(is_palindrom);
    }

    private static Boolean isPalindrom(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;

        }
        return true;

    }
}
