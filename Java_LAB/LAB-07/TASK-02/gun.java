class Shape{
    int area(int a, int b){
        return a*b;
    }
    double area(double a){
        return 3.1416*a*a;
    }
}

public class gun {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        System.out.println("Area of rectangle:" +s1.area(10,12));
        System.out.println("Area of circle:" +s1.area(5));
    }
    
}
