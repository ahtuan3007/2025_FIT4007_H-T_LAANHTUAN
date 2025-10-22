package laptrinhtongquat.bai1;

public class Main {

    public static void main(String[] args) {
        Pair<String, Integer> myPair = new Pair<>("Số lượng", 100);

        System.out.println("Key: " + myPair.getKey());
        System.out.println("Value: " + myPair.getValue());
        Pair<Integer, String> anotherPair = new Pair<>(1, "Một");

        System.out.println("Key: " + anotherPair.getKey());
        System.out.println("Value: " + anotherPair.getValue());
    }
}