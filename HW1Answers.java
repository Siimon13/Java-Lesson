import java.lang.Math;

public class HW1Answers{
    
    //Getting the nth Fibonacci number using a for loop
    public static int Fib(int n){
	int x = 0;
	int y = 1;
	int sum = x + y;
	for(int i = n; i > 0; i--){
	    x = y;
	    y = sum;
	    sum = x + y;
	}
	return x;
    }

    //RNG
    public static int RNG(int lim){
	int ans = (int)(System.nanoTime() % lim + 1);
	if(ans < 0)
	    ans= ans * -1;
	return ans;
    }
    
    //Generating a random number
    public static int randNum(int x){
	System.out.println("Using RNG..");
	System.out.println(RNG(x));
	System.out.println("Using Math.random()");
	int ans = (int)(Math.random() * x + 1);
	return ans;
    }
    
    //Answer to question 3
    public static String stuff(String[] arr){
	int mid = arr.length / 2 - 1;
	return arr[mid];
    }


    public static void main(String[] args){
	String[] strarr;
	strarr = new String[10];
	strarr[4] = "hi";
	strarr[5] = "there";
	System.out.println(stuff(strarr));	
	System.out.println(Fib(6));
	System.out.println(randNum(1000));
    }

}
