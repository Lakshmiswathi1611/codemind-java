import java.util.Scanner;
class area_of_circle
{
    public static void main(String args[])
    {
        double area,r,s;
        Scanner sc=new Scanner(System.in);
        r=sc.nextDouble();
        s=r*r;
        area=3.14*s;
        System.out.printf("%.2f",area);
    }
}