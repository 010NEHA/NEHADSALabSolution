package Quest2;

public class Main {

	public static void main(String[] args) {
		
		FindSumPair fsp = new FindSumPair();
		
		int sum = 130;
		
		fsp.insert(40);
		fsp.insert(20);
		fsp.insert(60);
		fsp.insert(10);
		fsp.insert(30);
		fsp.insert(50);
		fsp.insert(70);


		
		fsp.display();
		
		fsp.findSumPair(sum);

	}

}
