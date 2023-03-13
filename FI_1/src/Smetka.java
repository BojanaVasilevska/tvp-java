import java.util.Scanner;

public class Smetka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // jabolki - 50 den kg, krusi - 60 den kg, grozje - 100den kg
        double smetka = 0;
        System.out.println("Vnesi sto si pazaruval vo kilogrami");
        Scanner tastatura = new Scanner(System.in);
        System.out.println("Jabolki: ");
        double jabolki = tastatura.nextDouble();
        System.out.println("Krusi: ");
        double krusi = tastatura.nextDouble();
        System.out.println("Grozje: ");
        double grozje = tastatura.nextDouble();
        smetka = jabolki*50+krusi*60+grozje*100;
        System.out.println("Smetkata iznesuva " + smetka + " denari");

	}

}
