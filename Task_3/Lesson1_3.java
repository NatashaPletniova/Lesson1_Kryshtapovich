package by.epam.homework.lesson1;

public class Lesson1_3 {
	
	public static void main(String[] args){
		
		int x = 5678;
		int p;
		
		p = (x / 1000) * ((x / 100) % 10) * ((x / 10) % 10) * (x % 10);
		System.out.println("The result "+x+" = "+p );

	}
}
