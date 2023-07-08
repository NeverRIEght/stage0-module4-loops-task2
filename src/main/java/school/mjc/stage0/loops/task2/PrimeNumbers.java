package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        if(printToInclusive != 0) {
            int i = 0;
            while(i <= printToInclusive) {
                if(i >= 2) {
                    int j = 2;
                    boolean isPrime = true;
                    while(j <= i / 2) {
                        if(i % j == 0) {
                            isPrime = false;
                        }
                        j++;
                    }
                    if(isPrime == true) {
                        System.out.println(i);
                    }
                }
                i++;
            }
        }
    }
}
