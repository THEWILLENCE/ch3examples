package WillEnce.ch3exe;
import java.util.Scanner;
import static java.lang.System.out;
public class FToC {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		out.println("enter a tempureture in celsius");
		double farenheit;
		double celsius;
		celsius = input.nextDouble();
		farenheit = (celsius * 9)/5 + 32;
		out.println(farenheit);
		
	}

}
