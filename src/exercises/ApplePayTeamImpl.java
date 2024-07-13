package exercises;

public class ApplePayTeamImpl implements PaymentTeam{


    public void transferPaymentFromUserToCompany() {
        System.out.println("transfered payment successfully");
    }

    public int refundPaymentToUserFromCompany() {
        return 100;
    }
}
