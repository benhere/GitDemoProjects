package QuickDemos;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int minnum = 10;
		int maxnum = 999999;
		
		int rannum = (int)(Math.random()*(maxnum-minnum+1)); 
		 System.out.println("Number is :"+rannum);
		if((rannum&1)==1) {
			System.out.println("Odd number");
		}else {
			System.out.println("Even number"); 
		}
	}
}
