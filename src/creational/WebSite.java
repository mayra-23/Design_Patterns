package creational;

public class WebSite {
	private String IP;
	private String URL;		
	private double HtmlVersion;
	
	private WebSite(){
		
	}
	
	public static class WebSiteBuilder { 
		private String IPb;
		private String URLb;		
		private double HtmlVersionb;
		
		public WebSiteBuilder(String IP){
			this.IPb = IP;
		}
		
		public WebSiteBuilder withURL(String url){
			this.URLb = url;
			return this;
		}
		
		public WebSiteBuilder withHTMLversion(double version){
			this.HtmlVersionb = version;
			return this;
		}
		
		public WebSite build(){
			WebSite webSite = new WebSite();
			webSite.IP = this.IPb;
			webSite.URL =  this.URLb;
			webSite.HtmlVersion = this.HtmlVersionb;
			return webSite;			
		}
		
		
	}
	
	public String getIP(){
		return IP;
	}
	
	public String getURL(){
		return URL;
	}
	
	public double getHTML(){
		return HtmlVersion;
	}

	
}
