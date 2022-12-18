package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        if(toBreakWith<numberToGoUntil && toBreakWith>0 && numberToGoUntil>0){
            for(int i=1;i<=toBreakWith;i++){
                System.out.println(i);
            }
        }
        if(toBreakWith>numberToGoUntil){
            System.out.println("iterating till the end");
            for(int i=1;i<=numberToGoUntil;i++){
                System.out.println(i);
            }
        }

    }
}
