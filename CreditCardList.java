public class CreditCardList implements Serializable{
	private CreditCard[] cardList;
	
	public CreditCardList(){
		cardList = new CreditCard[0/*number?*/];
	}	

	public boolean insertCreditCard(CreditCard card){
	//insert card in list
	}

	public boolean validCard(String cardData){
	//look up card with given number, return true if found, false if not
	}

}