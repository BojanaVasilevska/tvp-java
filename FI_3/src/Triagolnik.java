import java.util.Scanner;
public class Triagolnik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, c, s, povrsina, perimetar, visina;
        Scanner tastatura = new Scanner(System.in);

        System.out.println("Programata presmetuva povrsina i perimetar na triagolnik");
        System.out.println("Vnesete dolzina na edna strana: ");
        a = tastatura.nextDouble();
        System.out.print("Vnesete dolzina na druga strana: ");
        b = tastatura.nextDouble();
        System.out.print("Vnesete dolzina na treta strana: ");
        c = tastatura.nextDouble();

        povrsina = a + b + c;
        s = (a + b + c) / 2;
        visina = (2*b)/2;
        perimetar = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println("Perimetarot e: " + perimetar);

        System.out.println("Plostinata e: " + povrsina);

        System.out.println("Visinata e: " + visina);

	}

}
