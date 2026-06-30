class Shape{
    void draw(){
        System.out.println("Drawing shape");
    }
}
class circle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing circle");
    }
}
class rectangle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing rectangle");
    }
}

public class overriding1 {
    public static void main(String[] args){
        Shape s1 = new Shape();
        Shape s2 = new circle();
        Shape s3 = new rectangle();
        s1.draw();
        s2.draw();
        s3.draw();
    }
    
}
