class person{
    String name;
    int age;
    public person(String name, int age){
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class doctor extends person{
    doctor(String name, int age){
        super(name, age);
    }
    void treatment(){
        System.out.println(name + " treats patients and prescribes medicine");
    }
}
class teacher extends person{
    teacher(String name, int age){
        super(name, age);
    }
    void teaching(){
        System.out.println(name + " creates a better future by teaching studenst");
    }
}
class engineer extends person{
    engineer(String name, int age){
        super(name, age);
    }
    void programmer(){
        System.out.println(name + " codes and develops software");
    }
}
public class Hierarchical{
    public static void main(String[] args){
        doctor d = new doctor("Dr. Smith", 45);
        teacher t = new teacher("Mr. Johnson", 35);
        engineer e = new engineer("JOYDEB", 21);

        d.display();
        d.treatment();
        System.out.println();
        t.display();
        t.teaching();
        System.out.println();
        e.display();
        e.programmer();
    }
}