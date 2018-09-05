package creational;

public class WebPackageFactory implements AbstractPackageFactory {

	@Override
	public Package getWebPackage() {
		
		return new WebPack();
	}

	@Override
	public MagazinePack getMagazinePackage() {		
		return null;
	}

	@Override
	public TelephonePack getTelephonePackage() {
		return null;
	}

}
