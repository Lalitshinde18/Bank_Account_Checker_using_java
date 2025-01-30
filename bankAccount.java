class bankAccount {

    // challenge problem solve
    /*
    Define a BankAccount class  with private attributes like
    accountNumber, accountHoldeName , and balance. provide
    public methods to deposite and withdraw money, ensuring that
    these methods don't allow illegal operation like withdrawing more money than current balance

     */

    private String accountNumber;

    private  String accountHolderName;

    private  double balance;

    public bankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }

    public void depositMoney(double money){
        if (money <= 0){
            System.out.println("Invalid Deposit");
        }else {
            balance += money;
        }
    }
    public double withdrawMoney(double money){
        if (money <= 0) {
            System.out.println("Invalid Widtraw");
        } else if (balance >= money){
            balance -= money;
        }  else  {
            money = balance;
            balance = 0;
        }
        return  money;
    }

    public static void main(String[] args) {
        bankAccount account = new bankAccount("001","lalit Shinde");
        account.depositMoney(100);
        System.out.println(account.withdrawMoney(200));
        account.depositMoney(-40);
        account.withdrawMoney(0);
    }


}
