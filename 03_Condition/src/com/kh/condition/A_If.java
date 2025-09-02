package com.kh.condition;

import java.util.Scanner;

public class A_If {
	/*
	 * 조건문 if
	 * :기본적으로 프로그램은 순차적으로 실행(위->아래, 왼쪽->오른쪽)
	 *  순차적인 흐름을 바꿀 때 제어문(조건문, 반복문)을 사용하여 제어 가능
	 *  
	 *  조건문의 종류: if, switch
	 *  -if
	 *  	[1] 단독 if 문
	 *  					if (조건식){
	 *  						// 조건식의 결과가 참(true)일 때 실행할 내용
	 *  					}
	 *  	[2] if ~ else 문
	 *  		if(조건식){
	 *  			//조건식이 true 일 때 실행할 내용
	 *  		} else{
	 *  			//조건식이 false 일 때 실행할 내용
	 *  		}
	 *  	[3] if ~ else if ~ else 문
	 *  					if (조건식1){
	 *  						//조건식1의 결과가 true일 때 실행할 내용
	 *  					} else if (조건식2){
	 *  						// 조건식1이 false고, 조건식2가 true일 때 실행할 내용
	 *  					}else{
	 *  						//조건식1,조건식2가 모두 false일 때 실행할 내용
	 *  					}
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				method2();
	}
	
	public static void method1() {
		//입력받은 값이 1 ~ 10 사이의 값인 경우 해당 값을 출력
		//그렇지 않은 경우 "범위를 벗어났습니다." 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~10 사이의 값을 입력 : ");
		int num = sc.nextInt();
		if(num>=1 && num<=10) {
			System.out.println(num);
		}else {
			System.out.println("범위를 벗어났습니다");
		}
	}
	
	public static void method2() {
		// 주민번호를 입력받아 남자인지, 여자인지 출력
		//단, -를 포함하여 입력받은 길이가 14가 아닌 경우
		//   "잘못입력하였습니다" 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호 입력(-포함): ");
		String psn = sc.next();
	// (1) 입력받은 값의 길이를 확인
		// - 문자열의 길이: 문자열.length()
		if(psn.length() == 14) {
			char gender = psn.charAt(7);
			if(gender=='1' || gender=='3') {
			System.out.println("남자입니다");
			}
			else if (gender=='2' || gender == '4') {
				System.out.println("여자입니다");
			}else {
				System.out.println("오류입니다");
			}
		}
		else {
			System.out.println("출력되지 않습니다.");
		}
		
		
	}

}
