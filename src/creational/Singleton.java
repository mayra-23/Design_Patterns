package creational;

public class Singleton {
	
	public static Singleton single = null;
	public static Singleton single2 = new Singleton();
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance1(){
		
		if(single == null){
			single = new Singleton();
		}
		
		return single;			
	}
	
	public static Singleton getInstance2(){
		return single2;
	}

}
