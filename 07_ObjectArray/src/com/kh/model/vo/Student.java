package com.kh.model.vo;

public class Student {	// => 학생 정보
	//데이터 -> 이름, 나이, 학년, 키, 성적, 학번, ....
	// 이름:String, 나이:int, 성적:double
	
	//기능 -> 공부한다, 밥먹기, 술마시기, 질문하기, ...
	
	// 학생 정보 출력 printInfo():void
	private String name;
	private int age;
	private double score;
	//------------------------------------------------------------------
	public Student(String name,int age, double score) {
		this.name=name;
		this.age=age;
		this.score=score;
	}
	//----------------------------------------------------------------------
	public void setStudentName(String name){
		this.name=name;
	}
	
	public String getStudentName() {
		return name;
	}
	
	public void setStudentAge(int age) {
		this.age=age;
	}
	
	public int getStudentAge() {
		return age;
	}
	
	public void setStudentScore(double score) {
		this.score=score;
	}
	
	public double getStudentScore() {
		return score;
	}
	//-------------------------------------------------------------------------
	public void printInfo() {
		System.out.println("이름: " +  name+", 나이: "+age+", 성적: "+score);
	}
}
