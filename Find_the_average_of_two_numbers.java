import java.util.Scanner;
class average
{
    public static void main(String args[])
    {
        float i,j,k;
        Scanner sc=new Scanner(System.in);
        i=sc.nextFloat();
        j=sc.nextFloat();
        k=(i+j)/2;
        System.out.printf("%.4f",k);
    }
}
