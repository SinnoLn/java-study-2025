package week_1;

public class SumFromTo100Example {
    public static void main(String[] args){
        int sum = 0;
        int i;

        for(i=0; i<=100; i++){
            sum += i;
        }
        System.out.println("1~" + (i-1) + " 합 " + sum);
    }
}
