package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        // 0
        boolean isNegative = power < 0;
        int counter = 0;

        if(isNegative) {
            System.out.println("too much power");
        } else {
            while(counter <= power) {
                System.out.println(Math.pow(2, counter));
                counter++;
            }
        }
    }
}
