package creational;

public class PackageFactory {
	
	public Package getPackage(String type){
		
		Package pack =  null;
		
		switch(type)
		{
			case "web" : 
				pack =  new WebPack();
			break;
			
			case "magazine":
				pack = new MagazinePack();
			break;
			
			case "tel":
				pack = new TelephonePack();
			break;
		}
		
		return pack;		
	}

}
