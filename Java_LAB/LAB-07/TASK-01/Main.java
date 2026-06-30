import java.util.Scanner;
class calculator{
    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
}

public class Main {
    public static void main(String[] args) {
        calculator sum = new calculator();
        System.out.println("Sum of two integer number:"  +sum.add(10,12));
        System.out.println("Sum of two fraction number:"  +sum.add(2.5, 3.5));
        System.out.println("Sum of three integer number:"  +sum.add(7,6,9));
        
    }
}