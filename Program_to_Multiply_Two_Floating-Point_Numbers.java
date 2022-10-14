import java.util.Scanner;
class multiplication
{
    public static void main(String args[])
    {
        float x,y,z;
        Scanner sc=new Scanner(System.in);
        x=sc.nextFloat();
        y=sc.nextFloat();
        z=x*y;
        System.out.printf("%.2f",z);
    }
}