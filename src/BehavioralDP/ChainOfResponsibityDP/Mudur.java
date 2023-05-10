package BehavioralDP.ChainOfResponsibityDP;

public class Mudur extends Approver {


    public Mudur(Approver chief) {
        super(chief);
    }

    @Override
    boolean approveLoan(int amount) {
       if (amount<500){
           System.out.println("Mudur Onayladi");
           System.out.println("****************");
           return true;
       } else if (chief!=null) {
           System.out.println("Miktar mudurun onaylama siniri disinda,sefe yonlendiriliyor");
           return chief.approveLoan(amount);
       }
       return false;
    }
}
