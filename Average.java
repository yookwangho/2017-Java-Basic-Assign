package test;

import java.util.Scanner;

public class Average { 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.print("입력할 최대 실수의 갯수를 입력하세요. >> ");    
        Scanner input = new Scanner(System.in);  
        int size = input.nextInt();        
        
        System.out.println("\n중간에 0을 입력하면 이전 입력자료로 계산하고 종료합니다.");  
        System.out.print("실수 " + size + "개를 입력하세요. >> ");
      
        int i=0 , s=0;
        double sum=0;
        
        double array[] = new double[size];
        
        for(;i<size; i++){
        	array[i] = input.nextDouble();
        	sum=sum+array[i];
        	if(array[i]==0) break;
        	else s++;
        }
        
      
        //프로그래밍 하세요.
        System.out.println("합: " + sum + ", 평균: " + sum/size);
    }
}
