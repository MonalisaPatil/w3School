package exercises;

public class Problem1 {
    public static void main(String[] args) {

        AbstractionExample abstractionExample= new ExtensionAbstractionExample();
        abstractionExample.divide();


        PaymentTeam paymentTeam= new ApplePayTeamImpl();
        paymentTeam.transferPaymentFromUserToCompany();
        paymentTeam.refundPaymentToUserFromCompany();



        PaymentTeam gPayTeam= new GPayTeamImpl();
        gPayTeam.refundPaymentToUserFromCompany();

    }
}
