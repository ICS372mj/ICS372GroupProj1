public class DonorList implements Serializable{
	private Donor[] donors;
	
	public DonorList(){
		donors = new Donor[0/*number?*/];
	}	

	public void addDonor(String name, String phone){
	//add donor object with provided name & phone, assign ID
	}

	public void addCreditCard(String id, CreditCard card){
	//associate provided card with provided donor
	}

	public Donor getDonorById(String id){
	//find and return donor with given ID, or return null if not found
	}

	public void listAll(){
	//display full donor list
	}

	public void displayDonor(Donor donor){
	//display given donor's information
	}

	public boolean removeDonor(Donor donor){
	//remove given donor object from list
	}

	public boolean removeCreditCard(String id, CreditCard card){
	//disassociate given card and donor with given ID
	}

	public String toString(){
		String listString = "";
		while(this.hasNext()){
			listString += this.next.toString;
		}
	}
}