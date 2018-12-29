package Generic;

public class Exam {
    public static void main(String[] args) {
        GenericBox<Integer> box = new GenericBox<>();

        box.set(new Integer(5));
        Integer int1 = box.get();
        System.out.println(int1.toString());
    }
}