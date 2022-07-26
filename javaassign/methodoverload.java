
public class methodoverload {
	
public void area(int b,int h)
    {
         System.out.println("Area of Triangle : "+(0.5*b*h));
    }
    public void area(int r) 
    {
         System.out.println("Area of Circle : "+(3.14*r*r));
    }

    public static void main(String args[])
   {

    	methodoverload ob=new methodoverload();
       ob.area(6,4);
       ob.area(3);  
   }
}
