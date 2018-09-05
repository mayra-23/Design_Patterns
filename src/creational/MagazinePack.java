package creational;

import java.util.ArrayList;
import java.util.List;

public class MagazinePack implements Package {

	@Override
	public String getMaxDisc() {
		return "10%";
	}

	@Override
	public double getMaxCredit() {	
		return 5800;
	}

	@Override
	public List<String> getProducts() {
		List<String> products = new ArrayList<String> ();
		products.add("Publish articles");
		products.add("Mensual subscription");
		products.add("Yearly gift");
		return products;
	}

}
