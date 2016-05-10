import java.util.Scanner;
public class AB102_07Homework_0504_3 {

	public static void main(String[] args) {
		int x , y;								//設x y為整數,以判斷數字是否跟自行輸入數字相同
		int z = 0;  							//
		int xxx = 0;  							//設整數,作為顯示後共有幾個數字產生
		int	yyy;								//自行輸入的值,設為整數
		final int zzz = 50;                     //最大數字至49,設整數
		
		System.out.println("輸入你討厭數字?");
		Scanner in = new Scanner(System.in);
		yyy = in.nextInt();						// yyy代表輸入數值
		
		System.out.println();					//空一行
		for (int i = 1; i < zzz; i++){			//產生1-49數字
			x = i / 10;							//除以10取整數
			y = i % 10;							//除以10取餘數
			if(x != yyy && y != yyy){			//重點來了,(x != yyy 判斷 整數的x 是否和輸入值不相等)
				System.out.print(i + "\t");		//      (y != yyy 判斷餘數的y 是否和輸入值不相等),若兩者都是false則輸出i數值
				z++; 
				xxx++;							//統計數字輸出有幾次
			}
			if(z == 6){  						//一排滿6個數字就換行		
				System.out.println();
				z = 0;							//換行後從新計算
			}
		}
		System.out.println("總共有" + xxx + "數字可選");  // xxx作為顯示後共有幾個數字產生
	}

}
