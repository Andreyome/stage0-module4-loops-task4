package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {

        int result=0;
        int result2=0;
        if(numberToSkip<=lastInRow && lastInRow>0){
            for (int j=1;j<=numberToSkip;j++){
                result+=j;
            }
            for(int i=(numberToSkip+1);i<=lastInRow;i++){
result2+=i;
            }
            System.out.println("skipped sum is "+result);
            System.out.println("counted sum is "+result2);

        }
        else {
            if(lastInRow<0){
                System.out.println("last number in row is negative");
            }
            if (numberToSkip>lastInRow) {
                System.out.println("number to skip is bugger then the last");
            }
        }
    
    }
}
