public class Banking{
    double amountinAcc;
    int year;
    double minAmount=700;
    String name;
    int age;
    public Banking(){

    }
    public Banking( String name,double amount, int year ){
        this.year=year;
        this.amountinAcc=amount;
        this.name=name;
    }
    public double checkBalance(){
        return this.amountinAcc;
    }
    public boolean isEligible(int age){
        if(age >=18){
            return true;
        }
        return false;
    }
    public void deposit(double depositMoney){
        if(depositMoney<0 || depositMoney+this.amountinAcc<minAmount){
           StdOut.println(("not enough amount"));
        }
        else{
            System.out.println("$"+depositMoney+" deposited in the account");
            this.amountinAcc=depositMoney+this.amountinAcc;
            System.out.print("and your current balance is $"+ this.amountinAcc);
            System.out.println();
        }
    }
    public String checkYearAvailability(int year){
        if(year>this.year){
            if((year-this.year)==1){
                return "3 year available ";
            }
            else{
            return Math.abs(year-this.year)+ " years available";
            }
        }
        else{
            return "your card has been expired";
        }
        
    }
    public void  withdraw(double withdrawalmoney){
        if(withdrawalmoney>amountinAcc || minAmount==withdrawalmoney){
            System.out.println("cannot borrow $"+ withdrawalmoney); 
        }
        else {

            System.out.print(("successfully withdrawn $"+withdrawalmoney)); 
            this.amountinAcc=this.amountinAcc-withdrawalmoney;
            System.out.print ("and your current balance is $"+this.amountinAcc);
            System.out.println();
        }
    }
    public void transferMoney(double money, long acc){
        if(money>this.amountinAcc){
            System.out.println("cannot transfer the amount");
        }
        else{
            System.out.println(money+ " transferred from your account to "+acc);
            this.amountinAcc= this.amountinAcc-money;
        }
    }
}