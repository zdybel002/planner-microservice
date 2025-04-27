package ru.javabegin.micro.planner.plannertodo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import ru.javabegin.micro.planner.entity.Category;

@SpringBootApplication
@EnableDiscoveryClient
public class PlannerTodoApplication {


	public static void main(String[] args) {
		SpringApplication.run(PlannerTodoApplication.class, args);
	}

}
