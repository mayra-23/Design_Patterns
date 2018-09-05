package creational;

public class TestCreational {

	public static void main(String[] args) {
		singleton();
		factory();
		abstractFactory();
		builder();
		prototype();
	}
	
	static void singleton(){
		System.out.println("******** Singleton ********* \n");
		System.out.println("Singleton 1 instance 1:" + Singleton.getInstance1());
		System.out.println("Singleton 1 Instance 2:" + Singleton.getInstance1());
		
		System.out.println("Singleton 2 instance 1:" + Singleton.getInstance2());
		System.out.println("Singleton 2 Instance 2:" + Singleton.getInstance2());		
		
	}
	
	static void factory(){
		
		System.out.println("\n ******** Factory ********* \n");
		
		PackageFactory packFactory =  new PackageFactory();
		
		Package web = packFactory.getPackage("web");
		Package magazine = packFactory.getPackage("magazine");
		Package tel = packFactory.getPackage("tel");		

		System.out.println( "Max Credit: " +web.getMaxCredit() +" Max Discount:  "+ web.getMaxDisc() +" Products: "+web.getProducts() );
		System.out.println( "Max Credit: " +magazine.getMaxCredit() +" Max Discount:  "+ magazine.getMaxDisc() +" Products: "+magazine.getProducts() );
		System.out.println( "Max Credit: " +tel.getMaxCredit() +" Max Discount:  "+ tel.getMaxDisc() +" Products: "+tel.getProducts() );
		
	}
	
	static void abstractFactory(){
		System.out.println("\n ******** Abstract Factory ********* \n");
		
		AbstractPackageFactory webAbstractFactory =  new WebPackageFactory();
		AbstractPackageFactory magazineAbstractFactory =  new MagazinePackageFactory();
		AbstractPackageFactory telAbstractFactory =  new TelephonePackageFactory();
		
		
		Package webPack = webAbstractFactory.getWebPackage();
		Package magazinePack = magazineAbstractFactory.getMagazinePackage();
		Package telPack = telAbstractFactory.getTelephonePackage();
		
		
		System.out.println(webAbstractFactory.getClass());
		System.out.println(magazineAbstractFactory.getClass() );
		System.out.println(telAbstractFactory.getClass()+ " \n");
		
		System.out.println( "Max Credit: " +webPack.getMaxCredit() +" Max Discount:  "+ webPack.getMaxDisc() +" Products: "+webPack.getProducts() );
		System.out.println( "Max Credit: " +magazinePack.getMaxCredit() +" Max Discount:  "+ magazinePack.getMaxDisc() +" Products: "+magazinePack.getProducts() );
		System.out.println( "Max Credit: " +telPack.getMaxCredit() +" Max Discount:  "+ telPack.getMaxDisc() +" Products: "+telPack.getProducts() );
	}
	
	
	static void builder(){
		System.out.println("\n ******** Builder ********* \n");
		
		WebSite webSite = new WebSite
				.WebSiteBuilder("198.2.31")
				.withURL("www.website.com")
				.withHTMLversion(5.0)
				.build();
				
		System.out.println( "IP: " +webSite.getIP() +" URL:  "+ webSite.getURL() +" HTML: "+webSite.getHTML() );

	}
	
	static void prototype(){
		System.out.println("\n ******** Prototype ********* \n");
		
		
		TelephoneOrder telOrder = new TelephoneOrder();		
		
		System.out.println("telOrder - Original Object \n"+telOrder+"  Payment: " +telOrder.getPayment() +" Client:  "+ telOrder.getCustomer() +"\n" );
		
		try {
			
			TelephoneOrder telOrderCopy = (TelephoneOrder) telOrder.clone();
			telOrderCopy.setPayment("CreditCard");		
			telOrderCopy.setCustomer("Mayra");	
			
			System.out.println("telOrderCopy - Original Object \n"+telOrderCopy+"  Payment: " +telOrderCopy.getPayment() +" Client:  "+ telOrderCopy.getCustomer() +"\n" );
			
		} catch (CloneNotSupportedException e) {
					
			e.printStackTrace();
		}
		
		System.out.println("telOrder - Original Object \n"+telOrder+"  Payment: " +telOrder.getPayment() +" Client:  "+ telOrder.getCustomer() +"\n" );
	}

}
