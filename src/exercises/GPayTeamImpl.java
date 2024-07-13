package exercises;

public class GPayTeamImpl implements PaymentTeam{


    public void transferPaymentFromUserToCompany() {
        System.out.println("transfered payment successfully via google pay");
    }

    public int refundPaymentToUserFromCompany() {
        return 2000;
    }

    public int earnGpoints() {
        return 100000;
    }

    public void useGpoints() {
        System.out.println("use Gpoints");
    }

}
