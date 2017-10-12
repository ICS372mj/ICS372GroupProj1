public class Transaction implements Serializable{
	private Date date;
	private int amount;

	public Transaction(int amount, Date date){
		this.amount = amount;
		this.date = date;
	}
}