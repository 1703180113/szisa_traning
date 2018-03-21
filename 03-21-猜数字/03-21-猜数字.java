//猜数字是已一个古老的游戏，由一个出题者随机出一个数字，
//由猜题者猜，若所猜数字大于所出数字，则出题者回答『大了』；
//若小于，则回答『小了』；直到猜题者猜中。
//现在请编写程序模拟出题者，随机数字在0~1000之间。
//当使用者猜中时，同时打印出猜测次数。

import java.util.Scanner;

public class guessnumber {
	public static void main(String[] args) {  
        System.out.println("***你所要猜的数字在0到1000之间***");  
        	System.out.println("请输入你心中所想的一个数字");  
        	int target=(int) Math.round(Math.random()*1000+1);  
        //System.out.println(target);  
        	
        Scanner input=new Scanner(System.in);  
        	String answer=input.nextLine();  
        		int ans=Integer.parseInt(answer);  //猜题者猜的数字
        		int count=0;//猜题者猜测字数
        		
        while(ans!=target){ 
        	
            if(ans>target){  
                System.out.println("大了");  
                	count++;
                	
            }else{  
                System.out.println("小了");  
                	count++;
            }  
            
            answer=input.nextLine();  
            	ans=Integer.parseInt(answer);  
           
        }  
        	System.out.println("恭喜你，你猜中了！");  
        		System.out.println("你猜测的次数是"+(count+1)+"次");
    }  
}  


