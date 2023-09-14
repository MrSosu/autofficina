import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Automobile automobile = new Automobile("Polo GT", "Volkswagen", "FOL58Q", 1300, 21000.0, 5);
        System.out.println(automobile.isAccesa());
        System.out.println(automobile.getMarciaInserita());
        System.out.println(automobile.getMarciaInserita());
        automobile.accensione();
        automobile.scalaMarcia();
        automobile.aumentaMarcia();
        automobile.aumentaMarcia();
        System.out.println(automobile.getMarciaInserita());
        automobile.inserisciMarcia(11);
        automobile.inserisciMarcia(5);
        System.out.println(automobile.getMarciaInserita());
        automobile.aumentaMarcia();
        automobile.scalaMarcia();
        System.out.println(automobile.getMarciaInserita());

        System.out.println("----------------------------------------");

        Automobile automobile2 = new Automobile("Panda", "FIAT", "ABC123F", 1000, 15000, 6);
        Concessionaria concessionaria1 = new Concessionaria("Concessionaria Bella", "Via Fasulla 123");
        concessionaria1.aggiungiAuto(automobile);
        concessionaria1.aggiungiAuto(automobile2);

        Automobile[] autoConcessionaria2 = { automobile, automobile2 };
        Concessionaria concessionaria2 = new Concessionaria("Concessionaria ricca", "evergreen terrace",
                autoConcessionaria2);

        concessionaria2.stampaPerMarchio("FIAT");
        concessionaria2.stampaPerPrezzo(18000);

    }

}
