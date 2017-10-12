public class Organization implements Serializable{
	private TransactionList transactions;
	private DonorList donors;
	private static Organization singleton;

	private Organization(){
	}

	public static Organization instance(){
		if(singleton == null){
			singleton = new Organization();
		}
		return singleton;
	}

	public void addDonor(String name, String phone){
	//check if donor exists; if not, add Donor with donors.addDonor
	}

	public void addCreditCard(String id, String cardNumber, int amount){
	//check if card exists; if not, add card to list
	}

	public void processDonations(){
	//call transactions.processDonations
	}

	public void listTransactions(){
	//call transactions.listAll
	}

	public void listAllDonors(){
	//call donors.listAll
	}

	public void listDonor(String id){
	//call donors.displayDonor(id)
	}

	public boolean removeDonor(String id){
	//call donors.removeDonor(id)
	}

	public boolean removeCreditCard(String cardNumber){
	//call donors.removeCreditCard(cardNumber);
	}

	public boolean save(){
	//save state, reference Serializable for template
	}

}