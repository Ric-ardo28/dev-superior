package br.com.ricardo.devsuperior;

import br.com.ricardo.devsuperior.entity.Order;
import br.com.ricardo.devsuperior.service.OrderService;
import br.com.ricardo.devsuperior.service.ShippingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class DevSuperiorApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevSuperiorApplication.class, args);
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Codigo do pedido");
		Integer code = sc.nextInt();
		System.out.println("Valor basico");
		Double basic = sc.nextDouble();
		System.out.println("Desconto");
		Double discount = sc.nextDouble();

		Order order = new Order(code, basic, discount);

		OrderService orderService = new OrderService(new ShippingService());


		Double valorTotal = orderService.total(order);


		System.out.println("Pedido Codigo " + code);
		System.out.println("Valor Total " + valorTotal);

	}

}
