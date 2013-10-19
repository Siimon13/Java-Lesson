/*
 A class that prints out hi world on the terminal. First java lesson. Introuduces the S.O.P command the class and the main function.
 * means a comment 
 The / * and * / puts whatever is inside as a comment.
 The class just names it, private and public are  different. A public class can be used by other classes. 
 Static vs unstatic
 Static belongs to the class while non-static belongs to a specific object
 A static method belongs to the class and a non-static method belongs to an object of a class. That is, a non-static method can only be called on an object of a class that it belongs to. A static method can however be called both on the class as well as an object of the class. A static method can access only static members. A non-static method can access both static and non-static members because at the time when the static method is called, the class might not be instantiated (if it is called on the class itself). In the other case, a non-static method can only be called when the class has already been instantiated. A static method is shared by all instances of the class. These are some of the basic differences. I would also like to point out an often ignored difference in this context. Whenever a method is called in C++/Java/C#, an implicit argument (the 'this' reference) is passed along with/without the other parameters. In case of a static method call, the 'this' reference is not passed as static methods belong to a class and hence do not have the 'this' reference.
 -Taken from Stack Overflow
 */
public class hiworld{
    public static void main(String[] args){
	System.out.println("hi world");
    }
}