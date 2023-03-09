package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int result = first > second ? first : second;
        int res = result > third ? result : third;
        System.out.println(res);
    }
}
