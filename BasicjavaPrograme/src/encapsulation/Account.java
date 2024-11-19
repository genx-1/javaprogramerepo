package encapsulation;

public class Account {

	
		 private int _accountBalance = 100;

	        public int CheckBalance()
	        {
	            return _accountBalance;
	        }
	    

	    static void Main()
	    {
	        Account myAccount = new Account();
	       int myBalance = myAccount.CheckBalance();

	        /* This Main method can check the balance via the public
	         * "CheckBalance" method provided by the "Account" class 
	         * but it cannot manipulate the value of "accountBalance" */

		     private int _accountBalance = 100;

	        public int CheckBalance()
	        {
	            return _accountBalance;
	        }
	    

	    static void Main()
	    {
	        Account myAccount = new Account();
	       int myBalance = myAccount.CheckBalance();

	        /* This Main method can check the balance via the public
	         * "CheckBalance" method provided by the "Account" class 
	         * but it cannot manipulate the value of "accountBalance" */

	}

}
