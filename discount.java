//Johana Kimutai
//CT101/G/19005/23
//06/02/2025
import java.util.Scanner;
public class discount {
    public static void main(String[] args){
        Scanner mdb = new Scanner(System.in);
        
        double salary = 0;
        double discount = 0;
    
        System.out.print("Please Enter Your Salary ");
        salary = mdb.nextInt();
        
        if(salary > 5000){
            discount = salary * 0.1;
        }
        else if(salary > 1000){
            discount = salary * 0.05;
        }
        else{
            discount = 0;
        }
        
        System.out.printf("Salary: Ksh %.2f", salary);
        System.out.printf("The Discount Is Ksh %.2f\n",discount);
        mdb.close();
    
    }
    
 
}
