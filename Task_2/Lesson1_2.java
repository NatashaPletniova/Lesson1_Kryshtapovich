package by.epam.homework.lesson1;
public class Lesson1_2 {

	public static void main(String[] args){
		// отдельные, логически завершенные участки кода следует оформлять отдельными методами
			double r = 4;
			double s, l;
		

	        
	        if (r > 0){
	            l = 2 * Math.PI * r;
	            System.out.println("Perimeter of circle = "+l );	
	            s = Math.PI * r * r;
	            System.out.println("Area of circle = "+s );	
	        }
	        else
	        {
	            System.out.println("Radius could not be negative or equal to zero!");
	            return;// лишний оператор, приложение и так завершит свою работу
	        }


			
		}
}
