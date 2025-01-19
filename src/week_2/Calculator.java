package week_2;

public class Calculator {
    void powerOn(){
        System.out.println("전원을 켭니다.");
    }

    void powerOff(){
        System.out.println("전원을 끕니다.");
    }

    int plus(int x, int y){
        int result = x + y;
        return result;
    }

    double divide(int x, int y){
        double result = (double)x / (double)y;
        return result;
    }

    //정사각형 넓이
    double areaRectangle(double width){
        double result = width * width;
        return result;
    }

    //직사각형 넓이
    double areaRectangle(double width, double height){
        double result = width * height;
        return result;
    }
}
