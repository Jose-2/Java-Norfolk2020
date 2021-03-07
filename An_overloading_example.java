package overloading_example;

public class An_overloading_example {
	 public void method(char a)
	    {
	         System.out.println(a);
	    }
	 public void method(char a, int num) //this overloads the method with the added data type 
	    {
	         System.out.println(a +num);
	    }

}
