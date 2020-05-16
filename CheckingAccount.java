    // RB
    class CheckingAccount extends BankAccount{
        private double transactionFees;
        //construct that takes account holder, initial balance and initializes the corresponding attributes.It should set the transactionFees to 0.
        public CheckingAccount(String h, double b) {
            super(h, b);
            this.transactionFees = 0;
        }

        public String giveDetails() {
            return super.giveDetails() + ", " + transactionFees;
        }

        //Overrides the Withdraw to reduce the balance by the withdrawal amount and add $2 to the transactionFees, if the withdrawal amount is less than the current balance and return the new balance; otherwise it should return -1.
        public double withdraw(double amount) {
            if(amount < balance) {
                this.transactionFees =+ 2;
                this.balance =- amount;
                return this.balance;
            }
            return -1;
        }
    }