package problem02;

public class MyService extends BaseService {

	public String afternoon() {
		return "오후";
	}
	
	public void service(String state) {
		
		if(state.equals(this.afternoon()))
			System.out.println(this.afternoon()+"서비스시작");
		
		if(state.equals(this.day()))
			System.out.println(this.day()+"서비스시작");
		
		if(state.equals(this.night()))
			System.out.println(this.night()+"서비스시작");
		
	}
}
