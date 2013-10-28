import java.util.*; 

public class Lesson2{
    /*Run time is a big thing. It is considered to be a Big O notation. We usually consider run time as how fast a function/program can run and in a binary fashion. The most commonly used run times are:
      O(n) linear
      O(1) constant
      O(n^2) n-squared
      O(logn) log of n
      To calculate the run time of a something we take into account how long on average it will take a function to find the answer to the problem. For example if we are given {1, 2, 3, 4} and asked to find 3. We can loop through the array and the runtime will be n. When taking into account runtime we ignore the constants, i.e. the true run time will be 3, because it only checks through 3 ints. However this function runtime is n, because we do not take into account the constant.
      Below are code for Binary Search, ArraLists, and usage of classes to build your program
     */
    
    public static void arrayListDemo(){
	ArrayList a1 = new ArrayList();
	//size returns the size of the arraylist
	a1.size();
	//add adds the elements to the end of the ArrayList or if you give it an index remove the respective object at that index
	a1.add("Simon");
	a1.add("Kev");
	a1.add("Vic");
	a1.add(0,"Siimon");
	a1.size();
	//removes finds an object then removes it or you can remove an object at an index.Auto resizes them
	a1.remove("Vic");
	a1.remove(1);
    }
    
    //Fills an ArrayList to the xth size
    public static ArrayList<Integer> fillAL(ArrayList<Integer> l,int x){
	HW1Answers rng = new HW1Answers();
	while(x > 0){
	    l.add(rng.RNGC(1000)); 
	    x--;
	}
	return l;
    }
    
    public static void main(String[] args){
	demo demo = new demo();
	demo.perform();
	ArrayList<Integer> l = new ArrayList<Integer>();
	l = fillAL(l, 10);
	System.out.println(l);
	BS(l);
    }

    //Binary Search 
    public static void BS(int[] data,x{
    int size;1
         int low = 0;
         int high = size - 1;
          
         while(high >= low) {
             int middle = (low + high) / 2;
             if(data[middle] == key) {
                 return true;
             }
             if(data[middle] < key) {
                 low = middle + 1;
             }
            if(data[middle] > key) {
                 high = middle - 1;
             }
        }
        return false;
   }
}	
    
    

