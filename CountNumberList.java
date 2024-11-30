import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CountNumberList {
    public static void main(String[] args) {
        List<String> stringNumbers = List.of("88 99 200", "88 99 300", "99 32 100", "12 12 15");
        List<Integer> numberLists = new ArrayList<>();
        for (String strNumber : stringNumbers) {

            String[] listNumber = strNumber.split(" ");
            for (String strSingle : listNumber) {
                numberLists.add(Integer.parseInt(strSingle));
            }
            // System.out.println(strNumber);
        }

        Map<Integer, Long> freq = frequensiMap(numberLists);
        System.out.println(freq);
    }

    private static Map<Integer, Long> frequensiMap(List<Integer> list) {
        return list.stream()
                .collect(Collectors.groupingBy(num -> num, Collectors.counting()));
    }
}
