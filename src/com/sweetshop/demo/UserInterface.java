// UI or view layer
package com.sweetshop.demo;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
	private static UserInterface instance;
	public final int EXIT_VALUE =7;
	
	private UserInterface() {}
	
	public static UserInterface getInstance() {
		if(instance == null) {
			instance = new UserInterface();
		}
		return instance;
	}
	
	public void printAllSweets(List<Sweet> sweetList) {
//		for (int i = 0; i < sweetList.size(); i++) {
//			System.out.println(sweetList.get(i));
//		}
		for(Sweet sweet: sweetList) {
			System.out.println(sweet);
		}
	}
	
	public int showUserMenu() {
		System.out.println("Enter \n1.Add Sweet\n2.Remove sweet"
				+ "\n3.Update sweet\n4.Print Sweet\n5.Order Sweet\n6.Print Order\n" + EXIT_VALUE + ".Exit");
		Scanner sc =new Scanner(System.in);
		int input = sc.nextInt();
		return input;
	}
}
