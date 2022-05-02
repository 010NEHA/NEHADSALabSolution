package Quest2;

public class Main {

	public static void main(String[] args) {
		
		FindSumPair fsp = new FindSumPair();
		
		int sum = 47;
		
		fsp.insert(30);
		fsp.insert(15);
		fsp.insert(10);
		fsp.insert(45);
		fsp.insert(35);
		
		fsp.display();
		
		fsp.findSumPair(sum);

	}

}
