public class CreditCard implements Serializable{
	private String cardNumber;
	private Donor donor;

	public CreditCard(String cardData, Donor donor){
		this.cardNumber = cardData;
		this.donor = donor;
	}

	public boolean processCard(){
	//create new transaction
	}

}