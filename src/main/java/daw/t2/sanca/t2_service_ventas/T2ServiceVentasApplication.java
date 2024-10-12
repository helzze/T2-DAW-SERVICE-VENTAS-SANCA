package daw.t2.sanca.t2_service_ventas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class T2ServiceVentasApplication {

	public static void main(String[] args) {
		SpringApplication.run(T2ServiceVentasApplication.class, args);
	}

}
