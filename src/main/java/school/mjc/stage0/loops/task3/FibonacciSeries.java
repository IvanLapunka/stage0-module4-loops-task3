package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int f = 0;
        int s = 1;
        if (1 <= lastFibonacci) {
            System.out.println(f);
        }
        if (2 <= lastFibonacci) {
            System.out.println(s);
        }
        int k = 3;
        while (k <= lastFibonacci) {
            s = f + s;
            f = s - f;
            System.out.println(s);
            k++;
        }
    }
}
