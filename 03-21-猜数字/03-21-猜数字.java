//����������һ�����ϵ���Ϸ����һ�������������һ�����֣�
//�ɲ����߲£����������ִ����������֣�������߻ش𡺴��ˡ���
//��С�ڣ���ش�С�ˡ���ֱ�������߲��С�
//�������д����ģ������ߣ����������0~1000֮�䡣
//��ʹ���߲���ʱ��ͬʱ��ӡ���²������

import java.util.Scanner;

public class guessnumber {
	public static void main(String[] args) {  
        System.out.println("***����Ҫ�µ�������0��1000֮��***");  
        	System.out.println("�����������������һ������");  
        	int target=(int) Math.round(Math.random()*1000+1);  
        //System.out.println(target);  
        	
        Scanner input=new Scanner(System.in);  
        	String answer=input.nextLine();  
        		int ans=Integer.parseInt(answer);  //�����߲µ�����
        		int count=0;//�����߲²�����
        		
        while(ans!=target){ 
        	
            if(ans>target){  
                System.out.println("����");  
                	count++;
                	
            }else{  
                System.out.println("С��");  
                	count++;
            }  
            
            answer=input.nextLine();  
            	ans=Integer.parseInt(answer);  
           
        }  
        	System.out.println("��ϲ�㣬������ˣ�");  
        		System.out.println("��²�Ĵ�����"+(count+1)+"��");
    }  
}  


