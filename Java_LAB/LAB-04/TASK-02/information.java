class Idcard{
    String name,department,id,institution;
    Idcard(String a, String b, String c, String d){
        name=a;
        department=b;
        id=c;
        institution=d;
    }
void showId(){
    System.out.println("Name:" +name);
     System.out.println("Department:" +department);
      System.out.println("id:" +id);
       System.out.println("institution:" +institution);
}
}

public class information {
    public static void main(String[] args) {
        Idcard s1 = new Idcard("JOYDEB", "CCE", "E253055", "IIUC");
        s1.showId();
    }
    
}
