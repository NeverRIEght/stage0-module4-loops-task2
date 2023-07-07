package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        boolean isNegative = multiplyByAndToInclusive < 0 ? true : false;
        int counter = 0;

        if(!isNegative) {
            while (counter <= multiplyByAndToInclusive) {
                System.out.println(counter * multiplyByAndToInclusive);
                counter++;
            }
        } else {
            while (counter <= multiplyByAndToInclusive * (-1)) {
                System.out.println(counter * multiplyByAndToInclusive * (-1));
                counter++;
            }
        }
    }
}
