public class Exam {
    public static void main(String[] args) {
        ObjectBox objectBox = new ObjectBox();

        Integer int1 = new Integer(5);
        //Double int1 = new Double(10.1);
        objectBox.set(int1);
        Integer int2 = (Integer) objectBox.get();
        System.out.println(int2.toString());
    }
}
