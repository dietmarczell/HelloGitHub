package customer;

import com.sun.corba.se.spi.legacy.connection.GetEndPointInfoAgainException;

public class customer extends person{
	
	private int CustomerNumber;

	public int getCustomerNumber() {
		return CustomerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		CustomerNumber = customerNumber;
	}

	public customer(String firstname, String lastname, int CustomerNumber) {
		super(firstname, lastname);
		this.CustomerNumber = CustomerNumber;
		/*this.setFirstname(firstname);
		this.setLastname(lastname);*/
	}
	
	public void getInfo()
	{
		System.out.println(this.getCustomerNumber() + " " + this.getLastname());
	}
}
