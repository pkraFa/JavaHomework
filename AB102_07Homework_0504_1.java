import java.util.Scanner;
public class AB102_07Homework_0504_1{

	public static void main(String[] args) {
		int x;
		int y;
		int z;
		Scanner in = new Scanner(System.in);            //在螢幕上輸入3個數字
		System.out.println("請輸入三個整數:");
		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();
		if(x == 0 || y == 0 || z == 0){                  // 輸入3個值中,有任一個值為0就不是三角形
			System.out.println("不是三角形");
		 	}
			else 
				if( x>0 && y>0 && z>0 && x==y && x==z && y == z){   //輸入3個值都一樣,且都要大於0才是正三角形
				      System.out.println("正三角形");
				 }
				 else 
					 if( x == y || x == z|| y == z){    //輸入3個值,任何2個值一樣,才算等腰三角形
					System.out.println("等腰三角形");
					}
						else{							 //輸入3個值都不一樣,則為其他三角形
							System.out.println("其他三角形");
							}
		
		}		
}

