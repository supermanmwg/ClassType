package com.example;

public class MemberClass {
	
	public static class Haha{
		
	}
	
	public static void local() {
		class LocalClass {
			
		}
		LocalClass localClass = new LocalClass();
		if(localClass.getClass().isLocalClass()) {
			System.out.println("local class");
		}
	}
	
	public static void main(String[] args) {
		Haha haha = new Haha();
		Class hahaClass = haha.getClass();
		if(hahaClass.isMemberClass()) {
			System.out.println("member class");
		} else {
			System.out.println("not member class");
		}
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		};
		
		Class runClass = runnable.getClass();
		if(runClass.isAnonymousClass()) {
			System.out.println("thread class is anoymous class");
		} else {
			System.out.println("thread class is not  anoymous class");
		}
		
		AnoymousClass anoymous = new AnoymousClass() {
		};
		
		Class anoymousClass = anoymous.getClass();
		
		if(anoymousClass.isAnonymousClass()) {
			System.out.println("thread class is anoymous class");
		} else {
			System.out.println("thread class is not  anoymous class");
		}

		local();
	}
}
