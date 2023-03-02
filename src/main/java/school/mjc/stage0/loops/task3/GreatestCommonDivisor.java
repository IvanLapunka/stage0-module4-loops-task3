package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        if (first < second) {
            int tmp = first;
            first = second;
            second = tmp;
        }
        while (first != second && second != 0) {
            first = first % second;
            int tmp = first;
            first = second;
            second = tmp;
        }
        System.out.println(first);
    }
}
