package encapsulation;

public class AccountNo {
	private long Acc_no;
	private String name;
	private String email;

	public long getAccountno(){
		return Acc_no;
	}
	
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	
	public void setAccountno(long Acc_no) {
		this.Acc_no = Acc_no;
		
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
