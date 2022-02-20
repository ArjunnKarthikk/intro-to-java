import java.util.Scanner;
import java.text.DecimalFormat;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        int id=sc.nextInt();
        sc.nextLine();
        String name=sc.nextLine();
        char gender=sc.next().charAt(0);
        float marks1=sc.nextFloat();
        float marks2=sc.nextFloat();
        float marks3=sc.nextFloat();
        boolean active=sc.nextBoolean();
        double result=marks1+marks2+marks3;
        float result1=marks1+marks2+marks3;
        
        // Double will have more precision than float-More accurate
        System.out.println("Total result in double :"+result);
        
        // Float will have less precision value-Less accurate
        System.out.println("Total result in float :"+result1);
        
        // Display all the values in single Line with space using "\t"
        System.out.println(id+" "+name+" "+gender+" "+active+" "+result);
        
        System.out.println(id+"\t"+name+"\t"+gender+"\t"+active+"\t"+result);
        
        //Display all the value in different line using"\n"
        
        System.out.println("\n"+name+"\n"+gender+"\n"+active+"\n"+result);
        
        //Display decimal values after specific digit
        
        String s1=String.format("%.4f",result);//Display 4 decimal values
        
        System.out.println("Display 4 decimal point:"+s1);
        
        System.out.println("Display 2 Decimal point"+String.format("%.2f",result));//Display 2 decimal values
        
        //Round off
        
        double x=89.976;
        
        DecimalFormat dc=new DecimalFormat("#.#");//90
        System.out.println("Round off:"+dc.format(x));
        
        DecimalFormat dc1=new DecimalFormat("#.##");//89.98
        System.out.println("Round off:"+dc1.format(x));
        
        //Type Conversion
        
        
        //Automatic casting
        int xy=10;
        
        double y=xy;
        
        System.out.println(xy);
        System.out.println(y);
        
        //Manual casting
        double z=45.56;
        int a=(int)z;
        
        System.out.println(z);
        System.out.println(a);
        
        double b=9/2; //one of the operands would be float for integer division
        System.out.println(b);
        
        double b1=9.0/2;
        System.out.println(b1);
        
        double b2=(double)9/2;
        System.out.println(b2);
        
        
        
        //Operator precedence
        
        double d1=5+3*3; //high priority for multiplication
        
        System.out.println(d1);
        
        double d2=(5+3)*3; //high priority for parenthesis
        
        System.out.println(d2);
        
        //Mathematical Operations
        
        double avg=result/3;
        
        System.out.println("Average:"+avg);
        
    }
}
