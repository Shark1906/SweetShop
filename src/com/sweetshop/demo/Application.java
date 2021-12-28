//controller layer
package com.sweetshop.demo;

import java.util.*;

public class Application<E> {
	
	//SweetStore sweetStore = SweetStore.getInstance();
	//UserInterface userInterface = UserInterface.getInstance(); 
	//Scanner sc = new Scanner(System.in);
	static int input;

	public static void main(String[] args) {
		System.out.println("Welcome to Sweet Shop");
		UserInterface userInterface = UserInterface.getInstance(); 
		Application application = new Application();
		do {
		input = userInterface.showUserMenu();
		application.handleUserSelection(input);
		}while(input != userInterface.EXIT_VALUE);
		
	}
	public void handleUserSelection(int input) {
		SweetStore sweetStore = SweetStore.getInstance();
		UserInterface userInterface = UserInterface.getInstance();
		switch(input) {
			case 1:
//				Modak modak = new Modak();
//				modak.price = 500f;
//				Kajubarfi kajubarfi = new Kajubarfi();
//				kajubarfi.price = 700f;
//				Rasgulla rasgulla = new Rasgulla();
//				rasgulla.price = 600f;
//				Milkcake milkcake = new Milkcake();
//				milkcake.price = 900f;
//				Rasgulla rasgulla1 = new Rasgulla();
//				rasgulla1.price = 690f;
//				
//				sweetStore.add(modak);
//				sweetStore.add(kajubarfi);
//				sweetStore.add(rasgulla);
//				sweetStore.add(milkcake);
//				sweetStore.add(rasgulla1);
				addSweet();
				
				break;
				
			case 2:
				Scanner sc1 = new Scanner(System.in);
				System.out.println("Enter Sweet Name to Delete:");
				String deleteSweet = sc1.nextLine();
				Sweet sweet = sweetStore.getSweet(deleteSweet);
				sweetStore.removeSweet(sweet);
				break;
				
			case 3:
				Scanner sc2 = new Scanner(System.in);
				System.out.println("Enter Sweet Name to Update:");
				String updateSweet = sc2.nextLine();
				sweet = sweetStore.getSweet(updateSweet);
				if(sweet != null) {
				updateSweet(sweet);
				}else {
					System.out.println("Sweet is not available");
				}
				break;
				
			case 4:
				userInterface.printAllSweets(sweetStore.getList());
				break;
				
			case 5:
				orderSweet();
				
				break;
				
			case 6:
				printOrder();
		}
	}
	
	public void updateSweet(Sweet sweet) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What do want to update");
		System.out.println("Enter \n1.Shape \n2.Colour \n3.Name \n4.Price \n5.Ingredients");
		int option = sc.nextInt();
		
		switch (option) {

			case 1:
				updateSweetShape(sweet);
				break;

			case 2:
				updateSweetColor(sweet);
				break;
			
			case 3:
				updateSweetName(sweet);
				break;
		
			case 4:
				updateSweetPrice(sweet);
				break;
		
			case 5:
				updateSweetIngredient(sweet);
				break;
		}
	}
	
	private void updateSweetIngredient(Sweet sweet) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter new ingredients with single space");
		String newIngredients = sc.nextLine();
		//sweet.ingredient.clear();
		String[] newIngredientsArr = newIngredients.split(" ");
		sweet.ingredient = Arrays.asList(newIngredientsArr);
	}
	private void updateSweetPrice(Sweet sweet) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter new Price");
		float newPrice = sc.nextFloat();
		sweet.price = newPrice;
		
	}
	private void updateSweetName(Sweet sweet) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter new Name");
		String newName = sc.nextLine();
		sweet.name = newName;
		
	}
	
	public void updateSweetShape(Sweet sweet){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter \n1.TRIANGLE \n2.SQUARE \n3.ROUND");
		int shape = sc.nextInt();

		switch (shape) {

		case 1:
			sweet.shape = Sweet.Shape.TRIANGLE;
			break;

		case 2:
			sweet.shape = Sweet.Shape.SQUARE;
			break;

		case 3:
			sweet.shape = Sweet.Shape.ROUND;
			break;
		}

	}
	
	public void updateSweetColor(Sweet sweet){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter \n1.RED \n2.GREEN \n3.YELLOW\n4.WHITE"); 
		int color = sc.nextInt();

		switch (color) {

		case 1:
			sweet.color = Sweet.Color.RED;
			break;

		case 2:
			sweet.color = Sweet.Color.GREEN;
			break;

		case 3:
			sweet.color = Sweet.Color.YELLOW;
			break;
			
		case 4:
			sweet.color = Sweet.Color.WHITE;
			break;
		}	
	}
	
	public void addSweet() {
		Scanner sc = new Scanner(System.in);
		Sweet sweet = new Sweet();
		SweetStore sweetStore = SweetStore.getInstance();
		System.out.println("Enter the Sweet Name");
		String name = sc.nextLine();
		sweet.name = name;
		
		System.out.println("Enter \n1.TRIANGLE \n2.SQUARE \n3.ROUND");
		int shape = sc.nextInt();

		switch (shape) {

		case 1:
			sweet.shape = Sweet.Shape.TRIANGLE;
			break;

		case 2:
			sweet.shape = Sweet.Shape.SQUARE;
			break;

		case 3:
			sweet.shape = Sweet.Shape.ROUND;
			break;
		}
		System.out.println("Enter \n1.RED \n2.GREEN \n3.YELLOW\n4.WHITE"); 
		int color = sc.nextInt();

		switch (color) {

		case 1:
			sweet.color = Sweet.Color.RED;
			break;

		case 2:
			sweet.color = Sweet.Color.GREEN;
			break;

		case 3:
			sweet.color = Sweet.Color.YELLOW;
			break;
			
		case 4:
			sweet.color = Sweet.Color.WHITE;
			break;
		}
		System.out.println("Enter sweet Price");
		float newPrice = sc.nextFloat();
		sweet.price = newPrice;
		Scanner sc6 = new Scanner(System.in);
		System.out.println("Enter new ingredients with single space");
		String newIngredients = sc6.nextLine();
		//sweet.ingredient = new ArrayList<>();
		String[] newIngredientsArr = newIngredients.split(" ");
		sweet.ingredient = Arrays.asList(newIngredientsArr);
		
		sweetStore.add(sweet);
	}
	
	public void orderSweet() {
		Scanner sc5 = new Scanner(System.in);
		UserInterface userInterface = UserInterface.getInstance();
		SweetStore sweetStore = SweetStore.getInstance();
		List orderlist = new ArrayList<>();
		int option;
		
		System.out.println("Enter the Customer Name");
		String cusName = sc5.nextLine();
		do {
		userInterface.printAllSweets(sweetStore.getList());
		System.out.println("1. Add\n2. Exit");
		option = sc5.nextInt();
		switch (option) {
		case 1:
			Scanner sc7 = new Scanner(System.in);
			System.out.println("Enter the sweet Name");
			String sweetName = sc7.nextLine();
			try {
			double price = sweetStore.getSweet(sweetName).price;
			System.out.println("Enter Quantity");
			int quantity = sc7.nextInt();
			Order order = new Order(sweetName, price, quantity);
			orderlist.add(order);
			
			}catch(NullPointerException ex) {
				System.out.println("Sweet not found");
			}
			break;

		case 2:
			break;
		}
		
		}while(option!=2);
		sweetStore.orderMap.put(cusName, orderlist);
	}
	
	public void printOrder() {
		SweetStore sweetStore = SweetStore.getInstance();
		Scanner sc8 = new Scanner(System.in);
		double total = 0;
		System.out.println("Enter customer name");
		String name = sc8.nextLine();
		List<Order> orderlist = sweetStore.orderMap.get(name);
		for (int i = 0; i < orderlist.size(); i++) {
			System.out.println("Name : "+orderlist.get(i).name +", Qty. : "+orderlist.get(i).quantity+", Price : "+ orderlist.get(i).price+", Total : "+orderlist.get(i).total);
			total = total + orderlist.get(i).total;
		}
		System.out.println("Grand Total : "+total);
	}
}
