package mypackage;
import java.util.Scanner;
public class ExercisesForWeekend 
{
public static void main (String[] args)
{ 
annualSalary();
resultX();

 String number = args[0];
 int num = Integer.parseInt(args[0]);
 System.out.println("args array number is : " +num);
 int num2 = 3;
 int divide = num / num2;
 System.out.println("10 / 3 : " +divide);
 int divide2 = num % num2;
 System.out.println("The rest of divide is: " + divide2);

relationOperator();
average();
convertSeconds();
mathClass();

}

public static void  annualSalary()
{ 
int monthlySalary = 900;
double taxes = 0.9;
int annualSalary;
int months =12;
annualSalary = (int)(monthlySalary * taxes * months);
System.out.println("The annual salary is : " + annualSalary + "$");
}

public static void resultX()
{
int x = 1;
int result;
result = -x + x++  -  --x  + x;
// x++ = x +1 so x++ = 2          --x = -x - 1 so --x = -2    
//( -1 + 2)   -   ( -2 +1) = 0   
System.out.println("The result of : -x + x++ - --x + x   is : " + result);
}

public static void relationOperator()
{
 boolean yes = true;
 boolean no = false;
 int x = 2;
 int y = 6;
     
     System.out.println("Is x == to y: " + (x == y));
     System.out.println("Is x > to y : " +(x > y));
     System.out.println("Is x < to y : " +(x < y));
     System.out.println("Is x >= to y: " + (x >= y));
     System.out.println("Is x <= to y : " +(x <= y));
     System.out.println("Is x != to y : " +(x != y));	
}

public static void average()
{
  Scanner sc = new Scanner(System.in);
  int user1 =0;
  int user2 =0;
  int user3 = 0;
  System.out.print("Enter the first number: ");
  user1 = sc.nextInt();
  System.out.print("Enter the second number: ");
  user2 =sc.nextInt();
  System.out.print("Enter the third number: ");
  user3 = sc.nextInt();
  double average = ((user1+ user2+user3) /3);
  System.out.println("The average of three numbers is : " + average);
}

public static void convertSeconds()
{
int sec = 60;
int min = 60;
int secToMin = sec;
int secToHour= (secToMin * min);
System.out.println("1 minute has : " + secToMin + " seconds ");
 System.out.println("1 hour has : " + secToHour + " seconds ");
}

public static void mathClass()
{
 System.out.println(Math.abs(3.45));
 System.out.println(Math.ceil(3.45));
 System.out.println(Math.floor(3.45));
 System.out.println(Math.round(3.45));
        
 System.out.println(Math.abs(-3.45)); 
 System.out.println(Math.ceil(-3.45));
 System.out.println(Math.floor(-3.45));
 System.out.println(Math.round(-3.45));
        
 //abs = absolute value of my input and it cant be negative 
 //ceil = make a number integer -maximum
 //floor = make a number integer - minimum
 //round = make a number integer in closest value        
}

}

