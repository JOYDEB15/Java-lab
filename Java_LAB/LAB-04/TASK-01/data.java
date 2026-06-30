class car{
    String brand;
    String model;
    int price;
    car(String n, String i, int b){
        brand=n;
        model=i;
        price=b;
    }
    void display(){
        System.out.println("brand:" +brand);
        System.out.println("Model:" +model);
        System.out.println("Price:" +price);
    }
    }


public class data {
    public static void main(String[] args) {
       car s1 = new car("Mazda", "MX-5 Miata RF", 10);
       s1.display();
        
    }
    
}

