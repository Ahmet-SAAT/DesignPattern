package CreationalDP.ProtoTypeDP;

public class ProtoTypePatternDemo {
    public static void main(String[] args) {


        //1.yol
        Soldier availableSoldier1 = new Soldier(100, 45, 20, 50, 60,
                5, "Kilic", true);

        Soldier notAvailableSoldier1 = new Soldier(100, 45, 20, 50, 60,
                5, "Kilic", false);

//2.yol hepsini tek tek yazamya gerek yok klanla ve degistirelecek kismi setle
        Soldier notAvailableSoldier2 = availableSoldier1.clone();
        notAvailableSoldier2.setAvailableForWar(false);


        System.out.println("***********************");
        System.out.println("notAvailableSoldier icin cikti :");
        notAvailableSoldier1.showSoldierInfo();

        System.out.println("******************************");
        System.out.println("Clone ozelligi kullanilarak uretilen Askerin ciktisi ");
        notAvailableSoldier2.showSoldierInfo();


    }
}
