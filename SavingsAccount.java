    //RB
        class SavingsAccount extends BankAccount{
        //a double private attribute called minBalance.
        //a double private static attribute called interestRate with a value of 2.5%.
        private double minBalance;
        private static double interestRate;
        // constructor that takes account holder, initial balance, the minimum balance and initializes the attributes.
        // Set interest rate to 0.025 as would be used in calculation.

        public SavingsAccount(String h, double b, double m) {
            super(h, b); 
            this.minBalance = m;
            this.interestRate = 0.025;
       }
        //giveDetails() method that returns the values separated by commas
        public String giveDetails() {
            return super.giveDetails() + " ," + minBalance + " ," 
            + interestRate;
       }

        //Overrides the Withdraw method to reduce the balance by the withdrawal amount being provided the withdrawal amount is less than the (current balance - minimumBalance) and return new balance; otherwise it should return -1.
       public double withdraw(double amount) {
            if(amount < (this.balance - this.minBalance)) {
                this.balance =- amount;
                return this.balance;
            }

            return -1;
        }

        //public method applyInterest() that computes the annual interest on account balance and adds it to the current balance returns the new balance value.
        public double applyInterest() {
            double interest = balance * interestRate;
            this.balance =+ interest;
            return this.balance;
        }
}