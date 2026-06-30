import java.util.Scanner;
public class Main {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
         
        System.out.print("Enter Starting Number: "); 
        int starNum = sc.nextInt(); 
         
        System.out.print("Enter Ending Number: "); 
        int endNum = sc.nextInt(); 
 
      
        int[] evenArray = new int[endNum - starNum + 1]; 
        int count = 0; 
 
        while (starNum <= endNum) { 
            if (starNum % 2 == 0) { 
                evenArray[count] = starNum; 
                count++; 
            } 
            starNum++; 
        } 
 
        System.out.println("Even Numbers stored in Array:"); 
        for (int i = 0; i < count; i++) { 
            System.out.print(evenArray[i] + " "); 
        } 
    }
}
