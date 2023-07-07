package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int counter = 0;
        while(counter <= printToInclusive) {
            if(counter >= 0 && counter <= 9) {
                System.out.println(counter);
            }
        }
    }
}
