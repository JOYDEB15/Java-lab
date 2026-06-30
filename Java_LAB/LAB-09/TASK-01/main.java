package project1;

class Student {  
     
    private String name;  
    private String id; 
    private double cgpa;  

    void setName(String name) {  
        this.name = name;  
    }  
    void setId(String id) { 
        this.id = id;  
    }  
    void setCgpa(double cgpa) {  
        this.cgpa = cgpa;  
    }  

    String getName() {  
        return name;  
    }  
    String getId() { 
        return id;  
    }  
    double getCgpa() {  
        return cgpa;  
    }  
}  

public class main {  
    public static void main(String[] args) {  
        Student s = new Student();  
        s.setName("Joydeb Kumar Nath");  
        s.setId("E253055");  
        s.setCgpa(3.805);  

        System.out.println("Name: " + s.getName());  
        System.out.println("ID: " + s.getId());  
        System.out.println("CGPA: " + s.getCgpa());  
    }
}
