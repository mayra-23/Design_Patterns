package creational;

import java.util.ArrayList;
import java.util.List;

public class WebPack implements Package {
	

	@Override
	public String getMaxDisc() {		
		return "35%";
	}

	@Override
	public double getMaxCredit() {		
		return 18600;
	}

	@Override
	public List<String> getProducts() {
		List<String> products = new ArrayList<String> ();
		products.add("WebSite");
		products.add("Chat online");
		products.add("Tech Support");
		return products;
	}

}
