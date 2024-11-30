import java.util.List;

public class PlusMinus {
    public static void main(String[] args) {
        List<Integer> plusMinusData = List.of(-4, 3, -9, 0, 4, 1);
        printAvgPositifNegatifZero(plusMinusData);
    }

    private static void printAvgPositifNegatifZero(List<Integer> data) {
        Double jmlPositif = 0.0;
        Double jmlNegatif = 0.0;
        Double jmlZero = 0.0;
        for (Integer num : data) {
            if (num == 0) {
                jmlZero++;
            } else if (num > 0) {
                jmlPositif++;
            } else {
                jmlNegatif++;
            }
        }

        int jmlData = data.size();
        System.out.println(String.format("%.6f", jmlPositif / jmlData));
        System.out.println(String.format("%.6f", jmlNegatif / jmlData));
        System.out.println(String.format("%.6f", jmlZero / jmlData));
    }

}
