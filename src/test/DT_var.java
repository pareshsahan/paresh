package test;

public class DT_var { 
	int b=30;  //instance var

static int empid = 101;
public void m1() {
//  DT var VV --- To Represent Data
    int a=10; //local var
System.out.println("M1 Executed");
//               int   string
System.out.println(a + " Localvar"); // 10
System.out.println(empid + " static var");
}
public void m2() {
System.out.println("M2 Executed");
System.out.println(b + " instance var");
System.out.println(empid+ " static var");
}
public void m3() {
System.out.println("M3 Executed");
System.out.println(b+" instance var");
}
public static void main(String args[]) {
System.out.println("main method executed");
    DT_var  m = new DT_var();
    m.m1();
    m.m2();
    m.m3();
}
}
