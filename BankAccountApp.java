public class BankAccountApp {
    public static void main(String[] args) {
        Checking chkacc1 = new Checking("Tom Wilson", "456213453", 1500);

        Savings sacc1 = new Savings("Rich Lowe", "123456789", 2500);

        sacc1.showInfo();

        System.out.println("***************");

        chkacc1.showInfo();

        sacc1.deposit(5000);
        sacc1.withdraw(200);
        sacc1.transfer("Checking", 300);


        // Read aCSV file then create new accounts base on that data
    }
}