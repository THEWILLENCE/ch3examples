package WillEnce.ch3exe;
import java.util.Scanner;
import static java.lang.System.out;
public class FToC {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		out.println("enter a tempureture in farenheit");
		double farenheit;
		double celsius;
		farenheit = input.nextDouble();
		celsius = (farenheit - 32)/1.8;  
		out.println(celsius);
		
	}

}
