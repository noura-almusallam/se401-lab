public class Example {
    public static void main(String[] args) {
        int unusedVariable = 0; // Unused variable
        System.out.println("Hello World!");
        if (true) {
            // Empty block
        }
        System.out.println("This line exceeds the 100 character limit which is a common style issue that linters might flag as problematic");
    }
}

2- 
import java.util.*;

public class SampleClass {
   public static final int MAGIC_NUMBER = 42; // Should be defined with better context or avoided

   // Method with issues: poor naming, missing Javadoc, magic numbers, long method
   public void doStuff(){
       int x = 10; // Unused variable
       for(int i=0;i<MAGIC_NUMBER;i++){
           System.out.println("Iteration: " + i);
       }

       String s = "hello"; String s2 = "world";  // Multiple statements on one line
       System.out.println(s + s2);

       if(true) {  // Redundant if statement, hardcoded true
           System.out.println("This will always print");
       }
   }

    // Improper naming convention and missing Javadoc
    private int getnumber() {
        return 123;
    }

    // Code has inconsistent indentation and a missing space around operators
    public void performCalculation(int a,int b){
        int result =a+b; // No spaces around operators
        if(a>b){
            System.out.println("A is greater than B"); // Inconsistent indentation
        }else{
            System.out.println("B is greater than or equal to A"); // No space before 'else'
        }
    }
}

