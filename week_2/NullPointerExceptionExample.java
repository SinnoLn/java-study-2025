package week_2;

public class NullPointerExceptionExample {
    public static void main(String[] args){
        //예외 1
        int[] intArray = null;
        intArray[0] = 10; //NullPointerException

        //예외 2
        String str = null;
        System.out.println("총 문자 수: " + str.length()); //NullPointerException
    }
}
