import java.util.Scanner;

public class check_prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        boolean isPrime = true;

        for(int i= 2; i<N-1; ++i){
            if(N%i == 0){
                isPrime= false;
                break;
            }
        }
        System.out.println(isPrime);

        sc.close();
    }  
    
}
