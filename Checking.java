public class Checking extends Account{
    //list properties speific to checking account
    int debitCardNumber;
    int debitCardPin;
    //Constructor to intialize checking account properites
    public Checking(String name, String sSN, double initDeposit){
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setDebitCard();
    }

    private void setDebitCard(){
        debitCardNumber = (int)(Math.random() * Math.pow(10, 12));
        debitCardPin = (int)(Math.random() * Math.pow(10, 4));
    }


    //list any method specific to checking account
    public void showInfo(){
        super.showInfo();
        System.out.println("Your Checking Account features" +
        "\n  Debit Card Number: " + debitCardNumber +
        "\n  Debit Card Pin: " + debitCardPin);

    }

}