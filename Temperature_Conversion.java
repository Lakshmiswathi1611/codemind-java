import java.util.Scanner;
class temperature_conversion
{
    public static void main(String args[])
    {
        double f,c;
        Scanner sc=new Scanner(System.in);
        c=sc.nextDouble();
        f=32+(c*9/5);
        System.out.printf("%.2f",f);
    }
}