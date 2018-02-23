package com.mypackage.main;

import com.mypackage.enums.Coffee;
import com.mypackage.enums.EnumWithClassBody;
import com.mypackage.enums.EnumWithConstructor;
import com.mypackage.model.Order;
import com.mypackage.model.OrderWithClassBody;
import com.mypackage.model.OrderWithEnum;
import com.mypackage.model.OrderWithEnumConstructor;

public class MainApp {
	public static void main(String[] args) {
		
		Order order= new Order();
		order.setSize(Coffee.OVERWHELMMING);
		
		System.out.println("Size of coffee order is : "+ order.getSize());
		Coffee drink= Coffee.HUGE;
		System.out.println("Drink size is : "+drink);
		
		OrderWithEnum withEnum= new OrderWithEnum();
		withEnum.setCoffeeSize(OrderWithEnum.CoffeeSize.BIG);
		System.out.println("Coffee size with enum is : "+withEnum.getCoffeeSize());
		
		OrderWithEnumConstructor withEnumConstructor= new OrderWithEnumConstructor();
		withEnumConstructor.setSizeAndLid(EnumWithConstructor.HUGE);
		
		System.out.println("Coffee size with enum with connstructor is : "+withEnumConstructor.getSizeAndLid());
		System.out.println("Coffee size with enum with connstructor in ounces is : "+withEnumConstructor.getSizeAndLid().getSize());
		System.out.println("Coffee lid with enum with connstructor is : "+withEnumConstructor.getSizeAndLid().getLid());
		
		System.out.println("-----------Enum with specific class body--------------------------");
		OrderWithClassBody classBody= new OrderWithClassBody();
		classBody.setCoffeeSize(EnumWithClassBody.OVERWHELMMING);
		System.out.println("Coffee type for Enum with specific class body : "+classBody.getCoffeeSize());
		System.out.println("Coffee size for Enum with specific class body : "+classBody.getCoffeeSize().getSize());
		System.out.println("Coffee lid for Enum with specific class body : "+classBody.getCoffeeSize().getLid());
		
		System.out.println("-----------Enum with specific class body--------------------------");

	}

}
