import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {
       

        // Checking chkacc1 = new Checking("Tom Wilson", "456213453", 1500);

        // Savings sacc1 = new Savings("Rich Lowe", "123456789", 2500);

        // sacc1.compound();

        // sacc1.showInfo();

        // System.out.println("***************");

        // chkacc1.showInfo();

        // sacc1.deposit(5000);
        // sacc1.withdraw(200);
        // sacc1.transfer("Checking", 300);

       List<Account> accounts = new LinkedList<Account>(); 


        // Read aCSV file then create new accounts base on that data
        String file = "../../../../desktop/Resources/BankAccountHolders.csv";

        List<String[]> newAccountHolders = utilities.CSV.read(file);

        for(String[] accountHolder : newAccountHolders){
            // System.out.println("NEW ACCOUNT");
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            // System.out.println(name + " " + sSN +  " " + accountType + " " + "$" + initDeposit);
            // System.out.println("\n");
            if(accountType.equalsIgnoreCase("Savings")){
                accounts.add(new Savings(name, sSN, initDeposit));
            }else if(accountType.equalsIgnoreCase("Checking")){
                accounts.add(new Checking(name, sSN, initDeposit));
                // System.out.println("Open a CHECKING ACCOUNT");
            } else {
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
            
        }
        for(Account acc : accounts){
                System.out.println("\n******************");
                acc.showInfo();
            }
    }
}