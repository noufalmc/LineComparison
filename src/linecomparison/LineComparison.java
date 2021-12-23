package linecomparison;
import java.util.*;
import java.lang.Math;
public class LineComparison {
    public  static void  main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome To Line Comparison");
        System.out.println("Enter the X1 and X2");
        int x1=sc.nextInt();
        int x2=sc.nextInt();
        System.out.println("Enter the Y1 and Y2");
        int y1=sc.nextInt();
        int y2=sc.nextInt();
        int distance=(((x2-x1)*(x2-x1))+(y2-y1)*(y2-y1));
        double d=Math.sqrt(distance);
        System.out.println("Enter The X3 and X4");
        int x3=sc.nextInt();
        int x4=sc.nextInt();
        System.out.println("Enter The Y3 and 4");
        int y3=sc.nextInt();
        int y4=sc.nextInt();
        int distance2=(((x4-x3)*(x4-x3))+(y4-y3)*(y4-y3));
        double d2=Math.sqrt(distance2);
        System.out.println("First distance is"+d);
        System.out.println("First distance is"+d2);
        if(d==d2)
        {
            System.out.println("Distance Are same");
        }
        else if(d>d2)
        {
            System.out.println("Distance1 is  greater");
        }
        else
        {
            System.out.println("Distance2 is greater");
        }
        }
}
