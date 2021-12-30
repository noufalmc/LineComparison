/*
Author:Noufal MC
Date:30/12/2021
Line comparison
* */
package linecomparison;
import java.util.*;
import java.lang.Math;
class LineChecker
{
    //    Declaring DataMember
    int x1,x2,y1,y2,distance;
    public int CalcDistance(int x1,int x2,int y1,int y2)
    {
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
        distance=(((x2-x1)*(x2-x1))+(y2-y1)*(y2-y1));
        return distance;
    }
    public double CalcSqrt(double d)
    {
        return Math.sqrt(d);
    }
    public void CheckEqualOrNot(double Dist1,double Dist2)
    {
        if(Dist1==Dist2)
        {
            System.out.println("Distance Are Equal");
        }
        else
        {
            System.out.println("Distance Are not Equal");
        }
    }
}
public class LineComparison {
    public  static void  main(String[] args)
    {
        int x1,x2,y1,y2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome To Line Comparison");
        System.out.println("Enter the X1 and X2");
        x1=sc.nextInt();
        x2=sc.nextInt();
        System.out.println("Enter the Y1 and Y2");
        y1=sc.nextInt();
        y2=sc.nextInt();
        LineChecker lc=new LineChecker();
        int distance1=lc.CalcDistance(x1,x2,y1,y2);
        System.out.println("Enter the X3 and X4");
        x1=sc.nextInt();
        x2=sc.nextInt();
        System.out.println("Enter the Y3 and Y4");
        y1=sc.nextInt();
        y2=sc.nextInt();
        int distance2=lc.CalcDistance(x1,x2,y1,y2);
        System.out.println("Distance 1 is = "+distance1);
        System.out.println("Distance 2 is = "+distance2);
        System.out.println("Distance 1 Root is = "+lc.CalcSqrt((double) distance1));
        System.out.println("Distance 2 Root is = "+lc.CalcSqrt((double) distance2));
        lc.CheckEqualOrNot(distance1,distance2);
    }
}
