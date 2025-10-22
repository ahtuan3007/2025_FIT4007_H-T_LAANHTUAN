package laptrinhtongquat.bai2;

public class ChampionFinder {

    public static <T extends Comparable<T>> T findMax(T[] array) {

        if (array == null || array.length == 0) {
            return null;
        }

        T max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

        Integer[] numbers = {10, 55, 23, 8, 102, 45};
        Integer maxNumber = findMax(numbers);
        System.out.println("Nhà vô địch (Số): " + maxNumber);

        System.out.println("--------------------");

        String[] names = {"Kiên", "An", "Hùng", "Bình", "Tuấn"};
        String maxName = findMax(names);
        System.out.println("Nhà vô địch (Chuỗi): " + maxName);

        System.out.println("--------------------");

        Double[] scores = {9.5, 8.0, 9.75, 9.2};
        Double maxScore = findMax(scores);
        System.out.println("Nhà vô địch (Điểm): " + maxScore);
    }
}