import java.util.Random;
import java.util.Scanner;

public class AB102_07Homework_0504_2 {
	
    public static void main(String[] args) {
    	int x ;								   //先設定自行輸入為整數
        System.out.println("開始猜數字吧!"); 
    	Random ran = new Random();
        int xx = ran.nextInt(9);               //亂數產生為0-9
        
    	Scanner in = new Scanner(System.in);   //自行輸入0-9數字其一
    	x = in.nextInt();					   //x代表輸入數值
    	
        outer:
        while(true){                            //無窮迴圈,猜對亂數才終止
        	if( x == xx ){                      //當 亂數=自行輸入數值 時,就猜對了
        		System.out.println("答對了!答案就是" + xx + " ~ 啾咪^^y");  
        		break outer;                    //終止迴圈
			}
				else{			                //若猜錯時,顯示這行
					System.out.println("猜錯囉");
					x = in.nextInt();           //繼續猜,直到猜對 亂數 才能跳出無窮迴圈
				}
        }
    }    
}


