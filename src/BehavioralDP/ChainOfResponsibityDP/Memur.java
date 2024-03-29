package BehavioralDP.ChainOfResponsibityDP;

public class Memur extends Approver {

    public Memur(Approver chief) {
        super(chief);
    }

    @Override
    boolean approveLoan(int amount) {

        if (amount<100){//150
            System.out.println("Memur onayladi");
            System.out.println("****************");
            return true;
        } else if (chief!=null) {
            System.out.println("Miktar memurun onaylama siniri disinda, Sefe yonlendiriliyorsunuz");
            return chief.approveLoan(amount);
        }
        return false;
    }
}
