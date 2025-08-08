package com.ishan.store;

import com.ishan.store.entities.Address;
import com.ishan.store.entities.Tag;
import com.ishan.store.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
//		ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
//		var user = new User(1L, "ishan", "ishan@email", "ishan123");
		var user = User.builder()
				.id(1L)
				.name("John")
				.password("john123")
				.email("john@gmail.com")
				.build();

		user.addTag("tag1");
		System.out.println(user);
	}



}
