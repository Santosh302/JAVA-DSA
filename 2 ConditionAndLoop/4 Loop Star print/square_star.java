import java.util.Scanner;

public class square_star {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        //row
        for(int row = 1; row <= N; ++row){
            //print N stars
            for(int st = 1; st <= N; ++st )
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    sc.close();
    }
}
