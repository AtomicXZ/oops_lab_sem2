import java.util.*;

public class GenericsExample {
    public static <T extends Number> double avg(ArrayList<T> arr) {
        double sum = 0;
        for (T num: arr) {
            sum += num.doubleValue();
        }

        return arr.size() == 0 ? 0 : sum/arr.size();

    }
    

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println("Integer List: " + intList);
        System.out.println("Average: " + avg(intList));

        ArrayList<Double> doubleList = new ArrayList<>(Arrays.asList(1.23, 4.56, 7.89, 10.11, 12.13));
        System.out.println("Double List: " + doubleList);
        System.out.println("Average: " + avg(doubleList));

    }
}
