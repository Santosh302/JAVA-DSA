public class Operator {
    @SuppressWarnings("unused")
    public static void main(String[] args){
        //operators
        int a=5, b=10, c=7;
        int d= a*(b+c);
        System.out.println(d);

        //maybe a bit confusing.
        a +=15; // it means a=a+15;
        a-=2;  //it means a= a-15;
        System.out.println(a);

        //divide (int by int)
        int div= 19/10;
        System.out.println(div);

        //divide  (double/float by double/float)
        //divide (int by double/float)
        //divide (double/float by int)
        System.out.println(19/10.0);

        //module/ramainder operator
        System.out.println(-16/3);

        //relational operators
       // a=18, b=10;
        System.out.println(a>= b+9);

        //logical operators
        System.out.println(7>5 && 10<8);
        System.out.println(7 > 5 || 10 < 8);
        System.out.println(!(7>5));
    }
    
}
