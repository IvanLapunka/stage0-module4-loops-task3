package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        int curr = 0;
        for (int i = 1; i <= lengthOfLastNumber; i++){
            curr *= 10;
            curr += 9;
            sum += curr;
        }
        System.out.println(sum);
    }
}
