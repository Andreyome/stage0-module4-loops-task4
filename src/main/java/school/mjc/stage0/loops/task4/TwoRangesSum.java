package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int result=0;
        if(numberToSkip<=lastInRow && lastInRow>0){
            for(int i=0;i<=lastInRow;i++){
                if (i%numberToSkip==0){
                   result+=i;
                }
            }


        }
        else {
            if(lastInRow<0){
                System.out.println("last number in row is negative");
            }
            if (numberToSkip>lastInRow) {
                System.out.println("number to skip is bugger then the last");
            }
        }
        System.out.println("skipped sum is number "+result);

    }
}
