import java.util.ArrayList;
import java.util.List;

public class MinMaxSum {

    public static void main(String[] args) {
        List<Integer> arr = List.of(1, 2, 3, 4, 5);

        findMinMaxSum(arr);
    }

    private static void findMinMaxSum(List<Integer> arrNumber) {
        List<Integer> sumNumberList = new ArrayList<>();
        for (Integer i = 0; i < arrNumber.size(); i++) {
            Integer sumNumber = 0;
            for (int j = 0; j < arrNumber.size(); j++) {
                if (i != j) {
                    sumNumber += arrNumber.get(j);
                }
            }
            sumNumberList.add(sumNumber);
        }
        System.out.println(sumNumberList);
        System.out.println(getMin(sumNumberList));
        System.out.println(getMax(sumNumberList));
    }

    private static Integer getMin(List<Integer> numberList) {
        Integer min = numberList.get(0);
        for (Integer numb : numberList) {
            if (numb < min) {
                min = numb;
            }
        }
        return min;
    }

    private static Integer getMax(List<Integer> numberList) {
        Integer max = numberList.get(0);
        for (Integer numb : numberList) {
            if (numb > max) {
                max = numb;
            }
        }
        return max;
    }
}
