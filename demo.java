public class demo{
    private String tut = "I am using a class called demo right now. It has to be initiated and then you can use any functions from it by doing classname.function ";
    private String chng = "You cab have multiple functions with the same names, how does the JVM(Java Virtual Machine) know which one to use? It takes the first one usually. The point is you can make the same functions accept different parameters, for exmaple you would want an estiamte function to accept fouble, floats and ints. Now just a float, double, or int. ";

    public void perform(){
	System.out.println(tut);
	System.out.println();
    }

    public void change(){
	System.out.println(chng);
	System.out.println();
    }
    
    public void change(String s){
	chng = s;
	change();
    }

    public static void main(String[] args){
	demo demo = new demo();
	demo.perform();
	demo.change();
	demo.change("hi");
    }
    
}