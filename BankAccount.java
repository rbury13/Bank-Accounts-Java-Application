    //RB
   abstract class BankAccount{
        private String holder;
        protected double balance;
        // balance protected for security of holder.
        // the owner of the account is deemed holder to not confuse myself with o and 0
        public BankAccount(String h, double b){
            this.holder = h;
            this.balance = b;
        }
        // set default values
        public BankAccount() {
            this.holder = "null";
            this.balance = 0;
        }
        // In override I am sepperating with ', ' to indicate seperation
        public String giveDetails() { 
            return holder + ", " + balance; 
        }
        // deposit adds to balance
        public double deposit(double amount) {
            this.balance =+ amount;
            return this.balance;
        }
        //withdraw as abstact to be carried into checking
        public abstract double withdraw(double amount);
    }