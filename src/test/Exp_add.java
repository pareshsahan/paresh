package test;
import java.util.Scanner;
public class Exp_add {
	public static void main(String args[]) {
    int a,b,c,d;
    System.out.println("Enter a & b value");
    Scanner obj = new Scanner(System.in);
    a=obj.nextInt();
    b=obj.nextInt();
    c=a+b;
    d=a-b;
    System.out.println("Addition of 2 no: " + c);
    System.out.println("Substraction of 2 no:"+d);
}

}
