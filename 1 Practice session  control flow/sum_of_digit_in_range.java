import java.util.Scanner;

class sum_of_digit_in_range {
    public static void main(String[] args) {
      // you code goes here
      Scanner sc = new Scanner(System.in);

      int L = sc.nextInt();
      int R = sc.nextInt();
      
      for(int N = L; N <= R; ++N) {
        int sum = 0;
        for(int num = N; num > 0; num /= 10) {
            int lastDigit = num % 10;
            sum += lastDigit;
        }
        System.out.println(sum);
      }

      sc.close();
    }
}
