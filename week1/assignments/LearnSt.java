package week1.assignments;

public class LearnSt {
    public int number = 1;
    private static int number2 = 2;
    int number3 =3;
public static int addNumbers(int num1, int num2, int num3)
{
   return num1+num2+num3;
}
public static void main(String[] args)
{
	LearnSt obj = new LearnSt();
   System.out.println(addNumbers(obj.number, number2,obj.number3 ));
}
}	
