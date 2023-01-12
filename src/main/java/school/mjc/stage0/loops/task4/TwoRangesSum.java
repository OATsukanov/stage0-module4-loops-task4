package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {

        int sumOfSkip = 0;
        int countedSum = 0;

        boolean isCorrect = true;

        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
            isCorrect = false;
        }

        if (lastInRow < 0) {
            System.out.println("last number in row is negative");
            isCorrect = false;
        }

        for (int i = numberToSkip; i <= lastInRow; i++) {

            if (isCorrect == false) break;
            if (i == numberToSkip) continue;
            countedSum += i;
        }

        for (int f = 1; f <= numberToSkip; f++) {

            if (isCorrect == false) break;
            sumOfSkip += f;
        }

        if (isCorrect == true) {
            System.out.println("skipped sum is " + sumOfSkip);
            System.out.println("counted sum is " + countedSum);
        }


    }
}
