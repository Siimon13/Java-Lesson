/*
 A class that prints out hi world on the terminal. First java lesson. Introuduces the S.O.P command the class and the main function.
 // means a comment 
 The / * and * / puts whatever is inside as a comment.
 The class just names it, private and public are  different. A public class can be used by other classes. 
 Static vs unstatic
 Static belongs to the class while non-static belongs to a specific object
 A static method belongs to the class and a non-static method belongs to an object of a class. That is, a non-static method can only be called on an object of a class that it belongs to. A static method can however be called both on the class as well as an object of the class. A static method can access only static members. A non-static method can access both static and non-static members because at the time when the static method is called, the class might not be instantiated (if it is called on the class itself). In the other case, a non-static method can only be called when the class has already been instantiated. A static method is shared by all instances of the class. These are some of the basic differences. I would also like to point out an often ignored difference in this context. Whenever a method is called in C++/Java/C#, an implicit argument (the 'this' reference) is passed along with/without the other parameters. In case of a static method call, the 'this' reference is not passed as static methods belong to a class and hence do not have the 'this' reference.
 -Taken from Stack Overflow
 */
/*
public/private static/_ return typevalue nameoffunc(type var){}

type
int
String
float-> 1.0
double-> 1.0
boolean -> true/false

type[] -> Array of type

Operations
1 + 1 
1 - 1
1 * 2
1 / 1
<
>
=<
=>
== 
|
&&

i-- = (i = i - 1)
i++ = (i = i + 1)
i+n = (i = i + n)
i-n = (i = i - n)

= means to assign
== checks if the values of the opossing sides are equal to each other
*/

public class TestName
{
//Basic Int Reader
  public static int kevin(int x){ 
    return (x + 1);
  }
  
//Basic String Reader
  public static String simon(String x){
    String y = "Hey don't rob me, you " + x; 
    return y;
  }
  
//While Loop
  public static void yo(boolean b){
    if(b){
      int i = 10;
      while(b){
        if(i > 0){
        System.out.println(i);
        i--;
        }
        else
          break;
      }
      System.out.println("Rocket Launh!");
    }
    else
      System.out.println("The launch failed");
    }

//Recursion
  public static void yo2(boolean b, int a){
    if(b){
      if (a > 0){
        System.out.println(a);
        a--;
        yo2(true, a);}
      else
        if(a < 0){
        System.out.println("The Launch Failed!");}
      else
       System.out.println("Rocket Launch!");
    }
    else
    System.out.println("The Launch Failed!");
  }
  
  /*
   * 
For Loop:
for(init; condition; what happens if condition is met){
what happens in for loop
}

   */
//For Loop
  public static void yo3(boolean b){
    if(b){
      for(int i = 10; i > 0; i--){
        System.out.println(i);
      }
      System.out.println("Rocket Launch");
    }
    else
      System.out.println("Failed.");
  }
  
//Main
  public static void main(String[] args)
  {int t = kevin(0); 
    String x = simon("black cow");
    yo2(true, -1);
    yo3(true);
    System.out.println ("hi world");
    System.out.println(x);
    System.out.println(t);
  }}

