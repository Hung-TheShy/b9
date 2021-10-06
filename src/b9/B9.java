
package b9;


import java.util.Scanner;
public class B9 {

  
    public static void main(String[] args) {
       int num , reversed = 0;
       System.out.print("nhap num");
    Scanner scanner = new Scanner(System.in);
         num = scanner.nextInt();
    while(num != 0) {
    
      
      int digit = num % 10;
      reversed = reversed * 10 + digit;

      
      num /= 10;
    }

    System.out.println("Reversed Number: " + reversed);
    }
    
}
