package vezbanje;

import java.util.Scanner;

public class Vezbanje1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean izlaz = false;
		double racun = 0;

		do {
			System.out.println("Izaberite opciju unosenjem broja opcije: \n"
					+ "0 - Izlaz iz programa (zatvaranje kase)\n"
					+ "1 - Dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu)\n" 
					+ "2 - Naplata racuna");

			int opcija = sc.nextInt();

			switch (opcija) {
			case 0:
				System.out.println("Kasa je zatvorena!");
				izlaz = true;
				break;
			case 1:
				System.out.println("Unesite cenu proizvoda: ");
					double cena = sc.nextDouble();
					if(cena <= 0) {
						break;
					}else {
						racun += cena;
						break;
					}
					
			case 2:
				double kusur = 0;

				if (racun == 0) {
					System.out.println("Nemate nista u korpi, pokrenite program ponovo.");
				} else {
					System.out.println("Unesite kolicinu novca: ");
					double kolicinaNovca = sc.nextDouble();
					if (kolicinaNovca < racun) {
						System.out.println("Greska!");
					} else {
						kusur = kolicinaNovca - racun;
						System.out.println("Uplatili ste " + kolicinaNovca + ", iznos racuna je: " + racun + ".");
						System.out.println("Vas kusur je " + kusur + "\n");
						racun = 0;
					}
				}
				break;
				default:
					System.out.println("Pogresan unos!");
					break;
			}
		} while (!izlaz);
	}

}
/*
 * Napisati program koji ima meni za samousluznu kasu u prodavnici. Meni za
 * potrosace sadrzi sledece opcije:
 * 
 * 0 - Izlaz iz programa (zatvaranje kase) 1 - dodavanje cene proizvoda na racun
 * (ubacivanje u potrosacku korpu) 2 - naplata racuna
 * 
 * Ukoliko korisnik unese opciju 0 program se zavrsava. Ukoliko korisnik unese
 * opciju 1 program pita korisnika da unese cenu proizvoda i ta cena se dodaje
 * na racun u prodavnici. Ukoliko korisnik unese opciju 2 program pita korisnika
 * da unese kolicinu novca za naplatu racuna. Ukoliko korisnik unese vrednost
 * manju od vrednosti racuna, potrebno je da se ispise greska, bez umanjenja
 * racuna i da se ponovo ispise meni. Ukoliko korisnik unese vrednost vecu ili
 * jednaku od cene racuna ispisuje se kusur i racun se ponovo postavlja na nulu.
 * Zatim se ponovo ispisuje meni.
 */