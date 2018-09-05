package creational;

public class TelephoneOrder implements Cloneable {
	
	private String payment = "cash";
	private String customer = "default";
	private TelephonePack telPackage;
	
	public TelephoneOrder(){
		telPackage = (TelephonePack) new TelephonePackageFactory().getTelephonePackage();
	}
	
	public TelephonePack getTelephonePackage(){
		return telPackage;
	}
	
	public String getPayment(){
		return payment;
	}
	
	public void setPayment(String pay){
		payment = pay;
	}
	
	public String getCustomer(){
		return customer;
	}
	
	public void setCustomer(String cust){
		customer = cust;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		TelephoneOrder telOrderCopy = new TelephoneOrder();
		telOrderCopy.setPayment(this.payment);
		telOrderCopy.telPackage = this.telPackage;
		telOrderCopy.customer=this.customer;
		return telOrderCopy;		
	}	
	

}
