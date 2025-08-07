package com.ishan.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(StoreApplication.class, args);

		var userService = context.getBean(UserService.class);
		userService.registerUser(new User(1L, "mosh@codewithmosh.com", "12345", "Mosh"));
		userService.registerUser(new User(1L, "albert@codewithalbert.com", "12348", "Albert"));
//		var resource = context.getBean(HeavyResource.class);

//		var orderService = context.getBean(OrderService.class);
//		orderService.placeOrder();
//		var notificationService = context.getBean(NotificationService.class);
//		notificationService.send("hi, it's ishan");
	}



}
