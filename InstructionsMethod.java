import java.util.Scanner;
class InstructionsMethod
{
  static Scanner sc = new Scanner(System.in);
  public static void getName()
  {
    String n = "ShowString."; 
    for(int i=1;i<=3;i++)
    System.out.println(n);
  }
  
  public static void main(String[] args)
  { 
    getName();
    System.out.println();
    System.out.print("Enter Integer =>");
    int num = sc.nextInt();
    System.out.println("Integer is "+num);
  }
}