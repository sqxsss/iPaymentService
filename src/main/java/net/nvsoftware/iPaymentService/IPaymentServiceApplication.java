package net.nvsoftware.iPaymentService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
public class IPaymentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(IPaymentServiceApplication.class, args);
	}

}
