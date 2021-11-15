import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class S23952_p03 {
	public static void main(String[] args) {

Scanner scaner=new Scanner(System.in);

		int wybor=0;

		while (wybor!=3) {

			System.out.println();
			System.out.println();
		System.out.println(" Wybierz opcje");
			System.out.println();
		System.out.println("1  zapisanie danych o Wilkach (z pliku)");
		System.out.println("2  odczytanie  danych o Wilkach (do pliku)");
		System.out.println("3  Wyjscie");
		wybor= scaner.nextInt();

		switch (wybor){

			case  1 : {
		
		try {
 						
			Wilk mlody1 = new Wilk("Mlody1", Short.valueOf("2020"), true, "Stado1", 2);
			Wilk mlody2 = new Wilk("Mlody2", Short.valueOf("2020"), true, "Stado1", 3);
			Wilk mlody3 = new Wilk("Mlody3", Short.valueOf("2020"), true, "Stado1", 4);
			Wilk mlody4 = new Wilk("Mlody4", Short.valueOf("2020"), true, "Stado1", 0);
			Wilk mlody5 = new Wilk("Mlody5", Short.valueOf("2020"), true, "Stado1", 1);
			Wilk mlody6 = new Wilk("Mlody6", Short.valueOf("2020"), true, "Stado1", 2);

			Wilk mlody7= new Wilk("Mlody7", Short.valueOf("2020"), true, "Stado2", 3);
			Wilk mlody8= new Wilk("Mlody8", Short.valueOf("2020"), true, "Stado2", 4);
			Wilk mlody9= new Wilk("Mlody9", Short.valueOf("2020"), true, "Stado2", 5);
			Wilk mlody10= new Wilk("Mlody10", Short.valueOf("2020"), true, "Stado2", 4);
			Wilk mlody11= new Wilk("Mlody11", Short.valueOf("2020"), true, "Stado2", 5);
			Wilk mlody12= new Wilk("Mlody12", Short.valueOf("2020"), true, "Stado2", 2);



            Wilk w1 = new Wilk("Stary1", Short.valueOf("2010"), false, "Stado1", 1);
			Wilk w2 = new Wilk("Stary2", Short.valueOf("2010"), false, "Stado1", 2);
			Wilk w3 = new Wilk("Stary3", Short.valueOf("2010"), false, "Stado1", 2);
			Wilk w4 = new Wilk("Stary4", Short.valueOf("2010"), false, "Stado1", 3);

			Wilk w5=new Wilk("Stary5", Short.valueOf("2010"), false, "Stado2", 1);
			Wilk w6=new Wilk("Stary6", Short.valueOf("2010"), false, "Stado2", 1);
			Wilk w7=new Wilk("Stary7", Short.valueOf("2010"), false, "Stado2", 1);
			Wilk w8=new Wilk("Stary8", Short.valueOf("2010"), false, "Stado2", 1);
			Wilk w9=new Wilk("Stary9", Short.valueOf("2010"), false, "Stado2", 1);
			Wilk w10=new Wilk("Stary10", Short.valueOf("2010"), false, "Stado2", 1);



			Wadera matka1 = new Wadera("Matka1", Short.valueOf("2010"), false, 5,1);

			Wadera matka2 = new Wadera("Matka2", Short.valueOf("2010"), true, 0,0);
			Wadera matka3 = new Wadera("Matka3", Short.valueOf("2010"), false, 0,1);

			Wadera matka4 = new Wadera("Matka4", Short.valueOf("2010"), false, 3,0);

            Wadera mloda1= new Wadera("mloda1", Short.valueOf("2020"), true, 0,0);
			Wadera mloda2= new Wadera("mloda2", Short.valueOf("2020"), true, 0,1);
			Wadera mloda3= new Wadera("mloda3", Short.valueOf("2020"), true, 0,2);
			Wadera mloda4= new Wadera("mloda4", Short.valueOf("2020"), true, 0,0);
			Wadera mloda5= new Wadera("mloda5", Short.valueOf("2020"), true, 0,1);
			Wadera mloda6= new Wadera("mloda6", Short.valueOf("2010"), true, 0,2);
			Wadera mloda7= new Wadera("mloda7", Short.valueOf("2020"), true, 0,3);
			Wadera mloda8= new Wadera("mloda8", Short.valueOf("2020"), true, 0,0);
			Wadera mloda9= new Wadera("mloda9", Short.valueOf("2020"), true, 0,1);


			Wadera matka5= new Wadera("Matka5", Short.valueOf("2010"), false, 6,1);
			Wadera matka6= new Wadera("Matka6", Short.valueOf("2010"), false, 6,1);
			Wadera matka7= new Wadera("Matka7", Short.valueOf("2010"), false, 3,1);
			Wadera matka8= new Wadera("Matka8", Short.valueOf("2010"), false, 0,1);
			Wadera matka9= new Wadera("Matka9", Short.valueOf("2010"), false, 0,1);
			Wadera matka10= new Wadera("Matka10", Short.valueOf("2010"), false, 0,1);
			Wadera matka11= new Wadera("Matka11", Short.valueOf("2010"), false, 0,1);




			matka1.dodajSzczenie(mlody1);
			matka1.dodajSzczenie(mlody2);
			matka1.dodajSzczenie(mlody3);
			matka1.dodajSzczenie(matka2);
			matka1.dodajSzczenie(matka3);

			matka4.dodajSzczenie(mlody4);
			matka4.dodajSzczenie(mlody5);
			matka4.dodajSzczenie(mlody6);

			matka5.dodajSzczenie(mlody7);
			matka5.dodajSzczenie(mlody8);
			matka5.dodajSzczenie(mlody9);
			matka5.dodajSzczenie(mloda1);
			matka5.dodajSzczenie(mloda2);
			matka5.dodajSzczenie(mloda3);

			matka6.dodajSzczenie(mloda4);
			matka6.dodajSzczenie(mloda5);
			matka6.dodajSzczenie(mloda6);
			matka6.dodajSzczenie(mloda7);
			matka6.dodajSzczenie(mlody10);
			matka6.dodajSzczenie(mlody11);

			matka7.dodajSzczenie(mlody12);
			matka7.dodajSzczenie(mloda8);
			matka7.dodajSzczenie(mloda9);

			
			FileOutputStream stream = new FileOutputStream  ("c:\\users\\szeli\\IdeaProjects\\PPJ_3\\src\\wilki.txt");     //("c:\\brother\\wilki.txt");
			matka1.zapisz(stream);

			matka4.zapisz(stream);
			w1.zapisz(stream);
			w2.zapisz(stream);
			w3.zapisz(stream);
			w4.zapisz(stream);



			matka5.zapisz(stream);
			matka6.zapisz(stream);
			matka7.zapisz(stream);
			matka8.zapisz(stream);
			matka9.zapisz(stream);
			matka10.zapisz(stream);
			matka11.zapisz(stream);
			w5.zapisz(stream);
			w6.zapisz(stream);
			w7.zapisz(stream);
			w8.zapisz(stream);
			w9.zapisz(stream);
			w10.zapisz(stream);



			stream.close();
		}
		catch(IOException ex) {
			System.out.print(ex.getMessage());			
		}
		System.out.print("Plik zapisany!");

		break;
		}

			case 2:{        FileInputStream fis =null;
				try {
					fis = new FileInputStream("c:\\users\\szeli\\IdeaProjects\\PPJ_3\\src\\wilki.txt");
				} catch(FileNotFoundException e) {
					//e.printStackTrace();
					System.out.println("nie znaleziono pliku");}
				int bajt =0;
				try {
					bajt = fis.read();
					while (bajt != -1) {
						System.out.print((char) bajt);
						bajt = fis.read();
					}
					fis.close();
				}catch(IOException e) {
					System.out.println("blad odczytu");

				}break;


	}
				case 3:{
					wybor=3;
					System.out.println("Koniec programu !");
					break;
				}
		}}

}}

class Ssak {

	private String imie;
	private short rokUrodzenia;
	private boolean mlody;

	public Ssak() {
	}

	public Ssak(String imie, short rokUrodzenia, boolean mlody) {
		this.imie = imie;
		this.rokUrodzenia = rokUrodzenia;
		this.mlody = mlody;
	}

	String przedstawSie() {
		return imie +","+rokUrodzenia+","+ mlody;
	}
	
	public void zapisz(FileOutputStream stream) {
		//nie robie nic
	}
}

class Wilk extends Ssak {
	private String nazwaStada;
	private int pozycja;

	public Wilk(String imie, short rokUrodzenia, boolean mlody,String nazwaStada, int pozycja) {
		super(imie,rokUrodzenia,mlody);
		this.nazwaStada = nazwaStada;
		this.pozycja = pozycja;
	}

	public String przedstawSie() {
		return super.przedstawSie() + "," + nazwaStada + "," +  pozycja + ";" +'\n' ;
	}
	
	public void zapisz(FileOutputStream stream) {
		byte[] doZapisania = przedstawSie().getBytes();
		try {
			stream.write(doZapisania);				
		}
		catch(IOException ex) {
			System.out.print(ex.getMessage());
		}
	}
	
	public int pozycja()
	{
		return pozycja;
	}
}

class Wadera extends Ssak {
	private int iloscSzczeniat;
	private Ssak[] szczenieta;
	private int pozycja1;
	
	public Wadera(String imie, short rokUrodzenia, boolean mlody,int iloscSzczeniat,int pozycja) {
		super(imie,rokUrodzenia,mlody);
		this.iloscSzczeniat = iloscSzczeniat;
		this.pozycja1=pozycja;
		szczenieta = new Ssak[iloscSzczeniat];
	}
	
	void dodajSzczenie(Wilk szczenie) {
		int pozycja= szczenie.pozycja();
		szczenieta[pozycja] = szczenie;
	}

	void dodajSzczenie(Wadera szczenie) {
		int pozycja1= szczenie.pozycja1();
		szczenieta[pozycja1] = szczenie;
	}
	public int pozycja1()
	{
		return pozycja1;
	}
	public String przedstawSie() {
		return super.przedstawSie() + "," + iloscSzczeniat+";"+'\n';
	}
	
	public void zapisz(FileOutputStream stream) {
		byte[] doZapisania = przedstawSie().getBytes();
		try {
			stream.write(doZapisania);
			for(int i=0; i < this.iloscSzczeniat; i++) {
				szczenieta[i].zapisz(stream);

			}
		}
		catch(IOException ex) {
			System.out.print(ex.getMessage());
		}
	}	
}


