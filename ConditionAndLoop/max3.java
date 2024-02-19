import java.util.Scanner;

class max3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a= sc.nextInt();
        int b =sc.nextInt();
        int c= sc.nextInt();
        
        if(a>=b && a>=c){
            System.out.println("a is grater number");
        }
        else if(b>=a && b>= c){
            System.out.println(b);
        }
        else //not a , and not b
        System.out.println("C is greater number");
        sc.close();
    }
}