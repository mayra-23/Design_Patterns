package creational;

public class TelephonePackageFactory implements AbstractPackageFactory {

	@Override
	public Package getWebPackage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Package getMagazinePackage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Package getTelephonePackage() {
		// TODO Auto-generated method stub
		return new TelephonePack();
	}

}
