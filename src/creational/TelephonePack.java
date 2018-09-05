package creational;

import java.util.ArrayList;
import java.util.List;

public class TelephonePack implements Package{
	@Override
	public String getMaxDisc() {
		return "25%";
	}

	@Override
	public double getMaxCredit() {	
		return 5600;
	}

	@Override
	public List<String> getProducts() {
		List<String> products = new ArrayList<String> ();
		products.add("24/7 operator service");
		products.add("Tel directory");
		products.add("Exclusive tel line");
		return products;
	}

}
