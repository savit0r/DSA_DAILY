public class Recursion{
    public static int fact(int n){
        
        //BASE CONDITION
        if(n == 0 || n == 1){
            return 1;
        }
        else
        return n * fact(n-1);
    }

    public static void main(String[] args){
        System.out.println("Factorial of 5 :" + fact(5));
    }
}