public class BankingTester {
    public static void main(String[] args) {
        String[] options={ "check eligibility", "create bank account","check year availability", "check your balance", "deposit money", "withdraw money","transfer money", "exit"};
        System.out.println();
        System.out.println("******************");
        for(int i=0; i<options.length; i++){
            System.out.println(i+1 +". "+ options[i]);
        }
        Banking account = new Banking();
        StdOut.println("What would you like to do?");   
        StdOut.print("enter a number => ");     
        int choice=StdIn.readInt();
            switch(choice){
            case 1: 
                StdOut.print("please enter your age => ");
                int age= StdIn.readInt();
                if(account.isEligible(age)==true){
                    System.out.println("you are eligible");
                }
                else{
                    System.out.println("you are not eligible");
                    break;
                }
                
            case 2: 
                StdOut.println("please enter name, amount to be deposited in the account and the current year for your account =>");
                String name= StdIn.readString();
                double amount=StdIn.readDouble();
                int year=StdIn.readInt();
                account= new Banking(name, amount, year);
                
            case 3: 
                StdOut.println("please enter a year you want to check ");
                int yearcheck=StdIn.readInt();
                System.out.println(account.checkYearAvailability(yearcheck));
                
            case 4: 
                System.out.println("your current balance is: "+account.checkBalance());

            case 5: 
                StdOut.println("please enter the amount to be deposited => ");
                double deposit= StdIn.readDouble();
                account.deposit(deposit);

            case 6:
                StdOut.println("please enter the amount to be withdrawn => ");
                double withdraw=StdIn.readDouble();
                account.withdraw(withdraw);

            case 7: 
                StdOut.println("please enter the money to be tranferred and the account number");
                double tranfer= StdIn.readDouble();
                long acc=StdIn.readLong();
                account.transferMoney(tranfer, acc);
                
            case 8:
            System.exit(8);
        }        
    }
}