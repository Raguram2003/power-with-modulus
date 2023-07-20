import java.util.Scanner;

class Solution{
    public int findAnswer(int a,int b,int c){
        int result=1;
        for(int i=1;i<=b;i++){
            a= a % c;
            result = (result * a) % c;
        }
        return result;
    }
}

public class PowerWithModulus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of A: ");
        int A = sc.nextInt();
        System.out.println("enter the value of B: ");
        int B = sc.nextInt();
        System.out.println("enter the value of C: ");
        int C = sc.nextInt();
        Solution answer = new Solution();
        System.out.println(answer.findAnswer(A,B,C));
    }
}
