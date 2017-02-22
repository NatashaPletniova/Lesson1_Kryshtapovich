package by.rdcenter.javatr.util;
public class FormulaInspector {
	
       public static void calculate (String[] args){
       
	   double a; //  cathetus 1
	   double b; //  cathetus 2
	   double c = 0;  // hypotenuse
	   double p; // perimeter
	   double s; // square
	   
	   a = 100;
	   b = 5;
	   c = Math.sqrt(a * a + b * b);
	   p = a + b + c;
	   s = 0.5 * a * b;
	   
	   System.out.println("Perimeter = " + p + ", Square = " + s);
    }
     }