import java.util.Scanner;

public class prime_1_to_n {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N= sc.nextInt();

        for(int num=2; num<=N; ++num){
            //check the number is prime
            boolean isPrime = true;
            for(int i=2; i<num; ++i){
                if(num%i == 0){
                    isPrime = false;
                    break;
                }
            }
            //print is isPrime is true
            if(isPrime){
                System.out.println(num);
            }
        }
        sc.close();
    }
}
