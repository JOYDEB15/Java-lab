class grandfather{
    void company(){
        System.out.println("I have a company");
    }
}
class father extends grandfather{
    void car(){
        System.out.println("I have a car");
    }
}
class son extends father{
    void bike(){
        System.out.println("I have a bike");
    }
}
public class inheritance {
    public static void main(String[] args) {
        son s = new son();
        s.company();
        s.car();
        s.bike();
    }
}

