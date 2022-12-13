import java.util.ArrayList;

public class MergeLists {
    public static void main(String[] args) {
        int[] listOne = {4, 5, 6};
        int[] listTwo = {1, 5, 6};

        int sizeOfLengthOne = listOne.length;
        int sizeOfLengthTwo = listTwo.length;
        int i = 0, j = 0;

        ArrayList<Integer> result = new ArrayList<>();

        while(i < sizeOfLengthOne && j < sizeOfLengthTwo) {
            if (listOne[i] < listTwo[j]) {
                result.add(Integer.valueOf(listOne[i]));
                i++;
            } else {
                result.add(Integer.valueOf(listTwo[j]));
                j++;
            }
        }

        for (int k = i; k < listOne.length; k++) {
            result.add(Integer.valueOf(listOne[i]));
        }

        for (int k = j; k < listTwo.length; k++) {
            result.add(Integer.valueOf(listTwo[j]));
        }

        result.stream().forEach(System.out::println);
    }
}