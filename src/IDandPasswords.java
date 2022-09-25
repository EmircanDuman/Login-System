import java.util.HashMap;

public class IDandPasswords {
	
	HashMap<String, String> loginInfo = new HashMap<String, String>();
	
	public IDandPasswords() {
		
		loginInfo.put("Admin", "pizza");
		loginInfo.put("Emir", "emir");
		loginInfo.put("Bro", "abc");
	}
	
	protected HashMap getLoginInfo(){
		return loginInfo;
	}

}
