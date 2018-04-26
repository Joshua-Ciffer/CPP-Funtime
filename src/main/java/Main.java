
public class Main {
	
	public static void main(String[] args) {
		Main x = new Main();
		Main y = new Main();
		String z = x.toString() + y + "";
		System.out.println(z);
	}
	
	public String toString() {
		return "MAIN";
	}
	
}