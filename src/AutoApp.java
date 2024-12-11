import java.util.Scanner;

public class AutoApp {
    public static void main(String[] args) throws Exception {
          // Jere Nuutinen kävi tarkistamassa koodin ja hienoa on!
          System.out.println("Hienoa koodia");
        Auto auto1 = new Auto("BMW", "Z4", 40);
        Auto auto2 = new Auto ("Audi", "A4", 55);

        auto1.NaytaTiedot();
        System.out.println();
        auto1.Kiihdyta();
        System.out.println();
        auto1.Tankkaa();
        System.out.println();
        auto1.Huolla();
        System.out.println();
        auto1.NaytaTiedot();
        System.out.println();
        auto2.NaytaTiedot();

       
    }
} //AutoApp class ends


//Classes start here
class Auto{

    public String merkki;
    public String malli;
    public int bensanMaara;

    public Auto(String merkki, String malli, int bensanMaara)
    {
        this.merkki = merkki;
        this.malli = malli;
        this.bensanMaara = bensanMaara;
    }


    public void Jarruta()
    {
        System.out.println("Auto jarruttaa.");
    }

    public void Kiihdyta()
    {
        System.out.println("Auto kiihtyy.");
        if (bensanMaara > 0)
        {
            bensanMaara -= 1;
        }
        else
        {
            System.out.println("Bensa on loppu!");
        }
    }

    public void Tankkaa()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tankissa bensaa: " + bensanMaara);
        System.out.println("Paljonko tankataan?");
        int maara = scanner.nextInt();
        System.out.println("Tankkaus: " + maara);
        bensanMaara += maara;
        System.out.println("Tankissa bensaa tankkauksen jälkeen: " + bensanMaara);
        scanner.close();
    }

    public void NaytaTiedot()
    {
        System.out.println("Auton merkki: " + merkki);
        System.out.println("Auton malli: " + malli);
        System.out.println("Bensan määrä: " + bensanMaara);
    }

    public void Huolla() { // Henri Uusitalo lisasi koodia
        System.out.println("Öljyt vaihdettu! Seuraava huolto 10000 kilometrin päästä.");
    }

}
