package javaExam;

public class Exam02 {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.run();
        bus.안내방송();

        Car bus2 = new Bus();
        bus2.run();

        SportsCar sports = new SportsCar();
        sports.run();

        Car car = new SportsCar();
        car.run();
    }
}
