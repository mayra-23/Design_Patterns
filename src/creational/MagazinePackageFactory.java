package creational;

public class MagazinePackageFactory implements AbstractPackageFactory{
	
		@Override
		public Package getWebPackage() {
			
			return null;
		}

		@Override
		public Package getMagazinePackage() {		
			return new MagazinePack();
		}

		@Override
		public Package getTelephonePackage() {
			return null;
		}

}
