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
        System.out.println("distance is"+d);
        if(x1==x2 && y1==y2)
        {
            System.out.println("Both Lines Are same");
        }
        else
        {
            System.out.println("Not same");
        }
    }
}
