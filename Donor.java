public class Donor implements Serializable{
	private String id;
	private String name;
	private String phone;

	public Donor(String id, String name, String phone){
		this.id = id;
		this.name = name;
		this.phone = phone;
	}	

	public boolean donorExists(String donorId){
		return this.donorId.equalsIgnoreCase(donorId);
	}
	
	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return this.id;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	public void getPhone(){
		return this.phone;
	}

	public String toString(){
		return ("Donor ID: " + this.id + "\nName: " + this.name
			 + "\nPhone: " + this.phone + "\n");
	}
}
		