package BehavioralDP.ChainOfResponsibityDP;

public class ChainOfResponsibilityRunner {


    void chainOfResponsibilityDemo(){

        Approver genelMudur=new GenelMudur();
        Approver mudur=new Mudur(genelMudur);
        Approver memur=new Memur(mudur);
        System.out.println("Kredi vermme limiti : ");
        System.out.println("Memur icin maximum : <100");
        System.out.println("Mudur icin maximum : <500");
        System.out.println("Genel Mudur icin limit yok");

        memur.approveLoan(1500);

    }


    public static void main(String[] args) {

        ChainOfResponsibilityRunner cf=new ChainOfResponsibilityRunner();
        cf.chainOfResponsibilityDemo();

    }
}
